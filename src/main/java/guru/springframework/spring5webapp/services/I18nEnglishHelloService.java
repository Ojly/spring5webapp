package guru.springframework.spring5webapp.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile({"EN", "default"})
public class I18nEnglishHelloService implements HelloService {
    @Override
    public String sayHello() {
        return "Hello in English";
    }
}
