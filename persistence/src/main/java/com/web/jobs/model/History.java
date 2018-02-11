package com.web.jobs.model;

import javax.persistence.*;

@Entity
public class History {

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

    public History() {
    }

    public History(int userId, int jobId, int ratingId, int employeeId, Double price, Long timestamp) {
        this.userId = userId;
        this.jobId = jobId;
        this.ratingId = ratingId;
        this.employeeId = employeeId;
        this.price = price;
        this.timestamp = timestamp;
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
