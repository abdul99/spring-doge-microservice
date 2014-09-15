package doge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableEurekaClient
public class DogeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DogeApplication.class, args);
    }
}

@RestController
class DogeRestController {
    @RequestMapping("/doge-message")
    String doge() {
        return "doge!";
    }
}