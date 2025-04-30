package jobsheet_10;

public class StackSurat13 {
    Surat13[] stack;
    int size;
    int top;

    public StackSurat13(int size){
        this.size = size;
        stack = new Surat13[size];
        top = -1;
    }

    public boolean isFull(){
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty(){
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat13 surat){
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi");
        }
    }

    public Surat13 pop(){
        if (!isEmpty()) {
            Surat13 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diverifikasi");
            return null;
        }
    }

    public Surat13 peek(){
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print(){
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].idSurat + "\t" + stack[i].namaMahasiswa + "\t" + stack[i].kelas + "\t" + stack[i].jenisIzin + "\t" + stack[i].durasi);
        }
        System.out.println();
    }

    public void LinearSearch (String nama){
        boolean found = false;
        for (int i = 0; i < stack.length; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat Ditemukan");
                stack[i].tampilInfo();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Data tidak ditemukan");
        }
    }
}
