package com.git_commit_therapy.central_process_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan({"com.git_commit_therapy.employeeService","com.git_commit_therapy.emergency"})
@EnableScheduling
public class CentralProcessServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CentralProcessServiceApplication.class, args);
	}

}
