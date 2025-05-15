package jobsheet_12.Tugas;
import java.util.*;
public class TugasMain {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        TugasLinkedList antri = new TugasLinkedList();
        int pilihan;

        do {
            System.out.println("\n=== Antrian Mahasiswa ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Tampilkan Antrian");
            System.out.println("6. Jumlah Mahasiswa yang mengantri");
            System.out.println("7. Mengosongkan Antrian");
            System.out.print("Masukkan pilihan: ");
            pilihan = input13.nextInt();
            input13.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM       : ");
                    String nim = input13.nextLine();
                    System.out.print("Nama      : ");
                    String nama = input13.nextLine();
                    System.out.print("Kelas     : ");
                    String kelas = input13.nextLine();
                    
                    Mahasiswa13 mhs = new Mahasiswa13(nim, nama, kelas);
                    antri.addLast(mhs);
                    break;
                case 2:
                    antri.removeFirst();
                    break;
                case 3:
                    antri.lihatAntrianAwal();
                    break;
                case 4:
                    antri.lihatAkhir();
                    break;
                case 5:
                    antri.print();
                    break;
                case 6:
                    System.out.println("Jumlah Mahasiswa yang mengantri " + antri.getSize());
                    break;
                case 7:
                    antri.clear();                        
                    break;
            }
        } while (pilihan != 0);
        input13.close();
    }
}
