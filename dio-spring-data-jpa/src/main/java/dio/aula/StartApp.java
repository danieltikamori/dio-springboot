package dio.aula;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component // Managed object of the Spring framework. Inversion of Control and injection of dependencies
public class StartApp implements CommandLineRunner {
    @Autowired // Injects dependencies. UserRepository
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        List<User> users = repository.findByNameContaining("GLEYSON");
        for(User u: users){
            System.out.println(u);
        }
    }
    private void insertUser(){
        User user = new User();
        user.setName("GABRIEL NUNES");
        user.setUsername("gabriel");
        user.setPassword("santos");
        repository.save(user); // save the user in the repository

        for(User u: repository.findAll()){ // list all users. Must use toString() at User class.
            System.out.println(u);
        }
    }
}
