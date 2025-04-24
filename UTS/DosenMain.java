package UTS;
import java.util.*;
public class DosenMain {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        Dosen13[] dosen = {
            new Dosen13(22407864, "Adigang", "adigang@gmail.com", 2003, "Teknik Informatika"),
            new Dosen13(22407862, "Adigung", "adigung@gmail.com", 2004, "Sistem Informasi Bisnis"),
            new Dosen13(22407860, "Adiguna", "adiguna@gmail.com", 2005, "Teknik Komputer")
        };

        int pilih;
        do {
            System.out.println("Sistem Pengelolaan Data Dosen");
            System.out.println("1. Tampilkan Data Dosen");
            System.out.println("2. Mengurutkan Data dosen berdasarkan NIDN secara Ascending");
            System.out.println("3. Mencari Data Dosen berdasarkan Nama");
            System.out.println("4. Mengurutkan Data dosen berdasarkan Masa Kerja secara Descending");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = input13.nextInt();
            input13.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("Data Dosen:");
                    for (Dosen13 d : dosen) {
                        d.tampilInfo();
                    }
                    break;
                case 2:
                    Dosen13.bubbleSortASC(dosen);
                    System.out.println("Data Dosen setelah diurutkan berdasarkan NIDN secara Ascending:");
                    for (Dosen13 d : dosen) {
                        d.tampilInfo();
                    }
                    break;
                case 3:
                    System.out.print("Masukkan nama yang dicari: ");
                    String nama = input13.nextLine();
                    Dosen13.linearSearch(dosen, nama);
                    break;
                case 4:
                    Dosen13.bubbleSortDesc(dosen);
                    System.out.println("Data Dosen setelah diurutkan berdasarkan Masa Kerja secara Descending:");
                    for (Dosen13 d : dosen) {
                        d.tampilInfo();
                    }
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilih != 0);
        input13.close();
    }
}
