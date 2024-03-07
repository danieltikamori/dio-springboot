package dio.springboot.app;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

//https://www.concretepage.com/spring-boot/spring-boot-configurationproperties
//Spring Boot @ConfigurationProperties is annotation for externalized configuration. To inject property value from a property file to a class, we can add @ConfigurationProperties at a class level with stereotype annotations such as @Component or add @ConfigurationProperties to a @Bean method in a @Configuration class. @ConfigurationProperties is used to bind and validate external properties from property files such as .properties file. @ConfigurationProperties has following optional elements.
//ignoreInvalidFields: Boolean to ignore invalid fields.
//        ignoreUnknownFields: Boolean to ignore unknown fields.
//        prefix: The prefix of the properties to bind to this object.
//        value: The prefix of the properties to bind to this object.
//
//To inject values from property file using @ConfigurationProperties, our class must create setter methods of the class properties.

@Configuration
@ConfigurationProperties(prefix = "remetente") // Which configuration properties? Prefix "remetente"
public class Remetente {
    private String nome;
    private String email;
    private List<Long> telefones;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Long> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Long> telefones) {
        this.telefones = telefones;
    }
}
