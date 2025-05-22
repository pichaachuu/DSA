package jobsheet_13;

public class Node13 {
    Mahasiswa13 data;
    Node13 prev, next;

    public Node13(Node13 prev, Mahasiswa13 data, Node13 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
