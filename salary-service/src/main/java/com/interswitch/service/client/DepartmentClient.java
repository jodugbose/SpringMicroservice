package com.interswitch.service.client;

import com.interswitch.service.model.Department;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "department-service")
public interface DepartmentClient {

    @GetMapping("/{id}")
    public Department findId(@PathVariable("id") Long id);
}
