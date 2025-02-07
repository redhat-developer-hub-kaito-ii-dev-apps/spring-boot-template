package com.example.${{values.java_package_name}};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class ${{values.component_id}} {

    @RequestMapping("/")
        public String home() {
        return "Hello World";
    }

	public static void main(String[] args) {
		SpringApplication.run(${{values.component_id}}.class, args);
	}

}
