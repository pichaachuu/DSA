package kuis_1;

public class MataKuliahMain13 {
    public static void main(String[] args) {
        Dosen13[] dosen = new Dosen13[3];

        dosen[0] = new Dosen13("534267", "Dodi", 2025, "S3", "SIB");
        dosen[1] = new Dosen13("989269", "OPI", 1998, "S3", "TI");
        dosen[2] = new Dosen13(null, null, 0, null, null);
        
        MataKuliah13 mk = new MataKuliah13("SIS0$", "ASD", 3, dosen);
        mk.tampilkanInfo();
        mk.ubahSKS(4);
        mk.ubahNamaMK("Praktikum ASD");
        mk.tampilkanInfo();
        Dosen13 dosenbaru = new Dosen13("57279", "UDIN", 1990, "S2", "TI");
        mk.tambahDosen(dosenbaru);
        mk.tampilkanInfo();
    }
}
