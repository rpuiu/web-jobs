package com.web.jobs.persistence.entity;

import java.io.Serializable;

public interface DbEntity extends Serializable {

    Long getId();

    void setId(Long id);

}
