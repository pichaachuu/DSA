package jobsheet_15;

public class BinaryTreeMain13 {
    public static void main(String[] args) {
        BinaryTree13 bst = new BinaryTree13();

        bst.add(new Mahasiswa13("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa13("244160221", "Badar", "B", 3.85));
        bst.add(new Mahasiswa13("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa13("244160220", "Dewi", "D", 3.54));

        System.out.println("\nDaftar semua mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian semua mahasiswa:");
        System.out.print("Cari mahasiswa dengan ipk: 3.54 : ");
        String hasilCari = bst.find(3.54)?"Ditemukan":"Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.print("Cari mahasiswa dengan ipk: 3.22 : ");
        hasilCari = bst.find(3.22)?"Ditemukan":"Tidak ditemukan";
        System.out.println(hasilCari);

        bst.add(new Mahasiswa13("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa13("244160121", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa13("244160121", "Fizi", "B", 3.46));
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("InOrder Traversal:");
        bst.traverseInOrder(bst.root);
        System.out.println("\nPreOrder Traversal:");
        bst.traversePreOrder(bst.root);
        System.out.println("\nPostOrder Traversal:");
        bst.traversePostOrder(bst.root);

        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete(3.57);
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);

        bst.addRekursif(new Mahasiswa13("244160235", "Galih", "G", 4));
        System.out.println("\nDaftar semua mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);

        System.out.println("\nMahasiswa dengan IPK tertinggi:");
        bst.cariMaxIPK();

        System.out.println("\nMahasiswa dengan IPK terendah:");
        bst.cariMinIPK();

        System.out.println("\nMahasiswa dengan IPK di atas 3.3:");
        bst.tampilMahasiswaIPKdiAtas(3.3);
    }
}
