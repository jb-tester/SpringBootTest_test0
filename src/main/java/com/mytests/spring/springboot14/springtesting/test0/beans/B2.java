package com.mytests.spring.springboot14.springtesting.test0.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 1/19/2017.
 * Project: SpringBootTest_test0
 * *******************************
 */
public class B2 {

    String id;

    public String getId() {
        return id;
    }

    public B2(String id) {

        this.id = id;
    }
}
