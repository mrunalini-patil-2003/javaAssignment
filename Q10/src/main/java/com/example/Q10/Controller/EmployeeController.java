package com.example.Q10.Controller;

import com.example.Q10.Model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return Arrays.asList(
                new Employee(1, "Alice", "HR"),
                new Employee(2, "Bob", "Finance"),
                new Employee(3, "Charlie", "IT")
        );
    }
}

