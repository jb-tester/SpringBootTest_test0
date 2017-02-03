package com.mytests.spring.springboot14.springtesting.test0;

import com.mytests.spring.springboot14.springtesting.test0.components.TestComponent1;
import com.mytests.spring.springboot14.springtesting.test0.components.TestConfiguration1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 1/20/2017.
 * Project: SpringBootTest_test0
 * *******************************
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestConfigurationAndTestComponentTest0 {

    @Autowired(required = false) // @TestComponent-annotated class is not found by Spring. Unclear docs here ????
    private TestComponent1 testComponent1;

    @Autowired(required = false) // @TestConfiguration-annotated class is not found by Spring. Unclear docs here ????
    private TestConfiguration1 configuration1;
    @Test
    public void testTestComponent1() throws Exception {
        Assert.assertNull(testComponent1);
    }

    @Test
    public void testTestConfiguration1() throws Exception {
        Assert.assertNull(configuration1);
    }
}
