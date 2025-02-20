package jobsheet_2.tugas;

public class Dosen13 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen13() {
    }

    public Dosen13(String id_dosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        idDosen = id_dosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilInformasi(int thnSkrg) {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        if (statusAktif) {
            System.out.println("Status: Aktif");
        } else {
            System.out.println("Status: Tidak Aktif");
        }
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Periode Bekerja: " + hitungMasaKerja(thnSkrg) + " tahun");
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
    }

    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
}
