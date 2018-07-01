package com.codenotfound.client;

import com.codenotfound.services.helloworld.HelloWorldPortType;
import com.codenotfound.types.helloworld.Greeting;
import com.codenotfound.types.helloworld.ObjectFactory;
import com.codenotfound.types.helloworld.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by iters on 7/1/18.
 */

@Component
public class HelloWorldClient {

    @Autowired private HelloWorldPortType helloWorldProxy;

    public String helloWorld(String firstName, String lastName) {
        ObjectFactory factory = new ObjectFactory();
        Person person = factory.createPerson();
        person.setFirstName(firstName);
        person.setLastName(lastName);

        Greeting response = helloWorldProxy.sayHello(person);

        return response.getGreeting();
    }

}
