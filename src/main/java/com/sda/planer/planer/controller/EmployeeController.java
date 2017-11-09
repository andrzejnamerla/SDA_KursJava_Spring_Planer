package com.sda.planer.planer.controller;

import com.sda.planer.planer.model.Employee;
import com.sda.planer.planer.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public ModelAndView allEmployees(){
        ModelAndView modelAndView = new ModelAndView("allEmployees");
        modelAndView.addObject("employees", employeeService.getAll());
        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView employees(Long id){
        ModelAndView modelAndView = new ModelAndView("allEmployees");
        modelAndView.addObject("employees",employeeService.get(id));
        return modelAndView;
    }

    @PostMapping
    public String saveUser(@ModelAttribute Employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:/employees";
    }

}
