package de.delgrosso.calc;

import com.google.gson.Gson;

import java.util.Scanner;

/**
 * Main class
  */
public class Main {
    /**
     * Main method
     * @param args the values passed from command line
     */
    public static void main(String[] args) {
        String s = new String("for");

        Gson json = new Gson();
        String jsonString = json.toJson(s);

        System.out.println("original string: " + s);
        System.out.println("json string: " + jsonString);

    }
}
