package com.web.jobs.session;

import com.web.jobs.dao.EntityModel;

public interface PersistenceDao {
    void insert(EntityModel entityModel);
    void delete(EntityModel entityModel);
}
