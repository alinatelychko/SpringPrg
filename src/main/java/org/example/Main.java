package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.ArrayList;
import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee employee1 = context.getBean("employee1", Employee.class);
        Employee employee2 = context.getBean("employee2", Employee.class);
        Employee employee3 = context.getBean("employee3", Employee.class);
        Employee employee4 = context.getBean("employee4", Employee.class);

        List<Employee> employees = List.of(employee1, employee2, employee3, employee4);

        Employee youngest = employees.get(0);

        for (Employee employee : employees) {
            if (employee.getBirthYear() > youngest.getBirthYear()) {
                youngest = employee;
            }
        }
        System.out.println("Самый молодой работник: " + youngest);
        }
}
