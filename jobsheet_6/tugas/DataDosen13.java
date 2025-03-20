package jobsheet_6.tugas;

public class DataDosen13 {
    Dosen13[] dataDosen = new Dosen13[10];
    int idx;

    void tambah (Dosen13 dsn){
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampilData(){
        for (Dosen13 dsn : dataDosen) {
            dsn.tampil();
            System.out.println("-".repeat(30));
        }
    }

    void sortingASCBubble(){
        for (int i = 0; i < dataDosen.length - 1; i++){
            for (int j = 1; j < dataDosen.length - i; j++){
                if (dataDosen[j].usia < dataDosen[j-1].usia) {
                    Dosen13 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j-1];
                    dataDosen[j-1] = tmp;
                }
            }
        }
    }

    void sortingDSCSelection(){
        for (int i = 0; i < dataDosen.length-1; i++){
            int idxMin = i;
            for (int j= i+1; j < dataDosen.length; j++){
                if (dataDosen[j].usia > dataDosen[idxMin].usia) {
                    idxMin=j;
                }
            }
            Dosen13 tmp = dataDosen[idxMin];
            dataDosen[idxMin] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }

    void sortingDSCInsertion(){
        for (int i = 1; i < dataDosen.length; i++){
            Dosen13 temp = dataDosen[i];
            int j=i;
            while (j>0 && dataDosen[j-1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j-1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }
}
