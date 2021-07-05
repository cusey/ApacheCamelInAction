package com.cusey;

import java.io.File;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;



public class FirstTest extends CamelTestSupport {
	
	private static final Logger logger = LogManager.getLogger(FirstTest.class);
	
	@Override
	protected RouteBuilder createRouteBuilder() throws Exception {
		return new RouteBuilder() {
		
			
				@Override
				public void configure() throws Exception {
					logger.debug(" <<<< FirstTest - createRouteBuilder >>>> ");

					//routes the file
					from("file://target/inbox").to("file://target/outbox");
				}
		};
	}
	
	public void setUp() throws Exception {
		
		//Clean the two directories
		deleteDirectory("target/inbox");
		deleteDirectory("target/outbox");
		
		super.setUp();
		
	}
	
	@Test
	public void testMoveFile() throws Exception {
	
		logger.debug("  <<<<  FirstTest - testMoveFile >>>> ");
		
		/*
		 * This is producer template that creates the file to be used by the router 
		 */
		template.sendBodyAndHeader("file://target/inbox", "Hello World", Exchange.FILE_NAME, "hello.txt");
		
		Thread.sleep(1000);
		
		/*
		 * This just get the file to check if it exists
		 */
		File target = new File("target/outbox/hello.txt");
		
		assertTrue("File not moved", target.exists());
		
		/*
		 * Converting the contents of the file to a string and save it
		 */
		String content = context.getTypeConverter().convertTo(String.class, target);
		
		assertEquals("Hello World", content);
	}
}

