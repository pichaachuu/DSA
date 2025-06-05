package jobsheet_15;

public class BinaryTree13 {
    Node13 root;

    public BinaryTree13(){
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }
    
    public void add(Mahasiswa13 mahasiswa){
        Node13 newNode = new Node13(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node13 current = root;
            Node13 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk){
        boolean result = false;
        Node13 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node13 node){
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node13 node){
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node13 node){
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node13 getSuccesor(Node13 del){
        Node13 succesor = del.right;
        Node13 succesorParent = del;
        while (succesor.left != null) {
            succesorParent = succesor;
            succesor = succesor.left;
        }
        if (succesor != del.right) {
            succesorParent.left = succesor.right;
            succesor.right = del.right;
        }
        return succesor; 
    }

    void delete(double ipk){
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        //cari node (current) yang akan dihapus
        Node13 parent = root;
        Node13 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        //penghapusan
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            //jika tidak ada anak (leaf), maka node dihapus
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) { //jika hanya punya 1 anak (kanan)
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) { //jika hanya punya 1 anak (kiri)
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else { // jika punya dua anak
                Node13 succesor = getSuccesor(current);
                System.out.println("Jika 2 anak, current = ");
                succesor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = succesor;
                } else {
                    if (isLeftChild) {
                        parent.left = succesor;
                    } else {
                        parent.right = succesor;
                    }
                }
                succesor.left = current.left;
            }
        }
    }

    public void addRekursif(Mahasiswa13 data){
        root = addRekursif(root, data);
    }

    public Node13 addRekursif(Node13 current, Mahasiswa13 data){
        if (current == null) {
            return new Node13(data);
        }
        if (data.ipk < current.mahasiswa.ipk) {
            current.left = addRekursif(current.left, data);
        } else {
            current.right = addRekursif(current.right, data);
        }
        return current;
    }

    public void cariMinIPK(){
        if (root == null) {
            System.out.println("Tree kosong");
            return;
        }
        Node13 current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.println("Mahasiswa dengan IPK terkecil:");
        current.mahasiswa.tampilInformasi();
    }

    public void cariMaxIPK(){
        if (root == null) {
            System.out.println("Tree kosong");
            return;
        }
        Node13 current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.println("Mahasiswa dengan IPK terbesar:");
        current.mahasiswa.tampilInformasi();
    }

    public void tampilMahasiswaIPKdiAtas(double ipkBatas){
        tampilMahasiswaIPKdiAtas(root, ipkBatas);
    }

    public void tampilMahasiswaIPKdiAtas(Node13 node, double ipkBatas){
        if (node != null) {
            tampilMahasiswaIPKdiAtas(node.left, ipkBatas);
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }
            tampilMahasiswaIPKdiAtas(node.right, ipkBatas);
        }
    }
}
