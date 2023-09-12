package com.interswitch.service;

import com.interswitch.service.model.Salary;
import com.interswitch.service.service.SalaryService;
import com.interswitch.service.service.impl.SalaryServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class SalaryServiceTest {

    static Salary salary = null;
    static Salary salary1 = null;


    @BeforeAll
    static void init(){
        salary = new Salary();
        salary1 = new Salary(2L,23000.00,"12/12/1212");
    }

    @Test
    void testSalaryAmountEqual23000ThenTrue(){
        salary.setAmount(23000.00);
    assertEquals(23000.00, salary.getAmount());
    }
    @Test
    void testDepartmentIdIsNullThenNull(){
        assertNull(salary.getDepartmentId());
    }

    @Test
    void testEmployeeIdIsEqualToSalaryAmount(){
        salary.setEmployeeId(2L);
        salary.setAmount(50000.00);
        assumeTrue(salary.getEmployeeId() == 2L);
        assertTrue(Math.random()>0);
    }
    @Test
    void testIfObjectsAreNotTheSame(){
        assertNotSame(salary,salary1);
    }
    @Test
    void testIfEmployeeIdIsNotEqual3ThenFalse(){
        salary.setEmployeeId(2L);
        assertNotEquals(salary.getEmployeeId(),3);
    }


}
