package com.web.jobs.dao;

import com.web.jobs.model.HistoryBuilder;

import javax.persistence.*;

@Entity
public class History implements EntityModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private int userId;

    @Column
    private int jobId;

    @Column
    private int ratingId;

    @Column
    private int employeeId;

    @Column
    private Double price;

    @Column
    private Long timestamp;

    public History(){}

    public History(HistoryBuilder hb) {
        this.userId = hb.getUserId();
        this.jobId = hb.getJobId();
        this.ratingId = hb.getRatingId();
        this.employeeId = hb.getEmployeeId();
        this.price = hb.getPrice();
        this.timestamp = hb.getTimestamp();
    }

    public int getUserId() {
        return userId;
    }

    public int getJobId() {
        return jobId;
    }

    public int getRatingId() {
        return ratingId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public Double getPrice() {
        return price;
    }

    public Long getTimestamp() {
        return timestamp;
    }
}
