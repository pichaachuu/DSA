package jobsheet_10;

public class Mahasiswa13 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    Mahasiswa13(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai(int nilai){
        this.nilai = nilai;
    }
}
