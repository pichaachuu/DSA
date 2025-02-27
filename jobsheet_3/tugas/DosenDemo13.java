package jobsheet_3.tugas;

import java.util.Scanner;

public class DosenDemo13 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jmlDosen = input13.nextInt();
        input13.nextLine();

        Dosen13[] arrayDosen = new Dosen13[jmlDosen];

        for (int i = 0; i < arrayDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            System.out.print("Kode          : ");
            String kode = input13.nextLine();
            System.out.print("Nama          : ");
            String nama = input13.nextLine();
            System.out.print("Jenis Kelamin : ");
            String jk = input13.nextLine();
            System.out.print("Usia          : ");
            int usia = input13.nextInt();
            System.out.println("-".repeat(30));

            arrayDosen[i] = new Dosen13(kode, nama, jk, usia);
            input13.nextLine();
        }

        DataDosen13.dataSemuaDosen(arrayDosen);
        DataDosen13.jumlahDosenPerJenisKelamin(arrayDosen);
        DataDosen13.rerataUsiaDosenPerJenisKelamin(arrayDosen);
        DataDosen13.infoDosenTertua(arrayDosen);
        DataDosen13.infoDosenTermuda(arrayDosen);
        input13.close();
    }
}
