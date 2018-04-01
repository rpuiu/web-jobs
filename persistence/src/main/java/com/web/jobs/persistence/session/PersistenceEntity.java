package com.web.jobs.persistence.session;

import com.web.jobs.persistence.entity.Entity;

public interface PersistenceEntity {

    void insert(Entity entity);
    void delete(Entity entity);

}
