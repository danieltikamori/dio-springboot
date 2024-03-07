package dio.aula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AulaSpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AulaSpringDataJpaApplication.class, args);
	}

}

// For testing purposes, may use H2 database, which is an in memory database. In our example, we are using PostgreSQL (which may cause errors)
// As we will create a persistence layer, use access control and create users, we need a model layer.
// First create a model package. In this case, create User class with its properties.
// Then create User class with its properties inside the model package

// Create a repository package. UserRepository class inside.
// UserRepository is an interface that extends JpaRepository, User Integer.

// We need initialize the application. Run a command of the application.
// To do so, we need to use CommandLineRunner.
// Create a StartApp class that implements CommandLineRunner. Implement method run and annotate @Component

// Connecting with PostgreSQL database for persistence:

// For testing purposes, use DBeaver
// pom.xml - check dependencies, add dependencies for database if necessary.
// At resources/application.properties add database properties.
// Run the database (through DBeaver) and configure





