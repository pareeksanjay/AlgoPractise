package com.test.demo.stack;
/*
Stack implementation , LIFO (Node entering last will be accessed first)
 */
import java.util.EmptyStackException;

public class StackImplementation<T> {
    private static class StackNode<T> {
        private T data;
        private StackNode<T> next;

        public StackNode(T data) {
            this.data = data;
        }
    }

    private StackNode<T> top;

    // pop remove top element a
    public T pop() {
        if (top == null) {
            throw new EmptyStackException();
        } else {
            T item = top.data;
            top = top.next;
            return item;
        }
    }

    //push
    void push(T item) {
        StackNode<T> stackNode = new StackNode<>(item);
        stackNode.next = top;
        top = stackNode;
    }

    //peek return top element
    public T peek() {
        if (top == null) {
            throw new EmptyStackException();
        } else {
            return top.data;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }


}
