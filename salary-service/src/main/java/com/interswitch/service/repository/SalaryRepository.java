package com.interswitch.service.repository;

import com.interswitch.service.model.Salary;

import java.util.ArrayList;
import java.util.List;

public class SalaryRepository {

    private List<Salary> salaries = new ArrayList<>();

    public Salary add(Salary salary){
        salary.setId((long) (salaries.size()+1));
        salaries.add(salary);
        return salary;
    }

    public List<Salary> findById(Long employeeId){
        return salaries.stream()
                .filter(t -> t.getEmployeeId().equals(employeeId))
                .toList();
    }

    public List<Salary> findAll(){
        return salaries;
    }

    public List<Salary> updateDepartmentId(Long employeeId, Long departmentId){
        salaries.stream()
                .filter(t -> t.getEmployeeId().equals(employeeId))
                .forEach(salary -> salary.setDepartmentId(departmentId));
        return salaries.stream()
                .filter(salary -> salary.getEmployeeId().equals(employeeId))
                .toList();

    }



}
