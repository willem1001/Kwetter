package com.stas.models;

import java.util.List;

public class User {

    private String picturePath;
    private String userName;
    private String passWord;
    private String bio;
    private String location;
    private String website;
    private Role role;
    private List<User> followers;
    private List<User> following;
    private List<Tweet> tweets;

    public User() { }

    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }


    public void addFollower(User user) {
        followers.add(user);
    }

    public void addFollowing(User user) {
        followers.add(user);
    }

    public void addTweet(Tweet tweet) {
        tweets.add(tweet);
    }

    public void changeUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<User> getFollowers() {
        return followers;
    }

    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }

    public List<User> getFollowing() {
        return following;
    }

    public void setFollowing(List<User> following) {
        this.following = following;
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    public void setTweets(List<Tweet> tweets) {
        this.tweets = tweets;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }
}
