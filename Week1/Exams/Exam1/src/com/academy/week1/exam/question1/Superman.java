package com.academy.week1.exam.question1;

public class Superman extends Superhero {

    public Superman(String name,String superpower, int powerLevel) {
        super(name, superpower, powerLevel);
    }

    @Override
    public String getSecretIdentity() {
        return "Clark Kent";
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
        return "Superman [getName()=" + getName()
                + ", getPower()=" + getPowerLevel()
                + ", getSecretIdentity()=" + getSecretIdentity()
                + "]";
    }


}
