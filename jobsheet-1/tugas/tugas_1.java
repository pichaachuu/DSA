package tugas;
import java.util.*;
public class tugas_1 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        System.out.println("=".repeat(50));
        System.out.println("KODE PLAT DAN DAERAHNYA DI INDONESIA");
        System.out.println("=".repeat(50));
        String[] kode = {"A", "B", "D", "E", "F", "G", "H", "L", "N", "T"};
        String[][] kota = {
            {"B", "A", "N", "T", "E", "N"},
            {"J", "A", "K", "A", "R", "T", "A"},
            {"B", "A", "N", "D", "U", "N", "G"},
            {"C", "I", "R", "E", "B", "O", "N"},
            {"B", "O", "G", "O", "R"},
            {"P", "E", "K", "A", "L", "O", "N", "G", "A", "N"},
            {"S", "E", "M", "A", "R", "A", "N", "G"},
            {"S", "U", "R", "A", "B", "A", "Y", "A"},
            {"M", "A", "L", "A", "N", "G"},
            {"T", "E", "G", "A", "L"}
        };
        System.out.print("Input kode plat nomer: ");
        String hurufkode = input13.nextLine().toUpperCase();

        for (int i = 0; i < kode.length; i++) {
            if (hurufkode.equals(kode[i])) {
                System.out.print("Kode plat nomor tersebut merupakan kota ");
                for (int j = 0; j < kota[i].length; j++) {
                    System.out.print(kota[i][j]);
                }
            } else {
                System.out.println("Nama daerah tidak ditemukan");
                break;
            }
        }
        input13.close();
    }
    
}