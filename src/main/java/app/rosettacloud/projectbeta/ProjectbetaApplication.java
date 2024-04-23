package app.rosettacloud.projectbeta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.rosettacloud.projectbeta.controllers.MyController;

@SpringBootApplication
public class ProjectbetaApplication {

	public static void main(String[] args) {
		// ApplicationContext ctx = 
		SpringApplication.run(ProjectbetaApplication.class, args);
		// MyController controller = ctx.getBean(MyController.class);
		// System.out.println("In Main Method");

		// System.out.println(controller.sayHello());
	}

}
