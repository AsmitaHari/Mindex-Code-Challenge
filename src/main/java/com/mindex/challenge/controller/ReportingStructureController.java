package com.mindex.challenge.controller;

import com.mindex.challenge.data.Employee;
import com.mindex.challenge.data.ReportStructure;
import com.mindex.challenge.service.EmployeeService;
import com.mindex.challenge.service.ReportStructureService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReportingStructureController {
    private static final Logger LOG = LoggerFactory.getLogger(ReportingStructureController.class);
    @Autowired
    private ReportStructureService ReportingStructureService;

    @GetMapping("/reportingStructure/{employeeId}")
    public ReportStructure read(@PathVariable String employeeId) {
        LOG.debug("Received reportingStructure read request for employeeId [{}]", employeeId);

        return ReportingStructureService.read(employeeId);
    }
}
