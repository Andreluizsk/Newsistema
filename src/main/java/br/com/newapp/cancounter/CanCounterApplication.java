package br.com.newapp.cancounter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.persistence.Access;

@SpringBootApplication
@ComponentScan(basePackages = {})
@RestController

public class CanCounterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CanCounterApplication.class, args);
    }

}
