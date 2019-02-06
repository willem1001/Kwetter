package com.stas.Interfaces;

import com.stas.models.User;

public interface IUser {
    void setCurrentUser(User user);
    User getCurrentUser();
}
