package com.codenotfound;

import com.codenotfound.client.HelloWorldClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Created by iters on 7/1/18.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class SpringCxfApplicationTest {

    @Autowired
    private HelloWorldClient helloWorldClient;

    @Test
    public void testSayHello() {
        assertThat(helloWorldClient.helloWorld("John", "Doe"))
                .isEqualTo("Hello John Doe!");
    }

}
