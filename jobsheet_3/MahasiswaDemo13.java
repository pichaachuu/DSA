package jobsheet_3;

import java.util.*;
public class MahasiswaDemo13 {
    public static void main(String[] args) {
        Scanner inpu13 = new Scanner(System.in);
        Mahasiswa13[] arrayOfMahasiswa = new Mahasiswa13[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa13();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            arrayOfMahasiswa[i].nim = inpu13.nextLine();
            System.out.print("Nama  : ");
            arrayOfMahasiswa[i].nama = inpu13.nextLine();
            System.out.print("Kelas : ");
            arrayOfMahasiswa[i].kelas = inpu13.nextLine();
            System.out.print("IPK   : ");
            dummy = inpu13.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("-".repeat(30));
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            arrayOfMahasiswa[i].cetakInfo();
        }
    }
}
