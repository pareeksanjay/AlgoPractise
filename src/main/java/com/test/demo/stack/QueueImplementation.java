package com.test.demo.stack;

import java.util.NoSuchElementException;

/*
Queue implementation FIFO
 */
public class QueueImplementation<T> {
    private static class QueueNode<T> {
        private T data;
        private QueueNode<T> next; //reference to the next node

        public QueueNode(T data) {
            this.data = data;
        }

    }

    private QueueNode<T> first;

    private QueueNode<T> last;


    //Add an item at the end of the list
    public void add(T item) {
        QueueNode<T> queueNode = new QueueNode<>(item);

        if (last != null) {
            last.next = queueNode;
        }
        last = queueNode;

        if (first == null) {
            first = last;
        }
    }

    //Remove the first element of the list
    private T remove() {
        if (first == null) {
            throw new NoSuchElementException();
        }

        T data = first.data;
        first = first.next;

        if (first == null) { // after removing only element , if the queue become empty
            last = null;
        }
        return data;
    }

    // return the top element of the list
    public T peek() {
        if (first == null) {
            throw new NoSuchElementException();
        } else {
            return first.data;
        }
    }

    //check empty queue

    public boolean isEmpty() {
        return first == null;
    }

}
