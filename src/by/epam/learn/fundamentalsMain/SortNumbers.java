package by.epam.learn.fundamentalsMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.System.out;

public class SortNumbers {
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
            out.print("Input int numbers are: ");
            for (int i = 0; i < 5; i++) {
                out.print(numbInt[i] + "  ");
            }
            out.println("\n");
            out.print("Sorted int numbers ascending their length are: ");
            Arrays.sort(numbInt);
            for (int j : numbInt) {
                out.print(j + "  ");
            }
            out.println("\n");
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