import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        long nim = input13.nextLong();
        int n = (int) (nim % 100);

        if (n < 10) {
            n+=10;
        }

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.print("* ");
            } else if (i == 6 || i == 10) {
                System.out.print("");
            } else {
                System.out.print(i + " ");
            }
        }
        input13.close();
    }
}
