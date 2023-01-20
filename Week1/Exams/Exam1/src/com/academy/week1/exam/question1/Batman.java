package com.academy.week1.exam.question1;

public class Batman extends Superhero {

    public Batman(String name, String superpower, int powerLevel) {
        super(name, superpower, powerLevel);
    }

    @Override
    public String getSecretIdentity() {
        return "Bruce Wayne";
    }

    @Override
    public String obtainSuperpower() {
        return getSuperpower();
    }

    @Override
    public int calculatePower() {
        return getPowerLevel() * 100;
    }

    @Override
    public String toString() {
        return "Batman [getName()=" + getName()
                + ", getPower()=" + getPowerLevel()
                + ", getSecretIdentity()=" + getSecretIdentity()
                + "]";
    }


}
