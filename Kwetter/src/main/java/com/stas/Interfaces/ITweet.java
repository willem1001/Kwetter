package com.stas.Interfaces;

import com.stas.models.Tweet;
import com.stas.models.User;

import java.util.ArrayList;

public interface ITweet {
    void createTweet(String content, User user);
    ArrayList<Tweet> getAllTweets();
    ArrayList<Tweet> getTweetsByUser(User user);
}
