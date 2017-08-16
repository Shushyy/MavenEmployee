package com.phillipburns.controller;

import com.phillipburns.entity.Employee;
import com.phillipburns.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {

    @Autowired
    private IService service;

    @GetMapping
    public List<Employee> findAll(){


        return service.getAll();
    }


    @GetMapping("/{id}")
    public Employee findOne(@PathVariable("id") String id){


        return service.getOne("1");
    }

    @PostMapping
    public Employee create(@RequestBody Employee employee){

        return employee;
    }

    @PutMapping("/{id}")
    public Employee update(@PathVariable String id, @RequestBody Employee employee){
        return service.update("1",new Employee());
    }

    public void delete(@PathVariable String id){

    }




}
