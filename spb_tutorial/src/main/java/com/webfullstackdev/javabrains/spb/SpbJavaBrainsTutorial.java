package com.webfullstackdev.javabrains.spb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
// to make this class- spring application has Rest controller . we can point into every nmodule controller repeaat at top @Restcontroller
//@RestController
public class SpbJavaBrainsTutorial {
    public static void main(String[] args){
            SpringApplication.run(SpbJavaBrainsTutorial.class, args);
    }

    //    @RequestMapping("/")
    //    public String RestApi(){
    //        return "Hello Maven Spring Boot Rest API";
    //    }
}
