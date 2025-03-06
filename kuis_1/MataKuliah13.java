package kuis_1;

public class MataKuliah13 {
    public String kodeMK;
    public String namaMK;
    public int sks;
    public Dosen13[] dosenPengampu;

    public MataKuliah13(){

    }

    public MataKuliah13(String kodeMK, String namaMK, int sks, Dosen13[] dosenPengampu){
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        this.dosenPengampu = dosenPengampu;
    }

    public void tampilkanInfo(){
        System.out.println("Kode MK     : " + kodeMK);
        System.out.println("Nama MK     : " + namaMK);
        System.out.println("SKS         : " + sks);
        for (int i = 0; i < dosenPengampu.length; i++) {
            dosenPengampu[i].tampilkanInfo();
        }
    }

    public void ubahNamaMK(String namaMKBaru){
        namaMK = namaMKBaru;
    }

    public void ubahSKS(int SKS){
        if (sks < 2) {
            System.out.println("SKS harus berjumlah 2");
        } else {
            sks = SKS;
        }
    }

    public void tambahDosen (Dosen13 dosen){
        for (int i = 0; i < dosenPengampu.length; i++) {
            if (dosenPengampu[i] == null || (dosenPengampu[i].nidn == null && dosenPengampu[i].nama == null)) {
                dosenPengampu[i] = dosen;
            }
        }
        
    }
}
