package Pertemuan14;

public class BinaryTreeArray12 {
    Mahasiswa12[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray12 () {
        this.dataMahasiswa = new Mahasiswa12[10];
    }
    
    public void populateData (Mahasiswa12 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    public void transverseInOrder (int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                transverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart] . tampilInformasi();
                transverseInOrder(2 * idxStart + 2);
            }
        }
    }

    public void add(Mahasiswa12 data) {
        if (idxLast >= dataMahasiswa.length - 1) {
            System.out.println("Tree sudah penuh");
            return;
        }
        dataMahasiswa[++idxLast] = data;
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && dataMahasiswa[idxStart] != null) {
            dataMahasiswa[idxStart].tampilInformasi();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }    
}
