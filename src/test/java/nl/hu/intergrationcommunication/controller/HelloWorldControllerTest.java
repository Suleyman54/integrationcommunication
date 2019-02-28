package nl.hu.intergrationcommunication.controller;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloWorldControllerTest {

    private HelloWorldController helloWorldController = new HelloWorldController();

    @Test
    public void shouldReturnHelloMessage() {
        String message = helloWorldController.hello();

        assertThat(message).isEqualTo("Hello my friend.");
    }

}
