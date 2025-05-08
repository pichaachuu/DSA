package jobsheet_11;
import java.util.*;

public class QueueMain {
    public static void menu(){
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("-".repeat(30));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int n = sc.nextInt();
        Queue q = new Queue(n);
        int pilih;
        boolean running = true;

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    if (q.isFull()) {
                        System.out.println("Queue sudah penuh! Operasi Enqueue dibatalkan");
                        running = false;
                    } else {
                        System.out.print("Masukkan data baru: ");
                        int dataMasuk = sc.nextInt();
                        q.Enqueue(dataMasuk);
                    }
                    break;
                case 2:
                    if (q.isEmpty()) {
                        System.out.println("Queue masih kosong! Operasi Dequeue dibatalkan!");
                        running = false;
                    } else {
                        int dataKeluar = q.Dequeue();
                        if (dataKeluar != 0) {
                            System.out.println("Data yang dikeluarkan: " + dataKeluar);
                            break;
                        }
                    }
                    break;    
                case 3:
                    q.print();
                    break;
                case 4:
                    q.peek();
                    break;
                case 5:
                    q.clear();
                    break; 
                }      
        } while (running && pilih != 0);
        sc.close();
    }
}    
