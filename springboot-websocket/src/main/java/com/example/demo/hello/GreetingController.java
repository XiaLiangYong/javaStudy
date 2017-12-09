package com.example.demo.hello;

/**
 * Created by alibeibei on 2017/12/6.
 */

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {


    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        System.out.println("Hello, " + message.getName() + "!");
        return new Greeting("Hello, " + message.getName() + "!");
    }

}
