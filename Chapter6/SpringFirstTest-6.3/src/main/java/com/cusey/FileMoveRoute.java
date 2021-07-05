package com.cusey;

import org.apache.camel.builder.RouteBuilder;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class FileMoveRoute extends RouteBuilder {
	
	private static final Logger logger = LogManager.getLogger(FileMoveRoute.class);

	@Override
	public void configure() throws Exception {
		logger.debug(" <<<< FileMoveRoute - createRouteBuilder >>>> ");

		//routes the file
		from("file://target/inbox").to("file://target/outbox");
		
	}

}
