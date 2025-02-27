package jobsheet_3;

import java.util.Scanner;

public class Matakuliah13 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah13() {}

    public Matakuliah13(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tambahData(Scanner input) {
        System.out.print("Kode          : ");
        this.kode = input.nextLine();
        System.out.print("Nama          : ");
        this.nama = input.nextLine();
        System.out.print("Sks           : ");
        this.sks = input.nextInt();
        System.out.print("Jumlah Jam    : ");
        this.jumlahJam = input.nextInt();
        input.nextLine();
        System.out.println("=".repeat(30));
    }

    void cetakInfo() {
        System.out.println("Kode        : " + kode);
        System.out.println("Nama        : " + nama);
        System.out.println("Sks         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
        System.out.println("-".repeat(30));
    }
}
