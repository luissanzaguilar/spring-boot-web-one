package lsz.training.web.one.webone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("lsz.training.web.one.controller")
public class WebOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebOneApplication.class, args);
	}

}
