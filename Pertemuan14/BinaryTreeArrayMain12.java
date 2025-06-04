package Pertemuan14;

public class BinaryTreeArrayMain12 {
    public static void main(String[] args) {
        BinaryTreeArray12 bta = new BinaryTreeArray12();

        Mahasiswa12 mhs1 = new Mahasiswa12("244160121", "Ali", "A", 3.57);
        Mahasiswa12 mhs2 = new Mahasiswa12("244160185", "Candra", "A", 3.41);
        Mahasiswa12 mhs3 = new Mahasiswa12("244160221", "Badar", "A", 3.75);
        Mahasiswa12 mhs4 = new Mahasiswa12("244160220", "Dewi", "A", 3.35);

        Mahasiswa12 mhs5 = new Mahasiswa12("244160131", "Devi", "A", 3.48);
        Mahasiswa12 mhs6 = new Mahasiswa12("244160205", "Ehsan", "A", 3.61);
        Mahasiswa12 mhs7 = new Mahasiswa12("244160170", "Fizi", "A", 3.86);

        Mahasiswa12[] dataMahasiswas = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};

        int idxLast = 6;
        bta.populateData(dataMahasiswas, idxLast);

        System.out.println("\nInOrder Traversal Mahasiswa:");
        bta.transverseInOrder(0);
    }
}
