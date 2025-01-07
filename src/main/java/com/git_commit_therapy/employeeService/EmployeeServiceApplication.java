package com.git_commit_therapy.employeeService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
<<<<<<< HEAD:src/main/java/com/git_commit_therapy/central_process_service/CentralProcessServiceApplication.java
@ComponentScan({"com.git_commit_therapy.employeeService","com.git_commit_therapy.emergency"})
@EnableScheduling
public class CentralProcessServiceApplication {
=======
public class EmployeeServiceApplication {
>>>>>>> 29dce637771feba44333a74ed3d75cdf39aca31c:src/main/java/com/git_commit_therapy/employeeService/EmployeeServiceApplication.java

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

}
