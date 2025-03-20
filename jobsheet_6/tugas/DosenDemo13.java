package jobsheet_6.tugas;

public class DosenDemo13 {
    public static void main(String[] args) {
        DataDosen13 list = new DataDosen13();
        Dosen13 d1 = new Dosen13("123", "Zidan", true, 35);
        Dosen13 d2 = new Dosen13("124", "Ayu", false, 30);
        Dosen13 d3 = new Dosen13("125", "Sofi", false, 29);
        Dosen13 d4 = new Dosen13("126", "Sita", false, 45);
        Dosen13 d5 = new Dosen13("127", "Miki", true, 25);
        Dosen13 d6 = new Dosen13("128", "Ali", true, 50);
        Dosen13 d7 = new Dosen13("129", "Ila", false, 47);
        Dosen13 d8 = new Dosen13("130", "Agus", true, 37);
        Dosen13 d9 = new Dosen13("131", "Tika", false, 33);
        Dosen13 d10 = new Dosen13("132", "Udin", true, 60);

        list.tambah(d1);
        list.tambah(d2);
        list.tambah(d3);
        list.tambah(d4);
        list.tambah(d5);
        list.tambah(d6);
        list.tambah(d7);
        list.tambah(d8);
        list.tambah(d9);
        list.tambah(d10);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampilData();

        System.out.println("Data yang sudah terurut menggunakan BUBBLE SORT (ASC) berdasarkan usia");
        list.sortingASCBubble();
        list.tampilData();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (DSC) berdasarkan usia");
        list.sortingDSCSelection();
        list.tampilData();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DSC) berdasarkan usia");
        list.sortingDSCInsertion();
        list.tampilData();
    }
}
