package guru.springframework.sfg_di.controllers;

import guru.springframework.sfg_di.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectorController {

    private final GreetingService greetingService;

    public ConstructorInjectorController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
