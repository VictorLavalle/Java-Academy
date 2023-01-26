package com.academy.week1.exam.question1;

public abstract class Superhero implements Superpower {

    // Declare the attributes
    private String name;
    private String superpower;
    private int powerLevel = 0;


    // Create a constructor that takes a String parameter
    // and sets the name attribute to the value of the parameter
    public Superhero(String name, String superpower, int powerLevel) {
        this.name = name;
        this.superpower = superpower;
        this.powerLevel = powerLevel;
    }

    /*
     * Getter
     * This method should return the name of the superhero.
     */
    public String getName() {
        return name;
    }

    /*
     * Setter
     * This method should set the name of the superhero.
     */
    public void setName(String name) {
        this.name = name;
    }

    /*
     * Getter
     * This method should return the superpower of the superhero.
     */
    public String getSuperpower() {
        return superpower;
    }

    /*
     * Setter
     * This method should set the superpower of the superhero.
     */
    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

    /*
     * Getter
     * This method should return the power of the superhero.
     */
    public int getPowerLevel() {
        if (powerLevel < 0 || powerLevel > 100) {
            return 0;
        }
        return powerLevel;
    }

    /*
     * Setter
     * This method should set the power of the superhero.
     */
    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    /*
     * Abstract method to be implemented by subclasses
     * This method should return the secret identity of the superhero.
     */
    public abstract String getSecretIdentity();

}
