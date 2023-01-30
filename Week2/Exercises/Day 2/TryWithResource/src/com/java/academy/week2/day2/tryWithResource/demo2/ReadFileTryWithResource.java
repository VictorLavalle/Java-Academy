package com.java.academy.week2.day2.tryWithResource.demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileTryWithResource {

    public static void main(String[] args) {
        File file = new File("E://archivo.txt");

        //Try With Resources
        try (FileReader fr = readFile(file)) {
            System.out.println("Many operations");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public static FileReader readFile(File file)
            throws FileNotFoundException {
        FileReader fr = new FileReader(file);
        return fr;
    }
}