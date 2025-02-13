import java.util.*;
public class pemilihan {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        System.out.println("Programm Menghitung Nilai Akhir");
        System.out.println("=".repeat(30));
        System.out.print("Masukkan Nilai Tugas: ");
        int tugas = input13.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        int kuis = input13.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        int UTS = input13.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        int UAS = input13.nextInt();
        System.out.println("=".repeat(30));

        System.out.println("=".repeat(30));
        String nilaiHuruf = "";
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || UTS < 0 || UTS > 100 || UAS < 0 || UAS > 100) {
            System.out.println("nilai tidak valid");
        } else {
            double nilaiAKhir = (0.2 * kuis) + (0.2 * tugas) + (0.3 * UTS) + (0.3 * UAS);
            if (nilaiAKhir > 80 && nilaiAKhir <= 100) {
                nilaiHuruf = "A";
            } else if (nilaiAKhir > 73 && nilaiAKhir <= 80) {
                nilaiHuruf = "B+";
            } else if (nilaiAKhir > 65 && nilaiAKhir <= 73) {
                nilaiHuruf = "B";
            } else if (nilaiAKhir > 60 && nilaiAKhir <= 65) {
                nilaiHuruf = "C+";
            } else if (nilaiAKhir > 50 && nilaiAKhir <= 60) {
                nilaiHuruf = "C";
            } else if (nilaiAKhir > 39 && nilaiAKhir <= 50) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }
            System.out.println("Nilai Akhir: " + nilaiAKhir);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
        }
        System.out.println("=".repeat(30));
        System.out.println("=".repeat(30));
        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
            System.out.println("SELAMAT ANDA LULUS");
        } else if (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) {
            System.out.println("ANDA TIDAK LULUS");
        }
        input13.close();
    }
}