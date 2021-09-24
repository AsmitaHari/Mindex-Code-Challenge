package com.mindex.challenge.service.impl;

import com.mindex.challenge.dao.EmployeeRepository;
import com.mindex.challenge.data.Employee;
import com.mindex.challenge.data.ReportStructure;
import com.mindex.challenge.service.EmployeeService;
import com.mindex.challenge.service.ReportStructureService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ReportServiceImpl implements ReportStructureService {

    private static final Logger LOG = LoggerFactory.getLogger(ReportServiceImpl.class);

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ReportStructureService reportingStructureService;

    @Override
    public ReportStructure read(String employeeId) {
        LOG.debug("Reading reportingStructure with employeeId: [{}]", employeeId);

        Employee employee = employeeService.read(employeeId);
        int totalReports = employeeService.getNumberOfReports(employeeId);

        ReportStructure reportingStructure = new ReportStructure(employee, totalReports);

        return reportingStructure;
    }
}
