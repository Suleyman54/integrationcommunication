package nl.hu.intergrationcommunication;

import nl.hu.intergrationcommunication.controller.HelloWorldController;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class HelloWorldControllerTest {

    private HelloWorldController helloWorldController = new HelloWorldController();

    @Test
    public void shouldReturnHelloMessage() {
        String message = helloWorldController.hello();

        Assertions.assertThat(message).isEqualTo("Hello my friend.");
        System.out.println("Gelukt!");
    }

}
