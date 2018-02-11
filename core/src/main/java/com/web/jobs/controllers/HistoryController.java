package com.web.jobs.controllers;

import com.web.jobs.dao.History;
import com.web.jobs.session.PersistenceManagement;

public class HistoryController implements EntityController<History> {

    private PersistenceManagement persistenceManagement;

    @Override
    public void create(History model) {
        persistenceManagement.insert(model);
    }

    @Override
    public void delete(History model) {
        persistenceManagement.delete(model);
    }

    @Override
    public History findById(Class<History> clazz, Integer id) {
        return (History) persistenceManagement.findById(clazz, id);
    }
}
