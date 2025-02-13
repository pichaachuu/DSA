package tugas;
import java.util.*;

public class tugas_2 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        System.out.println("SISTEM PERHITUNGAN KUBUS");
        System.out.print("Masukkan panjang rusuk kubus: ");
        int rusuk = input13.nextInt();

        System.out.println("Volume kubus: " + volumeKubus(rusuk));
        System.out.println("Luas permukaan kubus: " + lpkubus(rusuk));
        System.out.println("Keliling kubus: " + kelilingKubus(rusuk));

        input13.close();
    }

    public static int volumeKubus (int s){
        int vol;
        vol = s * s * s;
        return vol;
    }

    public static int lpkubus (int s){
        int lp;
        lp = 6 * s * s;
        return lp;
    }

    public static int kelilingKubus (int s){
        int keliling;
        keliling = 12 * s;
        return keliling;
    }
}
