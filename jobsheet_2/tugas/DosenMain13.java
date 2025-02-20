package jobsheet_2.tugas;

public class DosenMain13 {
    public static void main(String[] args) {
        Dosen13 dosen1 = new Dosen13("123ASD", "Okto", true, 2006, "Listrik");
        dosen1.tampilInformasi(2025);
        dosen1.setStatusAktif(false);
        dosen1.tampilInformasi(2025);

        Dosen13 dosen2 = new Dosen13();
        dosen1.nama = "April";
        dosen2.idDosen = "432ER";
        dosen2.statusAktif = false;
        dosen2.tahunBergabung = 2020;
        dosen2.bidangKeahlian = "Artificial Intelligence";
        dosen2.tampilInformasi(2025);
        dosen2.setStatusAktif(true);
        dosen2.tampilInformasi(2025);
    }
}
