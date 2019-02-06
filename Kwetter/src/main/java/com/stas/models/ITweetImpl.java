package com.stas.models;

import com.stas.Interfaces.ITweet;

import java.util.ArrayList;

public class ITweetImpl implements ITweet {

    ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    @Override
    public void createTweet(String content, User user) {
        tweets.add(new Tweet(user, content, null));
    }

    @Override
    public ArrayList<Tweet> getAllTweets() {
        return tweets;
    }

    @Override
    public ArrayList<Tweet> getTweetsByUser(User user) {
        ArrayList<Tweet> userTweets = new ArrayList<Tweet>();
        for (Tweet t: tweets
             ) {
            if(t.getCreator().getId() == user.getId()){
                userTweets.add(t);
            }
        }
        return userTweets;
    }
}
