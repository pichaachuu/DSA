package jobsheet_6;

public class MahasiswaBerprestasi13 {
    Mahasiswa13[] listMHS = new Mahasiswa13[5];
    int idx;

    void tambah (Mahasiswa13 m){
        if (idx < listMHS.length) {
            listMHS[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil (){
        for (Mahasiswa13 m : listMHS) {
            m.tampilInformasi();
            System.out.println("-".repeat(30));
        }
    }

    void bubbleSort(){
        for (int i = 0; i < listMHS.length - 1; i++){
            for (int j = 1; j < listMHS.length - i; j++){
                if (listMHS[j].ipk > listMHS[j-1].ipk) {
                    Mahasiswa13 tmp = listMHS[j];
                    listMHS[j] = listMHS[j-1];
                    listMHS[j-1] = tmp;
                }
            }
        }
    }
}
