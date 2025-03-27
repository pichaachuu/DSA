package jobsheet_7;

public class DosenDemo13 {
    public static void main(String[] args) {
        DataDosen13 list = new DataDosen13();

        list.tambah(new Dosen13("123", "Zidan", true, 35));
        list.tambah(new Dosen13("124", "Ayu", false, 30));
        list.tambah(new Dosen13("125", "Sofi", false, 29));
        list.tambah(new Dosen13("126", "Sita", false, 45));
        list.tambah(new Dosen13("127", "Miki", true, 25));
        list.tambah(new Dosen13("128", "Ali", true, 50));
        list.tambah(new Dosen13("129", "Ila", false, 47));
        list.tambah(new Dosen13("130", "Agus", true, 37));
        list.tambah(new Dosen13("131", "Tika", false, 33));
        list.tambah(new Dosen13("132", "Udin", true, 60));

        System.out.println("Data dosen sebelum sorting:");
        list.tampilData();

        
        System.out.println("Data setelah Bubble Sort (ASC) berdasarkan usia:");
        list.sortingASCBubble();
        list.tampilData();

        
        System.out.println("Pencarian nama dengan Sequential Search:");
        list.sequentialSearch("Ayu");

        
        System.out.println("Pencarian usia dengan Binary Search:");
        list.binarySearch(50);
    }
}
