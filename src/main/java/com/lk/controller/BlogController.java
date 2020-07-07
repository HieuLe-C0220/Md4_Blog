package com.lk.controller;

import com.lk.model.Blog;
import com.lk.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping("blog/{id}")
    public ModelAndView getBlogDetail(@PathVariable Long id) {
        ModelAndView mv = new ModelAndView("/views/blog");
        mv.addObject("blog",blogService.findOne(id));
        return mv;
    }
    @GetMapping("/create")
    public ModelAndView getForm(){
        ModelAndView mv = new ModelAndView("views/createBlog");
        mv.addObject("blog",new Blog());
        return mv;
    }
    @PostMapping("/save-Blog")
    public String save(@ModelAttribute("blog") Blog blog) {
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("views/createBlog");
        return "redirect:/";
    }
    @GetMapping("/blog/delete-Blog/{id}")
    public String deleteBlog(@PathVariable Long id) {
        blogService.delete(id);
        return "redirect:/";
    }
    @GetMapping("blog/edit/{id}")
    public ModelAndView getEditBlog(@PathVariable Long id) {
        Blog blog = blogService.findOne(id);
        ModelAndView modelAndView = new ModelAndView("views/createBlog");
        modelAndView.addObject("blog", blog);
        return modelAndView;
    }
}
