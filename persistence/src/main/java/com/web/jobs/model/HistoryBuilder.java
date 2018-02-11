package com.web.jobs.model;

import com.web.jobs.dao.History;

public class HistoryBuilder {

    private int userId;
    private int jobId;
    private int ratingId;
    private int employeeId;
    private Double price;
    private Long timestamp;

    public HistoryBuilder(){}

    public History build(){
        return new History(this);
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

    public HistoryBuilder withUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public HistoryBuilder withJobId(int jobId) {
        this.jobId = jobId;
        return this;
    }

    public HistoryBuilder withRatingId(int ratingId) {
        this.ratingId = ratingId;
        return this;
    }

    public HistoryBuilder withEmployeeId(int employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    public HistoryBuilder withPrice(Double price) {
        this.price = price;
        return this;
    }

    public HistoryBuilder withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
}
