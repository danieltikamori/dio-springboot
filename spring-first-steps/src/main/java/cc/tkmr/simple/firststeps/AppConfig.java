package cc.tkmr.simple.firststeps;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

// Here are two common approaches:
//
//1. Component Scanning:
//Annotate the Calculator class with @Component, indicating it's a Spring component

@Configuration // Enable component scanning in your configuration class:
@ComponentScan("cc.tkmr.simple.firststeps") // Scan the package where Calculator is located
public class AppConfig {
}

// 2. Explicit Bean Definition:
//
//Create a bean of type Calculator manually in your configuration class:
//Java
//@Configuration
//public class AppConfig {
//    @Bean
//    public Calculator calculator() {
//        return new Calculator();
//    }
//}

//Key Points:
//
//Ensure Calculator is in a package scanned by Spring.
//If using a different configuration style, create the bean accordingly.
//If Calculator has dependencies, manage those as well.

//################################

//A configuration class in Spring Boot is a class that holds configuration information for your application. It's the core element where you define beans, which are managed objects used by your application. Here's a breakdown of its key aspects:
//
//Purpose:
//
//Centralized location for application configuration.
//Defines beans using the @Bean annotation.
//Often annotated with @Configuration to mark it as a configuration source.
//Structure:
//
//Can contain methods annotated with @Bean that return instances of the objects (beans) you need in your application.
//These methods typically handle any necessary configuration or initialization for the bean.
//You can use other Spring annotations like @Autowired within these methods to inject dependencies between beans.
//Benefits:
//
//Promotes clean separation of concerns by isolating configuration logic.
//Enables modularity by having multiple configuration classes for different parts of your application.
//Allows for easier management of application settings and dependencies.
//Example:
//
//Java
//@Configuration
//public class AppConfig {
//
//    @Bean
//    public MyService myService() {
//        MyService service = new MyService();
//        // Configure the service as needed
//        return service;
//    }
//
//    @Bean
//    public MyRepository myRepository() {
//        return new MyRepository();
//    }
//}
//
//In this example, the AppConfig class defines two beans: myService and myRepository. The methods use Spring annotations to manage their creation and configuration.
//
//Remember:
//
//Your application typically needs at least one configuration class.
//You can have multiple configuration classes for different parts of your application.
//Consider using @ComponentScan to automatically scan for classes annotated with @Component within specified packages, reducing the need for explicit bean definitions.