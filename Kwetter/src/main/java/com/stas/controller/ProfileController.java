package com.stas.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProfileController {
    @RequestMapping(value="/profile")
    public ModelAndView test(HttpServletResponse response, ModelMap modelMap) throws IOException {

        return new ModelAndView("profile");
    }
}
