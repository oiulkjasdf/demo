package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableScheduling
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RestController
	public class C{
		@GetMapping("/health")
		public String T(){
			logger.info(t);
			return "ok";
		}

		@Value("${test.t}")
		private String t;

		private final Logger logger = LoggerFactory.getLogger(C.class);

		@Scheduled(cron="0/10 * * * * *")
		public void sche(){

			logger.info("=============================");
		}
	}

}
