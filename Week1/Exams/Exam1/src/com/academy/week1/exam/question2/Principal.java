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
    }

    public static void openConnection() {
        Config config = Config.getInstance(); //Here is when the object is already created

        //TODO: Create a connection to the database using the configuration stored in the Config class
        Connection connection = new Connection(config.getUrl(), config.getUsername(), config.getPassword());

        //TODO: Open the connection. If the connection is already open, then do nothing.
        //connection.open();

    }


}

