package com.wesley.URLParser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
scanBasePackages={"com.wesley.URLParser.controller", "com.wesley.URLParser.parsers", "com.wesley.URLParser.model"})
public class UrlParserApplication {
	public static void main(String[] args) {
		SpringApplication.run(UrlParserApplication.class, args);
	}

}
