package com.interswitch.service.controller;
import com.interswitch.service.client.DepartmentClient;
import com.interswitch.service.model.Department;
import com.interswitch.service.model.Salary;
import com.interswitch.service.repository.SalaryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SalaryController {
    private static final Logger LOGGER = LoggerFactory.getLogger(SalaryController.class);
    SalaryRepository salaryRepository;
    DepartmentClient departmentClient;

    public SalaryController(SalaryRepository salaryRepository, DepartmentClient departmentClient) {
        this.salaryRepository = salaryRepository;
        this.departmentClient = departmentClient;
    }

    @PostMapping("/")
    public Salary add(@RequestBody Salary salary) {
        LOGGER.info("Salary add: {}", salary);
        return salaryRepository.add(salary);
    }

    @GetMapping("/{employeeId}")
    public List<Salary> findById(@PathVariable("employeeId") Long employeeId) {
        LOGGER.info("Salary find: id={}", employeeId);
        return salaryRepository.findById(employeeId);
    }

    @GetMapping("/")
    public List<Salary> findAll() {
        LOGGER.info("Salary Find()");
        return salaryRepository.findAll();
    }

    @PutMapping("/{employeeId}")
    public List<Salary> updateDepartmentIDByEmployeeId(@PathVariable("employeeId") Long employeeId, @RequestBody Department departmentId) {
        LOGGER.info("Organization find: id={}", employeeId);
        return salaryRepository.updateDepartmentId(employeeId, departmentClient.findId(departmentId.getId()).getId());
    }
}
