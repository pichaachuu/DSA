package jobsheet_12;
import java.util.*;

public class SLLMain13 {
    public static void main(String[] args) {
        SingleLinkedList13 sll = new SingleLinkedList13();
        Scanner input13 = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU LINKED LIST ===");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (1-2): ");
            pilihan = input13.nextInt();
            input13.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\nInput Data Mahasiswa:");
                    System.out.print("NIM   : ");
                    String nim = input13.nextLine();
                    System.out.print("Nama  : ");
                    String nama = input13.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = input13.nextLine();
                    System.out.print("IPK   : ");
                    double ipk = input13.nextDouble();
                    input13.nextLine();
                    
                    Mahasiswa13 mhs = new Mahasiswa13(nim, nama, kelas, ipk);

                    System.out.println("Tambah ke:");
                    System.out.println("1. Awal");
                    System.out.println("2. Akhir");
                    System.out.println("3. Setelah nama tertentu");
                    System.out.println("4. Setelah indeks tertentu");
                    System.out.print("Pilihan: ");
                    int posisi = input13.nextInt();
                    input13.nextLine();

                    switch (posisi) {
                        case 1:
                            sll.addFirst(mhs);
                            break;
                        case 2:
                            sll.addLast(mhs);
                            break;
                        case 3:
                            System.out.print("Masukkan nama setelah siapa data disisipkan: ");
                            String keyNama = input13.nextLine();
                            sll.insertAfter(keyNama, mhs);    
                            break;
                        case 4:
                            System.out.print("Masukkan indeks (mulai dari 0): ");
                            int index = input13.nextInt();
                            input13.nextLine();
                            sll.insertAt(index, mhs);
                            break;    
                    }
                    break;
                case 2:
                    sll.print();    
                default:
                    break;
            }
        } while (pilihan != 0);
        input13.close();
    }
}
