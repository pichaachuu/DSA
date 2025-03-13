package jobsheet_5;
import java.util.*;
public class MainFaktorial13 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = input13.nextInt();

        Faktorial13 fk = new Faktorial13();
        System.out.println("Nilai faktorial " + nilai + " menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC: " + fk.faktorialDC(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan BF WHILE: " + fk.faktorialIBFWhile(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan BF DOWHILE: " + fk.faktorialIBFDoWhile(nilai));

        input13.close();
    }
}
