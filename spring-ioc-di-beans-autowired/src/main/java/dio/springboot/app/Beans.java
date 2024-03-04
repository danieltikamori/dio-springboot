package dio.springboot.app;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Some spring versions may require this Configuration annotation.
public class Beans {
    @Bean
    public Gson gson(){
        return new Gson();
    }
}
