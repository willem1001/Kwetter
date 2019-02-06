package com.stas.models;

import com.stas.Interfaces.IUser;

import java.util.ArrayList;

public class IUserImpl implements IUser {
    private User currentUser;
    private ArrayList<User> allUsers = new ArrayList<User>();

    @Override
    public void setCurrentUser(User user) {
        this.currentUser = user;
    }

    @Override
    public User getCurrentUser() {
        return this.currentUser;
    }
}
