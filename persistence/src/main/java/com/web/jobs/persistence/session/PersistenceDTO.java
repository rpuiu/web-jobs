package com.web.jobs.persistence.session;

import com.web.jobs.persistence.dto.EntityDTO;

public interface PersistenceDTO {

    void insert(EntityDTO entityDTO);
    void delete(EntityDTO entityDTO);

}
