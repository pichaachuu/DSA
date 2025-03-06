package kuis_1;

public class Dosen13 {
    public String nidn;
    public String nama;
    public int tahunMasuk;
    public String jenjangPendidikan;
    public String prodi;

    public Dosen13(){

    }

    public Dosen13 (String nidn, String nama, int tahunMasuk, String jenjangPendidikan, String prodi){
        this.nidn = nidn;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.jenjangPendidikan = jenjangPendidikan;
        this.prodi = prodi;
    }

    public void tampilkanInfo(){
        System.out.println("NIDN        : " + nidn);
        System.out.println("Nama        : " + nama);
        System.out.println("Tahun Masuk : " + tahunMasuk);
        System.out.println("Jenjang Pend: " + jenjangPendidikan);
        System.out.println("Prodi       : " + prodi);
    }

    public void ubahProdi (String ProdiBaru){
        nama = ProdiBaru;
    }

    public void ubahPendidikan (String pendidikanUpdate){
        jenjangPendidikan = pendidikanUpdate;
    }


}
