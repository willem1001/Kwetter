package com.stas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class StartController {
    @RequestMapping(value="/start")
    public ModelAndView start(HttpServletResponse response) throws IOException {
        return new ModelAndView("start");
    }

}
