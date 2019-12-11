package com.qdgx.dmp.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableFeignClients
@MapperScan({"com.qdgx.dmp.test.mapper"})
@ComponentScan({"com.qdgx.dmp.comm.filter","com.qdgx.dmp.test"})
//@ServletComponentScan(basePackages = "com.qdgx.dmp.comm.filter")
public class QdgxDmpApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(QdgxDmpApplication.class, args);
	}
//	@Bean
//	public static JwtAuthFilter getJwtAuthFilter() { 
//		return new JwtAuthFilter();
//	}
}
