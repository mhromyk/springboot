package com.oreilly.boot;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class MyRandomMessage {

//    @Value("${my.randomMessage}")
    private String myRandomMessageValue;

    public String getMyRandomMessage() {
        return myRandomMessageValue;
    }

    public void setMyRandomMessage(String myRandomMessage) {
        this.myRandomMessageValue = myRandomMessage;
    }
}
