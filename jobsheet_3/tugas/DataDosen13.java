package jobsheet_3.tugas;
import java.util.Scanner;

public class DataDosen13 {
    static Scanner scan = new Scanner(System.in);

    static void dataSemuaDosen(Dosen13[] dosen) {
        System.out.println("\nData Dosen");
        for (Dosen13 ds : dosen) {
            System.out.println("Kode          : " + ds.kode);
            System.out.println("Nama          : " + ds.nama);
            System.out.println("Jenis Kelamin : " + ds.jenisKelamin);
            System.out.println("Usia          : " + ds.usia);
            System.out.println("========================");
            System.out.println();
        }
    }

    static void jumlahDosenPerJenisKelamin(Dosen13[] dosen) {
        int jmlPria = 0, jmlWanita = 0;
        System.out.print("Cari Dosen Berdasarkan Jenis Kelamin (Pria / Wanita) : ");
        String jenis = scan.nextLine();

        System.out.println("\nDosen dengan jenis kelamin " + jenis);
        for (Dosen13 ds : dosen) {
            if (ds.jenisKelamin.equalsIgnoreCase("Pria")) {
                jmlPria++;
                System.out.println("Kode          : " + ds.kode);
                System.out.println("Nama          : " + ds.nama);
                System.out.println("Usia          : " + ds.usia);
            } else if (ds.jenisKelamin.equalsIgnoreCase("Wanita")) {
                jmlWanita++;
                System.out.println("Kode          : " + ds.kode);
                System.out.println("Nama          : " + ds.nama);
                System.out.println("Usia          : " + ds.usia);
            }
        }
        System.out.println("\nTotal Pria  : " + jmlPria);
        System.out.println("Total Wanita: " + jmlWanita);
    }

    static void rerataUsiaDosenPerJenisKelamin(Dosen13[] dosen) {
        int totalUsia = 0, jumlahDosen = 0;
        System.out.print("\nMasukkan jenis kelamin dosen untuk mencari rerata usia : ");
        String jenis = scan.nextLine();

        for (Dosen13 ds : dosen) {
            if (ds.jenisKelamin.equalsIgnoreCase(jenis)) {
                totalUsia += ds.usia;
                jumlahDosen++;
            }
        }

        if (jumlahDosen > 0) {
            float rerata = (float) totalUsia / jumlahDosen;
            System.out.println("\nRata-rata usia dosen " + jenis + " : " + rerata);
        } else {
            System.out.println("\nTidak ada dosen dengan jenis kelamin " + jenis);
        }
    }

    static void infoDosenTertua(Dosen13[] dosen) {
        if (dosen.length == 0) {
            System.out.println("\nTidak ada data dosen.");
            return;
        }

        int indexTertua = 0;
        for (int i = 1; i < dosen.length; i++) {
            if (dosen[i].usia > dosen[indexTertua].usia) {
                indexTertua = i;
            }
        }
        System.out.println("\nDosen Tertua adalah " + dosen[indexTertua].nama + " dengan umur " + dosen[indexTertua].usia);
    }

    static void infoDosenTermuda(Dosen13[] dosen) {
        if (dosen.length == 0) {
            System.out.println("\nTidak ada data dosen.");
            return;
        }

        int indexTermuda = 0;
        for (int i = 1; i < dosen.length; i++) {
            if (dosen[i].usia < dosen[indexTermuda].usia) {
                indexTermuda = i;
            }
        }
        System.out.println("\nDosen Termuda adalah " + dosen[indexTermuda].nama + " dengan umur " + dosen[indexTermuda].usia);
    }
}
