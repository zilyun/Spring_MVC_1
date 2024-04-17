package com.naver.myhome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
 * @SpringBootApplication
 * 	1. 자동 설정을 담당하는 annotation으로 스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성이 모두 자동으로 설정됩니다.
 * 
 * 	2. SpringBootApplications annotation이 포함하고 있는 세 가지 annotation은 다음과 같습니다.
 * 		(1) @SpringBootConfiguration
 * 				- Spring Boot 애플리케이션의 @Configuration을 제공함을 나타냅니다.
 * 				- 즉, 클래스가 Spring Boot의 구성 클래스임을 나타냅니다.
 * 		
 * 		(2) @ComponentScan
 * 				- @SpringBootApplication이 있는 폴더를 기준으로 하위 폴더 모두를 스캔해서 빈으로 등록합니다.
 * 					예) @Component, @Configuration, @Repository, @Service, @Controller, 
 * 						@RestController ..)
 * 						위 annotation을 인식하게 하기 위해서는 @SpringBootApplication이 있는 
 * 						패키지부터 하위 패키지에 작성하시면 됩니다.
 * 
 * 		(3) @EnableAutoConfiguration
 * 				- @ComponentScan으로 빈이 등록된 이후, @EnableAutoConfiguration를 통해 한 번 더 스캔되는데 
 * 					그 때 등록되는 bean들은 설정을 위해 사용되는 다양한 bean 들이 등록이 됩니다.
 * 			
 * 			참고) Maven Dependencies 선택
 * 				-> spring-boot-autoconfigure-3.1.10.jar
 * 				-> META-INF/spring/spring.factories
 * 				-> 이곳에 설정 관련된 정보들이 key와 값의 형태로 저장되어 있습니다.
 * 				   이 파일을 참조하여 여러가지 Bean을 생성합니다.
 * 
 * */
@SpringBootApplication
public class Spring3Mvc1Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring3Mvc1Application.class, args);
	}

}
