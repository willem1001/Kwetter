package com.stas.controller;

import com.stas.Interfaces.ITweet;
import com.stas.Interfaces.IUser;
import com.stas.models.ITweetImpl;
import com.stas.models.Tweet;
import com.stas.models.User;
import com.stas.models.IUserImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
public class ProfileController {

    private IUser iUser = new IUserImpl();
    private ITweet iTweet = new ITweetImpl();

    @RequestMapping(value="/profile")
    public ModelAndView test(HttpServletRequest request, ModelMap modelMap) throws IOException {
        User currentUser = (User) request.getAttribute("user");
        iUser.setCurrentUser(currentUser);
        modelMap.addAttribute("user", iUser.getCurrentUser());
        return new ModelAndView("profile");
    }

    @RequestMapping(value = "/tweet")
    public void createTweet(@ModelAttribute("tweet") Tweet tweet, BindingResult bindingResult, ModelMap modelMap){
        iTweet.createTweet(tweet.getContent(), iUser.getCurrentUser());
    }
}
