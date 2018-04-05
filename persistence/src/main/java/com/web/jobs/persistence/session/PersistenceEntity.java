package com.web.jobs.persistence.session;

import com.web.jobs.persistence.entity.DbEntity;

public interface PersistenceEntity {

    void insert(DbEntity dbEntity);
    void delete(DbEntity dbEntity);

}
