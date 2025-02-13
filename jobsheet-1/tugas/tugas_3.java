package tugas;
import java.util.*;

public class tugas_3 {
    static String[] MK;
    static int[] sks;
    static int[] semester;
    static String[] hari;
    static int n;

    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        while (true) {
            System.out.println("=".repeat(50));
            System.out.println("SISTEM MANAJEMEN JADWAL KULIAH");
            System.out.println("=".repeat(50));
            System.out.println("");

            System.out.println("MENU PROGRAM");
            System.out.println("1. Input Data Mata Kuliah");
            System.out.println("2. Tampilkan Jadwal Kuliah");
            System.out.println("3. Cari Mata Kuliah");
            System.out.println("4. Keluar");
            System.out.print("Pilihan menu: ");
            int menu = input13.nextInt();
            if (menu == 4) {
                System.out.println("Terima kasih telah menggunakan program!");
                break;
            }

            switch (menu) {
                case 1:
                    inputDataMatkul(input13);
                    break;
                case 2:
                    jadwal(input13);
                    break;
                case 3:
                    cariMatkul(input13);
                    break;
                default:
                    System.out.println("Silahkan input angka yang tepat!");
                    return;
            }
        }
        input13.close();

    }

    public static void inputDataMatkul(Scanner input13) {
        System.out.print("Masukkan jumlah mata kuliah: ");
        n = input13.nextInt();
        input13.nextLine();
        MK = new String[n];
        sks = new int[n];
        semester = new int[n];
        hari = new String[n];

        for (int i = 0; i < MK.length; i++) {
            System.out.println("Mata Kuliah Ke-" + (i + 1));
            System.out.print("Mata Kuliah: ");
            MK[i] = input13.nextLine();
            System.out.print("Jumlah SKS: ");
            sks[i] = input13.nextInt();
            System.out.print("Semester: ");
            semester[i] = input13.nextInt();
            input13.nextLine();
            System.out.print("Hari: ");
            hari[i] = input13.nextLine();
        }
        System.out.println("Data Berhasil Ditambahkan");
        System.out.println();
    }

    public static void jadwal(Scanner input13) {
        if (n == 0) {
            System.out.println("Belum ada data mata kuliah");
            return;
        }
        System.out.println("");
        System.out.println("=".repeat(50));
        System.out.println("Tampilkan Jadwal Kuliah Sesuai: ");
        System.out.println("1. Menampilkan seluruh jadwal kuliah");
        System.out.println("2. Menampilkan jadwal kuliah berdasarkan hari tertentu");
        System.out.println("3. Menampilkan jadwal kuliah berdasarkan semester tertentu");
        System.out.println("");
        System.out.print("Pilihan menu: ");
        int menuJadwal = input13.nextInt();

        switch (menuJadwal) {
            case 1:
                alljadwal();
                break;
            case 2:
                hariJadwal(input13);
                break;
            case 3:
                semesterJadwal(input13);
                break;
            default:
                System.out.println("Angka tidak valid");
                break;
        }
        System.out.println();
    }

    public static void alljadwal() {
        System.out.println("Mata Kuliah\t\tSKS\tSemester\tHari");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s%-10d%-10d%-10s\n", MK[i], sks[i], semester[i], hari[i]);
        }
        System.out.println();
    }

    public static void hariJadwal(Scanner input13) {
        System.out.println();
        System.out.print("Masukkan nama hari yang dicari: ");
        input13.nextLine();
        String cariHari = input13.nextLine();
        boolean found = false;
        System.out.println("Mata Kuliah\t\tSKS\tSemester\tHari");
        for (int i = 0; i < MK.length; i++) {
            if (cariHari.equalsIgnoreCase(hari[i])) {
                System.out.printf("%-25s%-10d%-10d%-10s\n", MK[i], sks[i], semester[i], hari[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Hari tidak ditemukan");
        }
    }

    public static void semesterJadwal(Scanner input13) {
        System.out.println();
        System.out.print("Masukkan semester yang dicari: ");
        int cariSMT = input13.nextInt();
        boolean found = false;
        System.out.println("Mata Kuliah\t\tSKS\tSemester\tHari");
        for (int i = 0; i < MK.length; i++) {
            if (cariSMT == semester[i]) {
                System.out.printf("%-25s%-10d%-10d%-10s\n", MK[i], sks[i], semester[i], hari[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada semester yang anda cari");
        }
    }

    public static void cariMatkul(Scanner input13) {
        System.out.println();
        input13.nextLine(); // Consume newline left by nextInt()
        System.out.print("Masukkan nama mata kuliah yang ingin dicari: ");
        String cariMatkul = input13.nextLine();
        boolean found = false;
        System.out.println("Mata Kuliah\t\tSKS\tSemester\tHari");
        for (int i = 0; i < MK.length; i++) {
            if (cariMatkul.equalsIgnoreCase(MK[i])) {
                System.out.printf("%-25s%-10d%-10d%-10s\n", MK[i], sks[i], semester[i], hari[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada mata kuliah yang anda cari");
        }
    }
}
