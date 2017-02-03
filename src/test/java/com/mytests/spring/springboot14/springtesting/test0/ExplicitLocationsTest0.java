package com.mytests.spring.springboot14.springtesting.test0;

import com.mytests.spring.springboot14.springtesting.test0.beans.B2;
import com.mytests.spring.springboot14.springtesting.test0.beans.B3;
import com.mytests.spring.springboot14.springtesting.test0.components.TestConfiguration0;
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
@SpringBootTest(classes = {TestConfiguration0.class})
public class ExplicitLocationsTest0 {


    @Autowired(required = false) // bean from TestConfiguration0 class should be resolved
    private B3 b3;


    @Autowired(required = false) // bean from default (@SpringBootApplication-annotated class)configuration should not be resolved!
    private B2 b2;

    @Test
    public void testBeansFromExplicitLocation() throws Exception {
        Assert.assertEquals(b3.getId(),"b3 from TestConfiguration0");
    }

    @Test
    public void testBeansFromDefaultLocation() throws Exception { Assert.assertNull(b2);}
}
