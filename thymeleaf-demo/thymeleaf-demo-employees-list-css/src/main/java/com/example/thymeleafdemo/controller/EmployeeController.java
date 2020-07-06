package com.example.thymeleafdemo.controller;

import com.example.thymeleafdemo.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private List<Employee> employeeList;

    @PostConstruct
    private void loadData() {

        //create Employees
        Employee employee = new Employee(1, "Ivan", "Petrov", "ivan@gmail.com");
        Employee employee2 = new Employee(2, "Vasily", "Ivanov", "vasily@gmail.com");
        Employee employee3 = new Employee(3, "Misha", "Drozdov", "misha@gmail.com");

        //create the List

        employeeList = new ArrayList<>();

        //add to the List
        employeeList.add(employee);
        employeeList.add(employee2);
        employeeList.add(employee3);
    }

    @GetMapping("/list")
    public String listEmployee(Model model) {

        model.addAttribute("employeeList", employeeList);

        return "list-employees";
    }
}
