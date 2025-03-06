package kuis_1;
import java.util.*;

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

    public void tambahDosen (Dosen13[] dosen){
        Scanner input13 = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen yang ingin diinput: ");
        int jmlDosen = input13.nextInt();

        dosenPengampu = new Dosen13[2 + jmlDosen];
        for (int i = 2; i < dosen.length; i++) {
            System.out.println("NI");
        }
        
    }
}
