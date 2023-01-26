package com.academy.week1.exam.question3;

public class Button {

    /**
     * This method should turn on the server if it is off and turn it off if it is on.
     *
     * @param buttonServer
     */
    public void push(ButtonServer buttonServer){
        buttonServer.turnOn();
    }
}
