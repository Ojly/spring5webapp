package guru.springframework.spring5webapp;

import guru.springframework.spring5webapp.controllers.HelloController;
import guru.springframework.spring5webapp.controllers.I18nController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5webappApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring5webappApplication.class, args);

		HelloController helloController = (HelloController) ctx.getBean("helloController");

		String greeting = helloController.sayHello();

		System.out.println(greeting);

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());
	}
}
