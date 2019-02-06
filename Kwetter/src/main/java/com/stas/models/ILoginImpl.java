package com.stas.models;

import com.stas.Interfaces.ILogin;
import com.stas.config.Enums.SuccesState;

public class ILoginImpl implements ILogin {

    private User[] users = {new User("Willem", "test")};

    @Override
    public SuccesState logIn(String userName, String password) {
        for (User u: users
                ) {
            if(u.getUserName().equals(userName) && u.getPassword().equals(password))
            {
                return SuccesState.SUCCESS;
            }
        }
        return SuccesState.FAILED;
    }
}
