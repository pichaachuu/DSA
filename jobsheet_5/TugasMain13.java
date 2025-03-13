package jobsheet_5;

public class TugasMain13 {
    public static void main(String[] args) {
        String[][] arrMHS = {
            {"Ahmad",   "220101001",    "2022", "78", "82"},
            {"Budi",    "220101002",    "2022", "85", "88"},
            {"Cindy",   "220101003",    "2022", "90", "87"},
            {"Dian",    "220101004",    "2022", "76", "79"},
            {"Eko",     "220101005",    "2022", "92", "95"},
            {"Fajar",   "220101006",    "2022", "88", "85"},
            {"Gina",    "220101007",    "2022", "80", "83"},
            {"Hadi",    "220101008",    "2022", "82", "84"},
        };

        Tugas13[] arrMahasiswa = new Tugas13[arrMHS.length];
        for (int i = 0; i < arrMHS.length; i++) {
            arrMahasiswa[i] = new Tugas13(
                arrMHS[i][0], // Nama
                arrMHS[i][1], // NIM
                Integer.parseInt(arrMHS[i][2]), // Tahun
                Integer.parseInt(arrMHS[i][3]), // UTS
                Integer.parseInt(arrMHS[i][4])  // UAS
            );
        }

        Tugas13 mhs = new Tugas13();

        // Menampilkan nilai UTS tertinggi
        System.out.println("NILAI UTS TERTINGGI MENGGUNAKAN DIVIDE AND CONQUER");
        System.out.println("-".repeat(100));
        System.out.printf("| %-10s | %-15s | %-5s | %-16s | %-9s |\n", "Nama", "NIM", "Tahun", "UTS", "UAS");
        System.out.println("-".repeat(100));
        arrMahasiswa[mhs.indexDataMHS(arrMHS, 0, arrMHS.length - 1, true)].tampilkanData();
        System.out.println("-".repeat(100));

        // Menampilkan nilai UTS terendah
        System.out.println("NILAI UTS TERENDAH MENGGUNAKAN DIVIDE AND CONQUER");
        System.out.println("-".repeat(100));
        System.out.printf("| %-10s | %-15s | %-5s | %-16s | %-9s |\n", "Nama", "NIM", "Tahun", "UTS", "UAS");
        System.out.println("-".repeat(100));
        arrMahasiswa[mhs.indexDataMHS(arrMHS, 0, arrMHS.length - 1, false)].tampilkanData();
        System.out.println("-".repeat(100));

        // Menghitung rata-rata nilai UAS
        System.out.println("RATA-RATA UAS SELURUH MAHASISWA MENGGUNAKAN BRUTE FORCE");
        System.out.printf("Rata-rata: %.3f\n", mhs.avgUAS(arrMHS));
    }
}
