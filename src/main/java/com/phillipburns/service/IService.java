package com.phillipburns.service;

import com.phillipburns.entity.Employee;

import java.util.List;

public interface IService {

    public List<Employee> getAll();

    public Employee getOne(String id);

    public Employee update(String id, Employee employee);

    public Employee create(Employee employee);

    public void delete(String id);


}
