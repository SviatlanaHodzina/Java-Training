package by.epam.learn.fundamentalsMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SaluteMain {
    public static void main(String[] args) {
        InputStreamReader is = new InputStreamReader(System.in);
        try (is; BufferedReader bis = new BufferedReader(is)) {
            System.out.println("Enter user's name: ");
            String name = bis.readLine();
            System.out.println("Hello, " + name);
        } catch (IOException e) {
            System.out.println("Input error " + e);
        }
    }
}