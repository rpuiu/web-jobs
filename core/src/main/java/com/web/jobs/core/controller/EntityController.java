package com.web.jobs.core.controller;

public interface EntityController<T> {

    void create(T model);
    void delete(T model);
    T findById(Class<T> clazz, Long id);
}
