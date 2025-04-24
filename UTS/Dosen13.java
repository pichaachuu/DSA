package UTS;

public class Dosen13 {
    long NIDN;
    String nama;
    String email;
    int tahunMasuk;
    String prodi;
    int masaKerja;
    
    public Dosen13(long NIDN, String nama, String email, int tahunMasuk, String prodi) {
        this.NIDN = NIDN;
        this.nama = nama;
        this.email = email;
        this.tahunMasuk = tahunMasuk;
        this.prodi = prodi;
        hitungMasaKerja();
    }

    void tampilInfo(){
        System.out.println("NIDN: " + NIDN);
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
        System.out.println("Tahun Masuk: " + tahunMasuk);
        System.out.println("Prodi: " + prodi);
        System.out.println("Masa Kerja: " + masaKerja + " tahun");
        System.out.println();
    }

    static void bubbleSortASC(Dosen13[] dosen){
        for (int i = 0; i < dosen.length-1; i++) {
            for (int j = 1; j < dosen.length-i; j++) {
                Dosen13 tmp;
                if (dosen[j].NIDN < dosen[j-1].NIDN) {
                    tmp = dosen[j];
                    dosen[j] = dosen[j-1];
                    dosen[j-1] = tmp;   
                    
                }
            }
        }
    }

    void hitungMasaKerja(){
        masaKerja = 2025-tahunMasuk;
    }

    static void bubbleSortDesc(Dosen13[] dosen){
        for (int i = 0; i < dosen.length-1; i++) {
            for (int j = 1; j < dosen.length-i; j++) {
                Dosen13 temp;
                if (dosen[j].masaKerja > dosen[j-1].masaKerja) {
                    temp = dosen[j];
                    dosen[j] = dosen[j-1];
                    dosen[j-1] = temp;
                }
            }
        }
    }

    static void linearSearch(Dosen13[] dosen, String nama) {
        boolean found = false;
        for (int i = 0; i < dosen.length; i++) {
            if (dosen[i].nama.equalsIgnoreCase(nama)) {
                System.out.println("Dosen ditemukan:");
                dosen[i].tampilInfo();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Dosen tidak ditemukan.");
        }
    }
}
