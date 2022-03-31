package by.epam.learn.collectionsNumberStack;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

import static java.lang.System.out;

public class NumberStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        try (Scanner input = new Scanner(System.in)) {
            int number, a, b, c;
            System.out.print("Enter a number to put it into a stack:=");
            number = input.nextInt();
            while (number > 0) {
                stack.push(number % 10);
                number = number / 10;
            }
            a = 0;
            c = 1;
            while (!stack.empty()) {
                b = stack.pop();
                a = a + b * c;
                c = c * 10;
            }
            System.out.println(a);
        } catch (InputMismatchException e) {
            out.println("The incorrect input.");
            out.println("Please, try again:");
            main(new String[0]);
        }
    }
}