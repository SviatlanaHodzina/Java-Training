package by.epam.learn.fundamentalsMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.out;

public class NumbersMain {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        String[] str = new String[5];
        int[] numbInt = new int[5];
        try (is; BufferedReader br = new BufferedReader(is)) {
            out.println("Enter a number: ");
            for (int i = 0; i < 5; i++) {
                str[i] = br.readLine();
                numbInt[i] = Integer.parseInt(str[i]);
            }
            out.print("Integer numbers are: ");
            for (int i = 0; i < 5; i++) {
                out.println(numbInt[i] + "  ");
            }
            out.println("\n");
            int max = numbInt[0];
            int min = numbInt[1];
            for (int j : numbInt) {
                if (max < j)
                    max = j;
            }
            for (int j : numbInt) {
                if (min > j)
                    min = j;
            }
            out.println("The shortest number is:" + min + "   It's length is:  " + Integer.toString(min).length());
            out.println("The longest number is:" + max + "   It's length is:  " + Integer.toString(max).length());
        } catch (IOException e) {
            e.printStackTrace();
            out.println("Input error " + e);
            out.println("Please, try again:");
            main(new String[0]);
        } catch (NumberFormatException e) {
            out.println("Incorrect number format." + e);
            out.println("Please, try again:");
            main(new String[0]);
        }
    }
}