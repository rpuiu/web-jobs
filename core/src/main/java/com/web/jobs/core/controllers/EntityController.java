package com.web.jobs.core.controllers;

import java.util.List;

public interface EntityController<T> {

    void create(T model);
    void update(T model);
    void delete(T model);
    T findById(Class<T> clazz, Long id);
    List<T> getAll(Class<T> clazz);
}
