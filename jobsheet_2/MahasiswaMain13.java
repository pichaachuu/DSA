package jobsheet_2;

public class MahasiswaMain13 {
    public static void main(String[] args) {
        Mahasiswa13 mhs1 = new Mahasiswa13("Muhammad Ali Farhan", "2241720171", 3.55, "TI 2J");
        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa13 mhs2 = new Mahasiswa13("Annisa Nabil", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa13 mhs3 = new Mahasiswa13("Nafisah Aliyah Khumaini", "2441070060066", 3.79, "SIB 1A");
        mhs3.tampilkanInformasi();
    }
}
