package com.java.academy.week2.day2.tryWithResource.demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) {
        File file = new File("E://file.txt");
        FileReader fr = null;
        try {
            fr = readFile(file);
            System.out.println("Many operations");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static FileReader readFile(File file)
            throws FileNotFoundException {
        FileReader fr = new FileReader(file);
        return fr;
    }

}
