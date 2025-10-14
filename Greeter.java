package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorld {
    
    public static void main(String[] args) {
        SpringApplication.run(HelloWorld.class, args);
    }
    
    @GetMapping("/")
    public String hello() {
        return "Hello from Azure Web App! Spring Boot is working! 🎉";
    }
    
    @GetMapping("/health")
    public String health() {
        return "Application is healthy!";
    }
}
