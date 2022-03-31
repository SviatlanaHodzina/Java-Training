package by.epam.learn.fundamentalsMain;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class MonthMain {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(in)) {
            out.print("Enter number of the Month: ");
            int number = input.nextInt();
            switch (number) {
                case 1 -> out.println(" - This is January");
                case 2 -> out.println(" - This is February");
                case 3 -> out.println(" - This is March");
                case 4 -> out.println(" - This is April");
                case 5 -> out.println(" - This is May");
                case 6 -> out.println(" - This is June");
                case 7 -> out.println(" - This is July");
                case 8 -> out.println(" - This is August");
                case 9 -> out.println(" - This is September");
                case 10 -> out.println(" - This is October");
                case 11 -> out.println(" - This is November");
                case 12 -> out.println(" - This is December");
                default -> {
                    out.println("The incorrect input.");
                    main(new String[0]);
                }
            }
        } catch (InputMismatchException e) {
            out.println("The incorrect input.");
            out.println("Please, try again:");
            main(new String[0]);
        }
    }
}