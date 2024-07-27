package com.sb.sahayog_bharati;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class SahayogBharatiApplication {
	public static void main(String[] args) {
		SpringApplication.run(SahayogBharatiApplication.class, args);
	}
	
	@GetMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return "Hello, World!";
    }
}