package dio.aula.model;

import javax.persistence.*;

@Entity // JPA entity must be used.
@Table(name = "tab_user") // Explicit table name, necessary as errors may happen without explicit naming (corrects error messages)
public class User {
    @Id // In order to be a Entity, Id attibute must be created and unique
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Automatically generated, unique, with respective strategy
    @Column(name = "user_id") // In the table name, it will be different from id
    private Integer id;
    @Column(length = 50, nullable = false) // Define max length of 50 characters and cannot be null.
    private String name;
    @Column(length = 20, nullable = false) // Define max length of 20 characters and cannot be null.
    private String username;
    @Column(length = 100, nullable = false) // Define max length of 100 characters and cannot be null.
    private String password;

    // Create getters and setters and create repository package with UserRepository interface.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override // To be able to show the users list
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
