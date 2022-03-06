package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.services.HelloService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {
    private final HelloService helloService;

    public I18nController(@Qualifier("i18nService") HelloService helloService) {
        this.helloService = helloService;
    }

    public String sayHello() {
        return helloService.sayHello();
    }
}
