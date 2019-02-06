package com.stas.controller;

import com.stas.Interfaces.ILogin;
import com.stas.config.Enums.SuccesState;
import com.stas.models.ILoginImpl;
import com.stas.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class LoginController {

    private ILogin iLogin = new ILoginImpl();
    @RequestMapping(value="/login")
    public ModelAndView loginPage(HttpServletResponse response, ModelMap modelMap) throws IOException {
        modelMap.addAttribute("user", new User());
        return new ModelAndView("login");
    }

    @RequestMapping(value = "/logUserIn", method = RequestMethod.POST)
    public String submit(@ModelAttribute("user") User user, BindingResult bindingResult, ModelMap modelMap) {
        if(iLogin.logIn(user.getUserName(), user.getPassword()) == SuccesState.SUCCESS) {
            modelMap.addAttribute("user", user);
            return "profile";
        }
        return "login";
    }
}
