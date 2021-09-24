package com.mindex.challenge.data;

import java.util.List;
import java.util.Objects;

public class ReportStructure {
    private Employee employee;
    private int numberOfReports;

    public ReportStructure(Employee employee, int numberOfReports) {
        this.employee = employee;
        this.numberOfReports = numberOfReports;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getNumberOfReports() {
        return this.numberOfReports;
    }

    public void setNumberOfReports(int numberOfReports) {
        this.numberOfReports = numberOfReports;
    }

    public ReportStructure employee(Employee employee) {
        this.employee = employee;
        return this;
    }

    public ReportStructure numberOfReports(int numberOfReports) {
        this.numberOfReports = numberOfReports;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ReportStructure)) {
            return false;
        }
        ReportStructure reportingStructure = (ReportStructure) o;
        return Objects.equals(employee, reportingStructure.employee)
                && numberOfReports == reportingStructure.numberOfReports;
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee, numberOfReports);
    }

    @Override
    public String toString() {
        return "{" +
                " employee='" + getEmployee() + "'" +
                ", numberOfReports='" + getNumberOfReports() + "'" +
                "}";
    }
}
