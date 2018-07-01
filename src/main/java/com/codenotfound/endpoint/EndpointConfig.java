package com.codenotfound.endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.xml.ws.Endpoint;

/**
 * Created by iters on 7/1/18.
 */
@Configuration
public class EndpointConfig {

    @Autowired private Bus bus;

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new HelloWorldImpl());
        endpoint.publish("/helloworld");
        return endpoint;
    }
}
