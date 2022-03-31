package by.epam.learn.fundamentalsMain;

public class OutArgsMain {
    public static void main(String[] args) {
        int[] arg = {21, 22, 23};
        for (int i = arg.length - 1; i >= 0; i--) {
            System.out.println("  Arg №" + i + ": = " + arg[i]);
        }
        System.out.print("\n\n");
        for (int i = arg.length - 1; i >= 0; i--) {
            System.out.print("  Arg №" + i + ": = " + arg[i]);
        }
    }
}