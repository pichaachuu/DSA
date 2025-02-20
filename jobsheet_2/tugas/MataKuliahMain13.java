package jobsheet_2.tugas;

public class MataKuliahMain13 {
    public static void main(String[] args) {
        MataKuliah13 mk1 = new MataKuliah13();
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.kodeMK = "ASD24";
        mk1.sks = 1;
        mk1.jumlahJam = 8;

        mk1.ubahSKS(2);
        mk1.tambahJam(2);
        mk1.kurangJam(4);
        mk1.tampilInformasi();

        System.out.println();

        MataKuliah13 mk2 = new MataKuliah13("Praktikum Algoritma dan Strukrur Data", "PASD24", 2, 5);
        mk2.ubahSKS(3);
        mk2.tambahJam(1);
        mk2.kurangJam(4);
        mk2.tampilInformasi();
    }
}