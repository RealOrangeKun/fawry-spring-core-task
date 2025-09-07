package fawry.task.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import fawry.task.demo.config.AppConfig;
import fawry.task.demo.models.Employee;
import fawry.task.demo.services.EmployeeService;

public class DemoApplication {

    public static void main(String[] args) {
        try (AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            EmployeeService service = context.getBean(EmployeeService.class);

            Employee e1 = new Employee("Alice", "Engineer");
            Employee e2 = new Employee("Bob", "Manager");
            service.create(e1);
            service.create(e2);

            System.out.println("All employees: " + service.getAll());
			System.out.println();

            e1.setPosition("Senior Engineer");
            service.update(e1.getId(), e1);
            System.out.println("After update: " + service.getAll());
			System.out.println();


            service.delete(e2.getId());
            System.out.println("After delete: " + service.getAll());
        }
    }

}
