package jobsheet_15;

public class BinaryTreeArray13 {
    Mahasiswa13[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray13(){
        this.dataMahasiswa = new Mahasiswa13[10];
    }

    void populateData(Mahasiswa13 dataMhs[], int idxLast){
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverserInOrder(int idxStart){
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverserInOrder((2*idxStart+1));
                dataMahasiswa[idxStart].tampilInformasi();
                traverserInOrder(2*idxStart+2);
            }
        }
    }

    public void add(Mahasiswa13 data){
        if (idxLast >= dataMahasiswa.length - 1) {
            System.out.println("Tree penuh");
            return;
        }
        idxLast++;
        dataMahasiswa[idxLast] = data;
    }

    public void traversePreOrder(int idxStart){
        if (idxStart <= idxLast && dataMahasiswa[idxStart] != null) {
            dataMahasiswa[idxStart].tampilInformasi();
            traversePreOrder(2*idxStart+1);
            traversePreOrder(2*idxStart+2);
        }
    }
}