package com.java.ds.TaskAssignByMe;

public class Employ {
    private int empId;
    private String empFirstName;
    private String empLastName;
    private String empcity;
    private double empSalary;
    private String empEmailId;
    private int empPincode;

    public Employ(int empId, String empFirstName, String empLastName, String empcity, double empSalary,
            String empEmailId, int empPincode) {
        this.empId = empId;
        this.empFirstName = empFirstName;
        this.empLastName = empLastName;
        this.empcity = empcity;
        this.empSalary = empSalary;
        this.empEmailId = empEmailId;
        this.empPincode = empPincode;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public String getEmpcity() {
        return empcity;
    }

    public void setEmpcity(String empcity) {
        this.empcity = empcity;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpEmailId() {
        return empEmailId;
    }

    public void setEmpEmailId(String empEmailId) {
        this.empEmailId = empEmailId;
    }

    public int getEmpPincode() {
        return empPincode;
    }

    public void setEmpPincode(int empPincode) {
        this.empPincode = empPincode;
    }

}
