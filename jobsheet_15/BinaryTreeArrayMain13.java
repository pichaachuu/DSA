package jobsheet_15;

public class BinaryTreeArrayMain13 {
    public static void main(String[] args) {
        BinaryTreeArray13 bta = new BinaryTreeArray13();
        Mahasiswa13 mhs1 = new Mahasiswa13("244160121", "Ali", "A", 3.57);
        Mahasiswa13 mhs2 = new Mahasiswa13("244160185", "Badar", "B", 3.41);
        Mahasiswa13 mhs3 = new Mahasiswa13("244160221", "Candra", "C", 3.75);
        Mahasiswa13 mhs4 = new Mahasiswa13("244160220", "Dewi", "D", 3.35);
        Mahasiswa13 mhs5 = new Mahasiswa13("244160131", "Devi", "A", 3.48);
        Mahasiswa13 mhs6 = new Mahasiswa13("244160205", "Ehsan", "D", 3.61);
        Mahasiswa13 mhs7 = new Mahasiswa13("244160170", "Fizi", "B", 3.86);

        Mahasiswa13[] dataMahasiswa = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxLast = 6;
        bta.populateData(dataMahasiswa, idxLast);
        System.out.println("\nInOrder Traversal Mahasiswa: ");
        bta.traverserInOrder(0);

        bta.add(new Mahasiswa13("244160240", "Galih", "G", 4));

        System.out.println("\nPre-Order Traversal Mahasiswa:");
        bta.traversePreOrder(0);
    }
}
