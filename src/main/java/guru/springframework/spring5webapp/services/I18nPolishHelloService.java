package guru.springframework.spring5webapp.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile("PL")
public class I18nPolishHelloService implements HelloService {
    @Override
    public String sayHello() {
        return "No siema po Polsku";
    }
}