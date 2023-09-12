package com.interswitch.service.service;

import com.interswitch.service.model.Salary;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface SalaryService {

    Salary add(Salary salary);

    List<Salary> findById(long employeeId);

    List<Salary> findAll();

}
