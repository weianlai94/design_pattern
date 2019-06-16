package com.weianlai.design.pattern.structural.flyweight;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class Manager implements Employee {
    @Override
    public void report() {
        System.out.println(reportContet);
    }

    private String department;
    private String reportContet;

    public Manager(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getReportContet() {
        return reportContet;
    }

    public void setReportContet(String reportContet) {
        this.reportContet = reportContet;
    }
}
