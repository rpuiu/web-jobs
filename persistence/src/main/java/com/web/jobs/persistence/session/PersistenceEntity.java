package com.web.jobs.persistence.session;

import com.web.jobs.persistence.entity.DbEntity;

import java.util.List;

public interface PersistenceEntity {

    void insert(DbEntity dbEntity);
    void delete(DbEntity dbEntity);
    Object findById(Class clazz, Long id);
    List findAll(Class clazz);

}
