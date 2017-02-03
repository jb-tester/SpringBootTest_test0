package com.mytests.spring.springboot14.springtesting.test0;

import com.mytests.spring.springboot14.springtesting.test0.beans.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.when;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 1/19/2017.
 * Project: SpringBootTest_test0
 * *******************************
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class NestedConfigTest0 {

    @Qualifier("b1_1")
    @Autowired
    private B1 b1; // from the main configuration context

    @Autowired
    private B2 b2; // from the main configuration context




    @Autowired
    private B3 b3; // from the nested configuration class NestedConfig1

    @Autowired
    private B4 b4; // from the nested configuration class NestedConfig2

    @Autowired
    private B5 b5; // from the nested configuration class NestedConfig2 - added as MockBean there




    @TestConfiguration()
    static class NestedConfig1{
        @Bean
        public B3 b3() {
            return new B3("b3");
        }

    }
   @TestConfiguration("nested2")
   @MockBean(B5.class)
    static class NestedConfig2{
        @Bean
        public B4 b4() {
            return new B4("b4");
        }

    }

    @Autowired
    ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        when(b5.getId()).thenReturn("b5");
    }

    @Test
    public void testB3() throws Exception {
        Assert.assertEquals(b3.getId(),"b3");
    }
    @Test
    public void testB4() throws Exception {
        Assert.assertEquals(b4.getId(),"b4");
    }

    @Test
    public void testB5() throws Exception {
        Assert.assertEquals(b5.getId(),"b5");
    }
    @Test
    public void testNestedContextName() throws Exception {
        String[] beans = ctx.getBeanNamesForType(NestedConfig2.class);
        Assert.assertArrayEquals(new String[]{"nested2"},beans);

    }


}
