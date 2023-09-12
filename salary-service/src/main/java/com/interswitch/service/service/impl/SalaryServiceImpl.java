package com.interswitch.service.service.impl;

import com.interswitch.service.model.Salary;
import com.interswitch.service.service.SalaryService;

import java.util.ArrayList;
import java.util.List;

public class SalaryServiceImpl implements SalaryService {

    List<Salary> salaries = new ArrayList<>();

    @Override
    public Salary add(Salary salary) {
        salary.setId((long) (salaries.size()+1));
        salaries.add(salary);
        return salary;
    }
    @Override
    public List<Salary> findById(long employeeId) {
        return salaries.stream()
                .filter(t -> t.getEmployeeId().equals(employeeId))
                .toList();

    }
    @Override
    public List<Salary> findAll() {
        return salaries;
    }
}
