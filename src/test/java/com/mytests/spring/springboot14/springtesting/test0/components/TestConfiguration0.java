package com.mytests.spring.springboot14.springtesting.test0.components;

import com.mytests.spring.springboot14.springtesting.test0.beans.B3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 1/20/2017.
 * Project: SpringBootTest_test0
 * *******************************
 */
@Configuration
public class TestConfiguration0 {
    @Bean
    public B3 b3() {
        return new B3("b3 from TestConfiguration0");
    }

}
