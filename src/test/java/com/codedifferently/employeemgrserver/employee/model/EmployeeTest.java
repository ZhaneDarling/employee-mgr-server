package com.codedifferently.employeemgrserver.employee.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTest {
    @Test
    public void constructorTest01(){
    Employee employee = new Employee("Demo","User","Demo@User.com");
    employee.setId(1);

    String expected = "1 Demo User Demo@User.com";
    String actual = employee.toString();
        Assertions.assertEquals(expected,actual);

    }
}
