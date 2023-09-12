package com.interswitch.service.model;

public class Salary {
    public Salary(Long employeeId, Double amount, String date) {
        this.employeeId = employeeId;
        this.amount = amount;
        this.date = date;

    }
    public Salary(){ }

    private Long employeeId;
    private Double amount;

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    private Long departmentId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Long id;
    private String date;

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "employeeId=" + employeeId +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                '}';
    }
}
