package jobsheet_12.Tugas;

public class Mahasiswa13 {
    String nim;
    String nama;
    String kelas;


    public Mahasiswa13(String nim, String nama, String kelas){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    public void tampilInformasi(){
        System.out.println(nama + "\t\t" + nim + "\t\t" + kelas);
    }
}
