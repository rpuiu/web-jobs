package com.web.jobs.persistence.entity;

import com.web.jobs.persistence.model.HistoryBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "History")
public class HistoryEntity implements DbEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long userId;

    @Column
    private Long jobId;

    @Column
    private Long ratingId;

    @Column
    private Long employeeId;

    @Column
    private Double price;

    @Column
    private Long timestamp;

    public HistoryEntity() {
        // Default constructor
    }

    public HistoryEntity(HistoryBuilder hb) {
        this.userId = hb.getUserId();
        this.jobId = hb.getJobId();
        this.ratingId = hb.getRatingId();
        this.employeeId = hb.getEmployeeId();
        this.price = hb.getPrice();
        this.timestamp = hb.getTimestamp();
    }

    public Long getUserId() {
        return userId;
    }

    public Long getJobId() {
        return jobId;
    }

    public Long getRatingId() {
        return ratingId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public Double getPrice() {
        return price;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
