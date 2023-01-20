package com.academy.week1.exam.question1;

public class Batman extends Superhero {

    public Batman(String name, String superpower, int powerLevel) {
        // Call the constructor of the superclass
        super(name, superpower, powerLevel);
    }

    /*
     * This method should return the secret identity
     * of the superhero by overriding the method from
     * the abstract class.
     */

    @Override
    public String getSecretIdentity() {
        return "Bruce Wayne";
    }


    /*
     * This method should return the superpower of the superhero
     * by overriding the method from the interface.
     */
    @Override
    public String obtainSuperpower() {
        return getSuperpower();
    }

    /*
     * This method should return the power of the superhero
     * by overriding the method from the interface.
     */
    @Override
    public int calculatePower() {
        return getPowerLevel() * 100;
    }


    /*
     * This method should return a String representation of the superhero
     * by overriding the method from the Object class.
     */
    @Override
    public String toString() {
        return "Batman [getName()=" + getName()
                + ", getPower()=" + getPowerLevel()
                + ", getSecretIdentity()=" + getSecretIdentity()
                + "]";
    }


}
