package com.mindex.challenge.service;

import com.mindex.challenge.data.Employee;
import com.mindex.challenge.data.ReportStructure;

public interface ReportStructureService {
    ReportStructure read(String employeeId);
}
