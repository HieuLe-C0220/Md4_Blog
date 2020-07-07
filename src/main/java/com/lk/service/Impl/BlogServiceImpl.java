package com.lk.service.Impl;

import com.lk.model.Blog;
import com.lk.repository.BlogRepository;
import com.lk.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;
    @Override
    public List<Blog> findAll() {
        return (List<Blog>) blogRepository.findAll();
    }

    @Override
    public Blog findOne(Long id) {
        return blogRepository.findOne(id);
    }

    @Override
    public Blog save(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public Blog delete(Long id) {
        Blog blog = blogRepository.findOne(id);
        blogRepository.delete(id);
        return blog;
    }
}
