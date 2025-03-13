package jobsheet_5;

public class Tugas13 {
    String nama, nim;
    int tahun, uts, uas;

    public Tugas13(String nama, String nim, int tahun, int uts, int uas){
        this.nama = nama;
        this.nim = nim;
        this.tahun = tahun;
        this.uts = uts;
        this.uas = uas;
    }

    public Tugas13(){

    }

    public void tampilkanData(){
        System.out.printf("| %-10s | %-15s | %-5d | %-16d | %-9d |\n", nama, nim, tahun, uts, uas);
    }

    public int indexDataMHS(String[][] arrDataMHS, int l, int r, boolean indexTertinggi){
        if (l == r) {
            return l;
        } else if (l < r) {
            int mid = (l+r)/2;
            int biggerL = indexDataMHS(arrDataMHS, l, mid, indexTertinggi);
            int biggerR = indexDataMHS(arrDataMHS, mid + 1, r, indexTertinggi);

            int tertinggiLeft = Integer.parseInt(arrDataMHS[biggerL][3]);
            int terendahRight = Integer.parseInt(arrDataMHS[biggerR][3]);

            if (indexTertinggi) {
                if (tertinggiLeft > terendahRight) {
                    return biggerL;
                } else {
                    return biggerR;
                }
            } else {
                if (tertinggiLeft < terendahRight) {
                    return biggerL;
                } else {
                    return biggerR;
                }
            }
        } else {
            return 0;
        }
    }

    public double avgUAS(String[][] arrDataMHS){
        double totalUAS = 0;
        for (int i = 0; i < arrDataMHS.length; i++) {
            totalUAS += Double.parseDouble(arrDataMHS[i][4]);
        }
        return totalUAS/arrDataMHS.length;
    }
}
