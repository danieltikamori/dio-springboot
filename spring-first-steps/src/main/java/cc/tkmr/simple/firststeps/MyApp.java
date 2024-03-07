package cc.tkmr.simple.firststeps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component // Creates a component avoiding the creation of a new instance of the default implementation
public class MyApp implements CommandLineRunner { //implements CommandLineRunner {} used to avoid "new Objects"
    @Autowired // Creates a new instance of the default implementation
    private Calculator myCalculator;
    @Override
    public void run(String... args) throws Exception {

        System.out.println("The result is: " + myCalculator.add(3, 5));
    }
}

// @Autowired

//Field injection is not recommended!
//
//You're absolutely right, field injection is generally not recommended in Spring Boot and other dependency injection frameworks. Here's why:
//
//Drawbacks of Field Injection:
//
//Reduced Testability: You cannot easily mock or substitute dependencies during unit testing since the dependencies are directly injected into fields at runtime.
//Tight Coupling: Classes using field injection become tightly coupled to the specific dependency injection container, making them less reusable across different environments.
//Immutability Issues: Creating immutable objects becomes difficult as the fields are modified from outside the constructor.
//Visibility Concerns: Making fields public for injection exposes them to unintended modification.
//Preferred Alternatives:
//
//Constructor Injection: Dependencies are passed explicitly through the constructor, promoting testability and loose coupling.
//Setter Injection: Dependencies are injected through setter methods, offering more control over initialization logic.

//Example (Constructor Injection):
//
//Java
//public class MyApp {
//
//    private final Calculator calculator;
//
//    public MyApp(Calculator calculator) {
//        this.calculator = calculator;
//    }
//
//    // ... use the calculator
//}
//Use o código com cuidado.
//How to Avoid Field Injection:
//
//Refactor existing code: Replace field injection with constructor or setter injection.
//Configure Spring to prefer constructor or setter injection by default: Use annotations like @Setter(onMethod = @__({@Autowired})).
//Use static code analysis tools: These tools can identify and warn about field injection usage.
//By avoiding field injection, you can enhance your code's maintainability, testability, and flexibility.