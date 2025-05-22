package jobsheet_13;

public class DoubleLinkedLists {
    Node13 head, tail;

    public DoubleLinkedLists() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa13 data) {
        Node13 newNode = new Node13(null, data, head);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.prev = newNode;
        }
        head = newNode;
    }

    public void addLast(Mahasiswa13 data) {
        Node13 newNode = new Node13(tail, data, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void add(Mahasiswa13 data, int index) {
        if (index <= 0) {
            addFirst(data);
        } else if (index >= size()) {
            addLast(data);
        } else {
            Node13 temp = head;
            int i = 0;
            while (i < index - 1 && temp != null) {
                temp = temp.next;
                i++;
            }
            if (temp != null && temp.next != null) {
                Node13 newNode = new Node13(temp, data, temp.next);
                temp.next.prev = newNode;
                temp.next = newNode;
            }
        }
    }

    public void insertAfter(String key, Mahasiswa13 data) {
        Node13 current = head;
        while (current != null && !current.data.nim.equals(key)) {
            current = current.next;
        }
        if (current != null) {
            Node13 newNode = new Node13(current, data, current.next);
            if (current.next != null) {
                current.next.prev = newNode;
            } else {
                tail = newNode;
            }
            current.next = newNode;
        } else {
            System.out.println("Data dengan NIM " + key + " tidak ditemukan");
        }
    }

    public void removeFirst() {
        if (!isEmpty()) {
            System.out.println("Data yang terhapus adalah data dengan NIM: " + head.data.nim);
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void removeLast() {
        if (!isEmpty()) {
            System.out.println("Data yang terhapus adalah data dengan NIM: " + tail.data.nim);
            if (head == tail) {
                head = tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void removeAfter(String key) {
        Node13 current = head;
        while (current != null && !current.data.nim.equals(key)) {
            current = current.next;
        }
        if (current != null && current.next != null) {
            Node13 toDelete = current.next;
            current.next = toDelete.next;
            if (toDelete.next != null) {
                toDelete.next.prev = current;
            } else {
                tail = current;
            }
            System.out.println("Data setelah " + key + " berhasil dihapus: " + toDelete.data.nim);
        } else {
            System.out.println("Data tidak ditemukan atau tidak ada data setelahnya.");
        }
    }

    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("List kosong");
            return;
        }
        if (index <= 0) {
            removeFirst();
            return;
        }
        if (index >= size() - 1) {
            removeLast();
            return;
        }

        Node13 temp = head;
        int i = 0;
        while (i < index && temp != null) {
            temp = temp.next;
            i++;
        }
        if (temp != null) {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            System.out.println("Data pada indeks ke-" + index + " berhasil dihapus: " + temp.data.nim);
        }
    }

    public void getFirst() {
        if (!isEmpty()) {
            System.out.print("Data pertama: ");
            head.data.tampil();
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void getLast() {
        if (!isEmpty()) {
            System.out.print("Data terakhir: ");
            tail.data.tampil();
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void getIndex(int index) {
        if (isEmpty()) {
            System.out.println("List kosong");
            return;
        }

        if (index < 0 || index >= size()) {
            System.out.println("Index di luar batas");
            return;
        }

        Node13 temp = head;
        int i = 0;
        while (i < index && temp != null) {
            temp = temp.next;
            i++;
        }

        if (temp != null) {
            System.out.print("Data pada indeks ke-" + index + ": ");
            temp.data.tampil();
        }
    }

    public int size() {
        int count = 0;
        Node13 temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void print() {
        if (!isEmpty()) {
            Node13 tmp = head;
            while (tmp != null) {
                tmp.data.tampil();
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public Node13 search(String key){
        Node13 current = head;
        while (current != null) {
            if (current.data.nim.equalsIgnoreCase(key)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
}
