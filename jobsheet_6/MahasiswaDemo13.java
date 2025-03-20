package jobsheet_6;
import java.util.*;
public class MahasiswaDemo13 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        MahasiswaBerprestasi13 list = new MahasiswaBerprestasi13();
        Mahasiswa13[] m = new Mahasiswa13[5];
        
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

        System.out.println("\nData mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DSC)");
        list.insertionSortDSC();
        list.tampil();
        
        input13.close();
    }
}