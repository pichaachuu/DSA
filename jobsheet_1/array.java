import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        String[] MK = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
                    "Matematika Dasar", "Bahasa Inggris", "Dasar Pemograman", "Praktikum Dasar Pemograman",
                    "Keselamatan dan Kesehatan Kerja"};
        double[] nilaiAngka = new double[MK.length];
        String[] nilaiHuruf = new String[MK.length];
        double[] bobotNilai = new double[MK.length];
        int[] sks = {2, 2, 2, 3, 2, 2, 3, 2};
        double jumlah = 0;
        double ip;
        System.out.println("=".repeat(30));
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=".repeat(30));
        
        for (int i = 0; i < MK.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + MK[i] + ": ");
            nilaiAngka[i] = input13.nextDouble();
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0;
            } 
        }

        System.out.println("=".repeat(30));
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=".repeat(30));
        System.out.printf("%-40s%-20s%-20s%-20s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < MK.length; i++) {
            System.out.printf("%-40s%-20s%-20s%-20s\n", MK[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }
        System.out.println("=".repeat(30));
        for (int i = 0; i < MK.length; i++) {
            jumlah += bobotNilai[i] * sks[i];
        }
        ip = jumlah/18;
        System.out.println("IP: " + ip);
        input13.close();
    }
}
