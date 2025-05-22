package jobsheet_13;

import java.util.Scanner;

public class DLLMain13 {
    public static Mahasiswa13 inputMahasiswa(Scanner scan){
        System.out.print("NIM: ");
        String nim = scan.nextLine();
        System.out.print("Nama: ");
        String nama = scan.nextLine();
        System.out.print("Kelas: ");
        String kelas = scan.nextLine();
        System.out.print("IPK: ");
        double ipk = scan.nextDouble();
        scan.nextLine();
        return new Mahasiswa13(nim, nama, kelas, ipk);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoubleLinkedLists list = new DoubleLinkedLists();
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus awal");
            System.out.println("4. Hapus akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Insert setelah NIM tertentu");
            System.out.println("7. Cari Mahasiswa berdasarkan NIM");
            System.out.println("8. Tambah di indeks tertentu");
            System.out.println("9. Hapus setelah NIM tertentu");
            System.out.println("10. Hapus berdasarkan indeks");
            System.out.println("11. Tampilkan data pertama");
            System.out.println("12. Tampilkan data terakhir");
            System.out.println("13. Tampilkan data di indeks tertentu");
            System.out.println("14. Tampilkan jumlah data");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt(); 
            scan.nextLine();

            switch (pilih) {
                case 1:
                    Mahasiswa13 mhsF = inputMahasiswa(scan);
                    list.addFirst(mhsF);
                    break;
                case 2:
                    Mahasiswa13 mhsL = inputMahasiswa(scan);
                    list.addLast(mhsL);
                    break;
                case 3:
                    list.removeFirst();
                    break;
                case 4:
                    list.removeLast();
                    break;
                case 5:
                    list.print();
                    break;
                case 6:
                    System.out.print("NIM disisipkan setelah: ");
                    String key = scan.nextLine();
                    Mahasiswa13 mhsA = inputMahasiswa(scan);
                    list.insertAfter(key, mhsA);
                    break;    
                case 7:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine();
                    Node13 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;
                case 8:
                    System.out.print("Index: ");
                    int idx = scan.nextInt(); 
                    scan.nextLine();
                    Mahasiswa13 mhsI = inputMahasiswa(scan);
                    list.add(mhsI, idx);;
                    break;
                case 9:
                    System.out.print("Hapus NIM setelah: ");
                    String kunci = scan.nextLine();
                    list.removeAfter(kunci);
                    break;
                case 10:
                    System.out.print("Index yang ingin dihapus: ");
                    idx = scan.nextInt(); 
                    scan.nextLine();
                    list.remove(idx);
                    break;
                case 11:
                    list.getFirst();
                    break;
                case 12:
                    list.getLast();
                    break;
                case 13:
                    System.out.print("Index yang ingin ditampilkan: ");
                    idx = scan.nextInt(); 
                    scan.nextLine();
                    list.getIndex(idx);
                    break;
                case 14:
                    System.out.println("Jumlah data: " + list.size());
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih != 0);

        scan.close();
    }
}
