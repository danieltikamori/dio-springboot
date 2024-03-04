package dio.springboot.app;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // Components will be scanned in the application. When use this? If we have access to the source code. Don´t have to use "new". Can inject (dependency injection) in any ecosystem of a spring boot container.
public class ConversorJson {
    @Autowired // Gson is an external implementation. So we must create a structure where it will be a Bean. 2 ways to create: inside spring boot class or create a class Beans (beans factory) in put every bean there.
    private Gson gson;
    public ViaCepResponse converter(String json ){
        ViaCepResponse response = gson.fromJson(json,ViaCepResponse.class);
        return response;
    }
}
