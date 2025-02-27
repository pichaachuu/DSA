package jobsheet_3;

import java.util.Scanner;

public class MatakuliahDemo13 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jmlMatkul = input13.nextInt();
        input13.nextLine();

        Matakuliah13[] arrayOfMataKuliah = new Matakuliah13[jmlMatkul];

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah[i] = new Matakuliah13();
            arrayOfMataKuliah[i].tambahData(input13);
        }

        System.out.println("\n=== Data Mata Kuliah ===");
        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah[i].cetakInfo();
        }

        input13.close();
    }
}
