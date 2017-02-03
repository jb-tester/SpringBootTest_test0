package com.mytests.spring.springboot14.springtesting.test0.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 1/20/2017.
 * Project: SpringBootTest_test0
 * *******************************
 */
@Component
public class Comp1 {
    @Value("comp1")
    private String id;

    public String getId() {
        return id;
    }


}
