package jobsheet_3;

public class Mahasiswa13 {
    public String nim;
    public String nama;
    public String kelas;
    public float ipk;

    void cetakInfo() {
        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("Kelas   : " + kelas);
        System.out.println("IPK     : " + ipk);
        System.out.println("-".repeat(30));
    }
}
