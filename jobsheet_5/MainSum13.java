package jobsheet_5;
import java.util.*;
public class MainSum13 {

    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input13.nextInt();

        Sum13 sm = new Sum13(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke-" + (i+1) + ": ");
            sm.keuntungan[i] = input13.nextDouble();
        }

        System.out.println("Total keuntungan menggunakan BruteForce: " + sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide Conquer: " + sm.totalDC(sm.keuntungan, 0, elemen-1));
        input13.close();
    }
}