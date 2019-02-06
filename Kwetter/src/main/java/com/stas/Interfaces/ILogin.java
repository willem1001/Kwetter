package com.stas.Interfaces;

import com.stas.config.Enums.SuccesState;

public interface ILogin {

    SuccesState logIn(String userName, String password);

}
