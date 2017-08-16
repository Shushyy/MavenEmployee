package com.phillipburns.repository;
import com.phillipburns.entity.Employee;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository


public class EmployeeRepo implements IEmployeeRepo {
    public List<Employee> getAll() {
        ArrayList<Employee> list = new ArrayList<Employee>();

        Employee e1 = new Employee();
        e1.setEmail("PeterJ25@hotmail.com");
        e1.setFirstName("Peter");
        e1.setLastName("Jones");
        e1.setShift("Sunday");
        e1.setId("1");
        

        Employee e2 = new Employee();
        e2.setId("2");
        e2.setFirstName("Julia");
        e2.setLastName("Smith");
        e2.setEmail("Js@gmail.com");
        e1.setShift("Saturday");
		
		Employee e3 = new Employee();
        e3.setId("3");
        e3.setFirstName("Nero");
        e3.setLastName("Zemmy");
        e3.setEmail("NZemmy@live.com");
        e1.setShift("Friday");
		
		Employee e4 = new Employee();
        e4.setId("4");
        e4.setFirstName("Ashley");
        e4.setLastName("Taylor");
        e4.setEmail("Ash96@gmail.com");
        e1.setShift("Wednesday");
		
		Employee e5 = new Employee();
        e5.setId("5");
        e5.setFirstName("Robert");
        e5.setLastName("Young");
        e5.setEmail("Rbk10@gmail.com");
        e1.setShift("Monday");
        
        list.add(e1);
        list.add(e2);
		list.add(e3);
        list.add(e4);
		list.add(e5);
        return list;

    }

    public Employee getByEmail(String email) {
        Employee e1 = new Employee();
        e1.setEmail("PeterJ25@hotmail.com");
        e1.setFirstName("Peter");
        e1.setLastName("Jones");
        e1.setId("1");
        return e1;
    }

    public Employee getOne(String id) {
        Employee e1 = new Employee();
        e1.setEmail("PeterJ25@hotmail.com");
        e1.setFirstName("Peter");
        e1.setLastName("Jones");
        e1.setId("1");
        return e1;
    }

    public Employee create(Employee employee) {
        return employee;
    }

    public Employee update(String id, Employee employee) {
        Employee e1 = new Employee();
        e1.setEmail("PeterJ25@hotmail.com");
        e1.setFirstName("Peter");
        e1.setLastName("Jones");
        e1.setId("1");
        return e1;
    }

	public Employee getShift(String shift) {
        Employee e1 = new Employee();
        e1.setEmail("PeterJ25@hotmail.com");
        e1.setFirstName("Peter");
        e1.setLastName("Jones");
        e1.setId("1");
        return e1;
    }

    public void delete(String id) {

    }



}
