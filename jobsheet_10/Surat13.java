package jobsheet_10;

public class Surat13 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;

    public Surat13(){

    }

    public Surat13(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi){
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public void tampilInfo(){
        System.out.println("Id Surat: " + idSurat);
        System.out.println("Nama: " + namaMahasiswa);
        System.out.println("Kelas: " + kelas);
        System.out.println("Jenis Izin: " + jenisIzin);
        System.out.println("Durasi: " + durasi + " jam");
    }
}
