package com.web.jobs.core.controller;

import java.util.List;

public interface EntityController<T> {

    void create(T model);
    void delete(T model);
    T findById(Class<T> clazz, Long id);
    List<T> getAll(Class<T> clazz);
}
