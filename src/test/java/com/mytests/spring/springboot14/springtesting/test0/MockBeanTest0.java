package com.mytests.spring.springboot14.springtesting.test0;

import com.mytests.spring.springboot14.springtesting.test0.beans.B1;
import com.mytests.spring.springboot14.springtesting.test0.beans.B2;
import com.mytests.spring.springboot14.springtesting.test0.beans.B3;
import com.mytests.spring.springboot14.springtesting.test0.beans.B4;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
@MockBean(classes = B4.class) // should navigate to class? bean is defined only here
public class MockBeanTest0 {

	//@MockBean // should show errors - multiple beans found
	//private B1 b1_;

	@MockBean(name = "b1_1") // should navigate to specific bean
	private B1 b1;

	@MockBean  // should navigate to bean
	private B2 b2;

	@MockBean // should navigate to class? bean is defined only here
	private B3 b3;

	@Autowired
	private B4 b4;  // autowiring should work - the mockBean is defined on a class level

	@Before
	public void setUp() throws Exception {
		when(b1.getId()).thenReturn("b1");
		when(b3.getId()).thenReturn("b3");
		when(b4.getId()).thenReturn("b4");
	}

	@Test
	public void testB1() {
		Assert.assertEquals(b1.getId(),"b1");
	}

	@Test
	public void testB2() throws Exception {
		Assert.assertEquals(b2.getId(),null);
	}

	@Test
	public void testB3() throws Exception {
		Assert.assertEquals(b3.getId(),"b3");
	}

	@Test
	public void testB4() throws Exception {
		Assert.assertEquals(b4.getId(),"b4");
	}
}
