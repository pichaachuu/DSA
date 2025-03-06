package kuis_1;

public class MataKuliahMain13 {
    public static void main(String[] args) {
        Dosen13[] dosen = new Dosen13[2];

        dosen[0] = new Dosen13("534267", "Dodi", 2025, "S3", "SIB");
        dosen[1] = new Dosen13("989269", "OPI", 1998, "S3", "TI");
        
        MataKuliah13 mk = new MataKuliah13("SIS0$", "ASD", 3, dosen);
        mk.tampilkanInfo();
        mk.ubahSKS(4);
        mk.ubahNamaMK("Praktikum ASD");
        mk.tampilkanInfo();
    }
}
