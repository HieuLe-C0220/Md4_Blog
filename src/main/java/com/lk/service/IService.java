package com.lk.service;

import java.util.List;

public interface IService<T> {
    List<T> findAll();
    T findOne(Long id);
    T save(T t);
    T delete(Long id);
}
