package jobsheet_7;
import java.util.*;
public class MahasiswaDemo13 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input13.nextInt();
        input13.nextLine();

        MahasiswaBerprestasi13 list = new MahasiswaBerprestasi13(jumlahMahasiswa);
        Mahasiswa13[] m = new Mahasiswa13[jumlahMahasiswa];
        
        for (int i = 0; i < m.length; i++) {
            System.out.println("\nInput data mahasiswa ke-" + (i+1));
            
            System.out.print("Nama: ");
            String nama = input13.nextLine();
            
            System.out.print("NIM: ");
            String nim = input13.nextLine();
            
            System.out.print("Kelas: ");
            String kelas = input13.nextLine();
            
            System.out.print("IPK: ");
            double ipk = input13.nextDouble();
            input13.nextLine();
            
            m[i] = new Mahasiswa13(nim, nama, kelas, ipk);
            list.tambah(m[i]);
        }

        list.tampil();

        System.out.println("-".repeat(30));
        System.out.println("Pencarian data");
        System.out.println("-".repeat(30));
        System.out.println("Masukkan ipk mahasiswa yang dicari");
        System.out.print("IPK : ");
        double cari = input13.nextDouble();

        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(posisi, pss);
        list.tampilDataSearcj(cari, pss);

        System.out.println("-".repeat(30));
        System.out.println("Pencarian data");
        System.out.println("-".repeat(30));
        System.out.println("Masukkan ipk mahasiswa yang dicari");
        System.out.print("IPK : ");
        double cari2 = input13.nextDouble();

        System.out.println("-".repeat(30));
        System.out.println("menggunakan binary search");
        System.out.println("-".repeat(30));
        double posisi2 = list.findBinarySearch(cari2, 0, m.length-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari2, pss2);
        list.tampilDataSearcj(cari2, pss2); 
        
        input13.close();
    }
}