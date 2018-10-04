package com.oreilly.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class MyConfiguration {

    @Bean
    public String message(){
        return "world";
    }


    @Bean
    @Profile("PROD")
    public MyRandomMessage myRandomMessage(@Value("${my.randomMessage}") String message){
        MyRandomMessage myRandomMessage = new MyRandomMessage();
        myRandomMessage.setMyRandomMessage(message);
        return myRandomMessage;
    }

    @Bean
    @Profile("DEV")
    public MyRandomMessage myRandomMessageDev(){
        MyRandomMessage myRandomMessage = new MyRandomMessage();
        myRandomMessage.setMyRandomMessage("This is DEV environment");
        return myRandomMessage;
    }

}
