package com.phillipburns.entity;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String shift;
	
    public Employee() {

    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
	public void setShift(String shift) {
		this.shift = shift;
		
	}

    public String getId() {

        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
	
	public String getShift() {
        return shift;
    }


}
