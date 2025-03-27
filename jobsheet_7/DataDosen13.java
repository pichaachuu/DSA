package jobsheet_7;

public class DataDosen13 {
    Dosen13[] dataDosen = new Dosen13[10];
    int idx;

    void tambah(Dosen13 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampilData() {
        for (Dosen13 dsn : dataDosen) {
            if (dsn != null) {
                dsn.tampil();
                System.out.println("-".repeat(30));
            }
        }
    }

    void sortingASCBubble() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen13 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = tmp;
                }
            }
        }
    }

    void sortingDSCSelection() {
        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[idxMax].usia) {
                    idxMax = j;
                }
            }
            Dosen13 tmp = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }

    void sortingDSCInsertion() {
        for (int i = 1; i < idx; i++) {
            Dosen13 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }

    void sequentialSearch(String cari) {
        int count = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(cari)) {
                dataDosen[i].tampil();
                System.out.println("-".repeat(30));
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Data dosen dengan nama \"" + cari + "\" tidak ditemukan.");
        } else if (count > 1) {
            System.out.println("⚠️ Peringatan: Terdapat lebih dari satu hasil pencarian untuk nama \"" + cari + "\"!");
        }
    }

    
    void binarySearch(int cari) {
        sortingASCBubble();
        int left = 0;
        int right = idx - 1;
        int count = 0;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (dataDosen[mid].usia == cari) {
                for (int i = mid; i >= 0 && dataDosen[i].usia == cari; i--) {
                    dataDosen[i].tampil();
                    System.out.println("-".repeat(30));
                    count++;
                }
                for (int i = mid + 1; i < idx && dataDosen[i].usia == cari; i++) {
                    dataDosen[i].tampil();
                    System.out.println("-".repeat(30));
                    count++;
                }
                break;
            } else if (dataDosen[mid].usia > cari) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (count == 0) {
            System.out.println("Data dosen dengan usia " + cari + " tidak ditemukan.");
        } else if (count > 1) {
            System.out.println("⚠️ Peringatan: Terdapat lebih dari satu hasil pencarian untuk usia \"" + cari + "\"!");
        }
    }
}
