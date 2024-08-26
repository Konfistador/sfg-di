package guru.springframework.sfg_di.services;

import org.springframework.stereotype.Service;

@Service("constructorGreetingService")
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
