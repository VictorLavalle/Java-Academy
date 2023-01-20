package com.academy.week1.exam.question3;

public class Lamp implements ButtonServer {

    public void turnOffLamp(){
        System.out.println("Lamp is off");
    }
    public void turnOnLamp(){
        System.out.println("Lamp is on");
    }


    @Override
    public void turnOn() {
        turnOnLamp();
    }

    @Override
    public void turnOff() {
        turnOffLamp();
    }

}


