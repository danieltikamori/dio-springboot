package cc.tkmr.simple.firststeps;

import org.springframework.stereotype.Component;

@Component // Annotate the Calculator class with @Component, indicating it's a Spring component
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}
