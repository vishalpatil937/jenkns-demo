package com.xoriant.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	 @Test
	    public void testApplicationConfiguration() {
	        ApplicationConfiguration config = new ApplicationConfiguration();
	        String result = config.hello();
	        assertEquals(result, "Hello World");
	    }

}
