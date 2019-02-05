package com.stas.models;

import java.util.Date;
import java.util.List;

public class Tweet {
    private String content;
    private User creator;
    private Date creationDate;
    private Tweet repliedOnTweet;
    private List<User> likes;
    private List<Tweet> reactions;

    public Tweet(User user, String content, Tweet repliedOnTweet) {
        this.creator = user;
        this.content = content;
        this.creationDate = new Date();
        this.repliedOnTweet = repliedOnTweet;
        user.addTweet(this);
    }

    public void addLike(User user) {
        if(user != creator) {
            likes.add(user);
        }
    }

    public void addReply(User user, String content) {
        Tweet tweet = new Tweet(user, content, this);
        this.reactions.add(tweet);
    }

    public String getContent() {
        return content;
    }

    public User getCreator() {
        return creator;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Tweet getRepliedOnTweet() {
        return repliedOnTweet;
    }

    public List<User> getLikes() {
        return likes;
    }

    public List<Tweet> getReactions() {
        return reactions;
    }
}
