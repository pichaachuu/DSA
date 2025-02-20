package jobsheet_2.tugas;

public class DosenMain13 {
    public static void main(String[] args) {
        Dosen13 dosen1 = new Dosen13("123ASD", "Okto", true, 2006, "Listrik");
        dosen1.tampilInformasi(2025);
        dosen1.setStatusAktif(false);
        dosen1.tampilInformasi(2025);
    }
}
