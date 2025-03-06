package kuis_1;
public class DosenMain13 {
    public static void main(String[] args) {
        Dosen13 dosen1 = new Dosen13();
        dosen1.nidn = "TER67";
        dosen1.nama = "EKO";
        dosen1.tahunMasuk = 1997;
        dosen1.jenjangPendidikan = "S1";
        dosen1.prodi = "Teknik Informatika";
        dosen1.tampilkanInfo();
        dosen1.ubahPendidikan("S2");
        dosen1.ubahProdi("Sistem Informasi");
        dosen1.tampilkanInfo();

        Dosen13 dosen2 = new Dosen13("TER34", "Widi", 2020, "S2", "MRK");
        dosen2.tampilkanInfo();
        dosen2.ubahPendidikan("S3");
        dosen2.ubahProdi("Teknik Sipil");
        dosen2.tampilkanInfo();
    }
}
