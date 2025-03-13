package jobsheet_5;
import java.util.*;
public class PangkatMain13 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input13.nextInt();

        Pangkat13[] png = new Pangkat13[elemen];

        System.out.println("TANPA PARAMETER");
        for (int i = 0; i < png.length; i++) {
            png[i] = new Pangkat13();
            System.out.print("Masukkan nilai basis elemen ke-" + (i+1) + ": ");
            png[i].nilai = input13.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i+1) + ": ");
            png[i].pangkat = input13.nextInt();
        }

        System.out.println("PAKAI PARAMETER");
        for (int i = 0; i < png.length; i++) {
            System.out.print("Masukkan nilai basis elemen ke-" + (i+1) + ": ");
            int basis = input13.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i+1) + ": ");
            int pangkat = input13.nextInt();
            png[i] = new Pangkat13(basis, pangkat);
        }

        System.out.println("HASIL PANGKAT BRUTEFORCE:");
        for (Pangkat13 p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatBF(p.nilai, p.pangkat));
        }

        System.out.println("HASIL PANGKAT BRUTEFORCE TANPA PARAMETER:");
        for (Pangkat13 p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatBFTanpaParameter());
        }

        System.out.println("HASIL PANGKAT DENGAN DIVIDE CONQUER:");
        for (Pangkat13 p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatDC(p.nilai, p.pangkat));
        }

        input13.close();
    }
}
