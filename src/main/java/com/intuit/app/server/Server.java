package com.intuit.app.server;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.stereotype.Component;

/**
 * @author dsingh11
 *
 */
/**
 * @author dsingh11
 *
 */
@Component
public class Server implements EmbeddedServletContainerCustomizer {

	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		// if u want to change the port of embedded tomcat
		container.setPort(8080);
		// to change the context path of ur application 
		container.setContextPath("/intuit");
		
	}

}
