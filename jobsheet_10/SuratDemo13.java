package jobsheet_10;
import java.util.*;
public class SuratDemo13 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        StackSurat13 stack = new StackSurat13(5);
        int pilih;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Mahasiswa");
            System.out.print("Pilih: ");
            pilih = input13.nextInt();
            input13.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = input13.nextLine();
                    System.out.print("Nama: ");
                    String nama = input13.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = input13.nextLine();
                    System.out.print("Jenis Izin: ");
                    char jenisIzin = input13.nextLine().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = input13.nextInt();
                    input13.nextLine();
                    Surat13 surat = new Surat13(idSurat, nama, kelas, jenisIzin, durasi);
                    stack.push(surat);
                    System.out.printf("Surat %s berhasil ditambahkan\n", surat.namaMahasiswa);
                    break;
                case 2:
                    stack.pop();
                    System.out.println("Surat berhasil diverifikasi");
                    System.out.println("Surat yang belum terverifikasi: ");
                    System.out.println("ID Surat\tNama\tKelas\tJenis Izin\tDurasi");
                    stack.print();
                    break;
                case 3:
                    Surat13 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir dikumpulkan oleh " + lihat.namaMahasiswa);
                    }
                    break;
                case 4: 
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cari = input13.nextLine();
                    stack.LinearSearch(cari);
                    break;
                case 0:
                    System.out.println("Telah Keluar Dari Program");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!.");
                    break;
            }
        } while (pilih >= 1 && pilih <= 4);
        input13.close();
    }
}
