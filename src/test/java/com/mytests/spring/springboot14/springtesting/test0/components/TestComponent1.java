package com.mytests.spring.springboot14.springtesting.test0.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.TestComponent;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 1/20/2017.
 * Project: SpringBootTest_test0
 * *******************************
 */
@TestComponent
public class TestComponent1 {
    @Value("testComp1")
    private String id;

    public String getId() {
        return id;
    }
}
