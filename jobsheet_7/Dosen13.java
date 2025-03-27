package jobsheet_7;

public class Dosen13 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Dosen13(String kd, String name, boolean jk, int age){
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil(){
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        if (jenisKelamin == true) {
            System.out.println("Jenis Kelamin: Pria");
        } else {
            System.out.println("Jenis Kelamin: Perempuan");
        }
        System.out.println("Usia:" + usia);
    }
}
