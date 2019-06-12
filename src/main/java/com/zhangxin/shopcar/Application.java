package com.zhangxin.shopcar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *   (1) @ComponentScan(basePackages = "xxx.xxx.xxx")：扫描 @Controller、@Service 注解；
 * 	   (2) @EnableJpaRepositories(basePackages = "xxx.xxx.xxx")：扫描 @Repository 注解；
 * 	   (3) @EntityScan(basePackages = "xxx.xxx.xxx")：扫描 @Entity 注解；
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


}



