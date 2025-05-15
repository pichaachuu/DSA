package jobsheet_12.Tugas;

public class TugasLinkedList {
    NodeMahasiswa13 head;
    NodeMahasiswa13 tail;
    int size;

    public TugasLinkedList(){
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public boolean isFull(){
        return false;
    }

    public void print(){
        if (!isEmpty()) {
            NodeMahasiswa13 tmp = head;
            System.out.println("Isi Antrian:\t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void clear(){
        if (!isEmpty()) {
            head = tail = null;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void addLast(Mahasiswa13 mhs){
        NodeMahasiswa13 data = new NodeMahasiswa13(mhs, null);
        if (isEmpty()) {
            head = data;
            tail = data;
        } else {
            tail.next = data;
            tail = data;
        }
        size++;
    }

    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("Antrian masih kosong, tida dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            System.out.println("Melayani Mahasiswa: ");
            head.data.tampilInformasi();
            head = head.next;
            size--;
        }
    }

    public void lihatAntrianAwal(){
        if (!isEmpty()) {
            System.out.println("Antrian Terdepan");
            head.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void lihatAkhir(){
        if (!isEmpty()) {
            System.out.println("Antrian Terakhir");
            tail.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public int getSize(){
        return size;
    }
}
