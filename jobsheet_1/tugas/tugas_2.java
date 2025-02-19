package tugas;
import java.util.*;

public class tugas_2 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        while (true) {
            System.out.println("SISTEM PERHITUNGAN KUBUS");
            System.out.println("1. Volume Kubus\n2. Luas Permukaan Kubus\n3. Keliling Kubus");
            System.out.print("Pilih Menu: ");
            int menu = input13.nextInt();
            System.out.print("Masukkan panjang rusuk kubus: ");
            int rusuk = input13.nextInt();
            
            if (menu == 4) {
                System.out.println("Terima kasih telah menggunakan program!");
                break;
            }

            switch (menu) {
                case 1:
                    System.out.println("Volume kubus: " + volumeKubus(rusuk));
                    break;
                case 2:
                    System.out.println("Luas permukaan kubus: " + lpkubus(rusuk));
                    break;
                case 3:
                    System.out.println("Keliling kubus: " + kelilingKubus(rusuk));
                    break;
                default:
                    System.out.println("Silahkan masukkan angka yang tepat");
                    break;
            }
        }

        input13.close();
    }

    public static int volumeKubus (int s){
        return s * s * s;
    }

    public static int lpkubus (int s){
        return 6 * s * s;
    }

    public static int kelilingKubus (int s){
        return 12 *s;
    }
}
