package fawry.task.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fawry.task.demo.services.EmployeeService;
import fawry.task.demo.services.EmployeeServiceImpl;

@Configuration
public class AppConfig {
    @Bean
    EmployeeService employeeService() {
        return new EmployeeServiceImpl();
    }
}
