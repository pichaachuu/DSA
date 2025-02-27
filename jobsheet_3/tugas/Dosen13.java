package jobsheet_3.tugas;

public class Dosen13 {
    public String kode;
    public String nama;
    public String jenisKelamin;
    public int usia;

    public Dosen13(String kode, String nama, String jenisKelamin, int usia){
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void cetakInfo(){
        System.out.println("Kode            : " + kode);
        System.out.println("Nama            : " + nama);
        System.out.println("Jenis Kelamin   : " + jenisKelamin);
        System.out.println("Usia            : " + usia);
        System.out.println("-".repeat(30));
    }
    
}