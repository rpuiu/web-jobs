package com.web.jobs.persistence.model;


import com.web.jobs.persistence.dto.HistoryDTO;

public class HistoryBuilder {

    private Long userId;
    private Long jobId;
    private Long ratingId;
    private Long employeeId;
    private Double price;
    private Long timestamp;

    public HistoryBuilder(){
        // Default constructor
    }

    public HistoryDTO build(){
        return new HistoryDTO(this);
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

    public HistoryBuilder withUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public HistoryBuilder withJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }

    public HistoryBuilder withRatingId(Long ratingId) {
        this.ratingId = ratingId;
        return this;
    }

    public HistoryBuilder withEmployeeId(Long employeeId) {
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
