package com.academy.week1.exam.question3;

public class AirConditioner implements ButtonServer {

    // Methods to turn on and off the air conditioner
    public void turnOffAirConditioner(){
        System.out.println("Air conditioner is off");
    }

    public void turnOnAirConditioner(){
        System.out.println("Air conditioner is on");
    }

    //Override the methods from the interface ButtonServer with the methods from this class
    @Override
    public void turnOn(){
        turnOnAirConditioner();
    }

    @Override
    public void turnOff(){
        turnOffAirConditioner();
    }

}
