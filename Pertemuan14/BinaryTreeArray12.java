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
}
