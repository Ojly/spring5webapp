package guru.springframework.spring5webapp.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    public HelloController() {
        System.out.println("Hello controller created");
    }

    public String sayHello() {
        System.out.println("Hello in sayHello!");
        return "Hello returned from sayHello!";
    }
}
