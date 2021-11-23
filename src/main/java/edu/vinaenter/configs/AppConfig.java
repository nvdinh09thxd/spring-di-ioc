package edu.vinaenter.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import edu.vinaenter.models.User;

@Configuration
@ComponentScans({ @ComponentScan(value = "edu.vinaenter.*") })
public class AppConfig {
	@Bean("viewResolver")
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/pages/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

	@Bean("user12")
	public User user123() {
		User user12 = new User();
		user12.setId(1);
		user12.setName("NVDinh12");
		return user12;
	}

	@Bean("user45")
	public User user456() {
		User user45 = new User();
		user45.setId(1);
		user45.setName("NVDinh45");
		return user45;
	}

}
