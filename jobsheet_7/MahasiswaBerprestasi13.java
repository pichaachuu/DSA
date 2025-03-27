package jobsheet_7;

public class MahasiswaBerprestasi13 {
    Mahasiswa13[] listMHS;
    int idx;

    MahasiswaBerprestasi13(int jumlahMahasiswa) {
        listMHS = new Mahasiswa13[jumlahMahasiswa];
    }

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

    void selectionSort(){
        for (int i = 0; i < listMHS.length-1; i++){
            int idxMin = i;
            for (int j= i+1; j < listMHS.length; j++){
                if (listMHS[j].ipk<listMHS[idxMin].ipk) {
                    idxMin=j;
                }
            }
            Mahasiswa13 tmp = listMHS[idxMin];
            listMHS[idxMin] = listMHS[i];
            listMHS[i] = tmp;
        }
    }

    void insertionSort(){
        for (int i = 1; i < listMHS.length; i++){
            Mahasiswa13 temp = listMHS[i];
            int j=i;
            while (j>0 && listMHS[j-1].ipk > temp.ipk) {
                listMHS[j] = listMHS[j-1];
                j--;
            }
            listMHS[j] = temp;
        }
    }

    void insertionSortDSC(){
        for (int i = 1; i < listMHS.length; i++){
            Mahasiswa13 temp = listMHS[i];
            int j=i;
            while (j>0 && listMHS[j-1].ipk < temp.ipk) {
                listMHS[j] = listMHS[j-1];
                j--;
            }
            listMHS[j] = temp;
        }
    }

    int sequentialSearching(double cari){
        int posisi = -1;
        for (int j=0; j<listMHS.length; j++){
            if (listMHS[j].ipk==cari) {
                posisi=j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos){
        if (pos!=1) {
            System.out.println("data mahasiswa dengan IPK : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    void tampilDataSearcj(double x, int pos){
        if (pos != 1) {
            System.out.println("nim\t : " + listMHS[pos].nim);
            System.out.println("nama\t : " + listMHS[pos].nama);
            System.out.println("kelas\t : " + listMHS[pos].kelas);
            System.out.println("ipk\t : " + x);
        }
        else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }

    int findBinarySearch(double cari, int left, int right){
        int mid;
        if (right>=left) {
            mid = (left+right)/2;
            if (cari == listMHS[mid].ipk) {
                return (mid);
            }
            else if (listMHS[mid].ipk < cari) {
                return findBinarySearch(cari, left, mid-1);
            }
            else {
                return findBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }



}
