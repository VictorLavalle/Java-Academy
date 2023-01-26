package com.academy.week1.exam.question2;

//Instructions:
//Explain and implement a singleton
public class Principal {
    public static void main(String[] args) {

        Principal principal = new Principal();
        principal.connect("127.0.0.1", "vic", "password");
        principal.openConnection();

    }

    /*
     * This method should return a connection to the database using the configuration
     * stored in the Config class.
     */
    public static void connect(String url, String username, String password) {
        Config config = Config.getInstance(); //Creates the object
        config.setUrl(url);
        config.setUsername(username);
        config.setPassword(password);

        System.out.println("Connection established");
        System.out.println("URL: " + config.getUrl());
        System.out.println("Username: " + config.getUsername());
        System.out.println("Password: " + config.getPassword());
        System.out.println("-----------------------------\n");
    }

    public static void openConnection() {
        Config config = Config.getInstance(); //Here is when the object is already created

        System.out.println("Connection already established");
        System.out.println( config.toString() );

    }


}

