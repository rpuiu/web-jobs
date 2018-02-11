package com.web.jobs.controllers;

public interface EntityController<T> {

    void create(T model);
    void delete(T model);
    T findById(Class<T> model, Integer id);

}
