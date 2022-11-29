package org.App;

import org.classes.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
    }
}
