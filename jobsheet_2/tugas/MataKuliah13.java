package jobsheet_2.tugas;

public class MataKuliah13 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah13 () {

    }

    public MataKuliah13(String namaMatkul, String kodeMatkul, int sks, int jam){
        kodeMK = kodeMatkul;
        nama = namaMatkul;
        this.sks = sks;
        jumlahJam = jam;
    }

    void tampilInformasi(){
        System.out.println("Mata Kuliah: " + nama);
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Jumlah SKS: " + sks + "SKS");
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru){
        sks = sksBaru;
        System.out.println("SKS telah diubah");
    }

    void tambahJam(int jam){
        jumlahJam += jam;
    }

    void kurangJam(int jam){
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam telah dikurangi");
        } else {
            System.out.println("Jam tidak dapat dikurangi");
        }
    }
}
