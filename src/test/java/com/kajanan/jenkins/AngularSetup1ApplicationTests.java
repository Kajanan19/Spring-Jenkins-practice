package com.kajanan.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AngularSetup1ApplicationTests {
	
	public static Logger logger= LoggerFactory.getLogger(AngularSetup1ApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case executing...");
		assertEquals(true, true);
	}

}
