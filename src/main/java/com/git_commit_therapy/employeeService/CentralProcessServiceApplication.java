package com.git_commit_therapy.employeeService;

import net.devh.boot.grpc.common.autoconfigure.GrpcCommonCodecAutoConfiguration;
import net.devh.boot.grpc.server.autoconfigure.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan({"com.git_commit_therapy.employeeService","com.git_commit_therapy.emergency"})
@EnableScheduling
@ImportAutoConfiguration({GrpcCommonCodecAutoConfiguration.class, GrpcHealthServiceAutoConfiguration.class, GrpcMetadataConsulConfiguration.class, GrpcMetadataEurekaConfiguration.class,
		GrpcMetadataNacosConfiguration.class, GrpcServerAutoConfiguration.class, GrpcServerFactoryAutoConfiguration.class, GrpcServerMetricAutoConfiguration.class,
		GrpcServerSecurityAutoConfiguration.class})
public class CentralProcessServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CentralProcessServiceApplication.class, args);
	}

}
