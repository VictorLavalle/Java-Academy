package com.academy.week1.exam.question2;

public class Config {

    //Attributes
    private String url;
    private String username;
    private String password; //TODO: encrypt this password
    private static Config instance; //Singleton

    //Constructor default
    private Config(){ }


    /*
    * Singleton pattern implementation to ensure only one instance of the class is created
    * and to provide a global point of access to it.
     */
    public static Config getInstance(){
        //Lazy loading - only create the instance when it is needed
        if(instance == null){
            instance = new Config();
        }
        return instance;
    }

    //Getters and Setters
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Config{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
