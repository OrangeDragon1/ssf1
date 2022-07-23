package vttp.ssf1.ssf1;

import java.util.Collections;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@SpringBootApplication
public class Ssf1Application {

	public static void main(String[] args) {
		// SpringApplication.run(Ssf1Application.class, args);
		SpringApplication app = new SpringApplication(Ssf1Application.class);
		String port = "8080";
		ApplicationArguments cliOpts = new DefaultApplicationArguments(args);

		if (cliOpts.containsOption("port")) {
			port = cliOpts.getOptionValues("port").get(0);
		}

		app.setDefaultProperties(Collections.singletonMap("server.port", port));
		app.run(args);

		if (port.equals("8080")) {
			System.out.println("Application started and running on default port: 8080");
		} else {
			System.out.printf("Application started and running on specified port: %s\n", port);
		}
	}

	@Bean
	public CommonsRequestLoggingFilter log() {
		CommonsRequestLoggingFilter logger = new CommonsRequestLoggingFilter();
		logger.setIncludeClientInfo(true);
		logger.setIncludeQueryString(true);
		return logger;
	}

}
