package com.lk.controller;

import com.lk.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @Autowired
    private BlogService blogService;
    @GetMapping("")
    public ModelAndView getHomePage() {
        ModelAndView mv = new ModelAndView("views/index");
        mv.addObject("blogs",blogService.findAll());
        return mv;
    }
}
