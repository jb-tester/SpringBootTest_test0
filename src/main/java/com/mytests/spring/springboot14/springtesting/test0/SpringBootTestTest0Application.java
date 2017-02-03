package com.mytests.spring.springboot14.springtesting.test0;

import com.mytests.spring.springboot14.springtesting.test0.beans.B1;
import com.mytests.spring.springboot14.springtesting.test0.beans.B2;
import com.mytests.spring.springboot14.springtesting.test0.components.Comp1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootTestTest0Application {


	@Autowired
	private Comp1 comp1;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestTest0Application.class, args);

	}

	@Bean
	public B2 b2() {
		return new B2("b2");
	}
	@Bean(name="b1_1")
	public B1 b11() {
		return new B1("b1_1");
	}
	@Bean(name="b1_2")
	public B1 b12() {
		return new B1("b1_2");
	}
	@Bean(name="b1_3")
	public B1 b13() {
		return new B1("b1_3");
	}

}
