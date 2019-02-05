package com.stas.controller;

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
    @RequestMapping(value="/loginPage")
    public ModelAndView loginPage(HttpServletResponse response, ModelMap modelMap) throws IOException {
        modelMap.addAttribute("user", new User());
        return new ModelAndView("login");
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String submit(@ModelAttribute("user") User user, BindingResult bindingResult, ModelMap modelMap) {
        modelMap.addAttribute("user", user);
        return "profile";
    }
}
