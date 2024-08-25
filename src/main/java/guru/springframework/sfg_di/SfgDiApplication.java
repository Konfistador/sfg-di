package guru.springframework.sfg_di;

import guru.springframework.sfg_di.controllers.ConstructorInjectorController;
import guru.springframework.sfg_di.controllers.MyController;
import guru.springframework.sfg_di.controllers.PropertyInjectorController;
import guru.springframework.sfg_di.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("------ Property");

		PropertyInjectorController propertyInjectorController = (PropertyInjectorController) ctx.getBean("propertyInjectorController");

		System.out.println(propertyInjectorController.getGreeting());


		System.out.println("------ Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------ Constructor");

		ConstructorInjectorController constructorInjectorController = (ConstructorInjectorController) ctx.getBean("constructorInjectorController");
		System.out.println(constructorInjectorController.getGreeting());
	}

}
