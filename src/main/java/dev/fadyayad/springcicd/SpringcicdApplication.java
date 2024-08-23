package dev.fadyayad.springcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringcicdApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcicdApplication.class, args);
    }

}

@RestController
class GreetingsController {
    @GetMapping
    public String sayHi(){
        return "Hi dad 👋";
    }
}
