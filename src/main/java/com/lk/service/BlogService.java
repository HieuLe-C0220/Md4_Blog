package com.lk.service;

import com.lk.model.Account;
import com.lk.model.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();
    Blog findOne(Long id);
    Blog save(Blog blog);
    Blog delete(Long id);
}
