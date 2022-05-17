package com.test.demo.systemdesign;

import java.util.*;

class Twitter {
    private int userId;
    private int tweetId;
    private int count = 0;

    private Map<Integer, List<int[]>> newTweet;

    private Map<Integer, Set<Integer>> followCheck;

    /**
     * Initialize your data structure here.
     */
    public Twitter() {
        newTweet = new HashMap<>();
        followCheck = new HashMap<>();
    }

    /**
     * Compose a new tweet.
     */
    public void postTweet(int userId, int tweetId) {
        count++;
        List<int[]> list = newTweet.getOrDefault(userId, Collections.emptyList());
        list.add(new int[]{count, tweetId});
        newTweet.put(userId, list);
    }

    /**
     * Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent.
     */
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> tweetIds = new ArrayList<>();
        Queue<int[]> tweetList = null;
        if (newTweet.containsKey(userId)) {
            tweetList = new ArrayDeque<>(newTweet.get(userId));
        }

        while (!tweetList.isEmpty() && tweetIds.size() <= 10) {
            int[] a = tweetList.poll();
            tweetIds.add(a[1]);
        }
        return tweetIds;
    }

    /**
     * Follower follows a followee. If the operation is invalid, it should be a no-op.
     */
    public void follow(int followerId, int followeeId) {
        Set<Integer> set = followCheck.getOrDefault(followerId, Collections.emptySet());
        set.add(followeeId);
        followCheck.put(followerId, set);
    }

    /**
     * Follower unfollows a followee. If the operation is invalid, it should be a no-op.
     */
    public void unfollow(int followerId, int followeeId) {
        Set<Integer> set = followCheck.getOrDefault(followerId, Collections.emptySet());
        set.remove(followeeId);
        followCheck.put(followerId, set);
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */