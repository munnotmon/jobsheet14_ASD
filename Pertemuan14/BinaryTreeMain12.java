package Pertemuan14;

public class BinaryTreeMain12 {
    public static void main(String[] args) {
        BinaryTree12 bst = new BinaryTree12();

        bst.add(new Mahasiswa12("244160121", "Pras", "A", 3.57));
        bst.add(new Mahasiswa12("244160221", "Badar", "B", 3.85));
        bst.add(new Mahasiswa12("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa12("244160220", "Dewi", "B", 3.54));

        System.out.println("\nDaftar semua mahasiswa (in order traversal): ");
        bst.traverseInOrder(bst.root);

        System.out.println("\nMahasiswa dengan IPK MIN:");
        bst.cariMinIPK().tampilInformasi();

        System.out.println("\nMahasiswa dengan IPK MAX:");
        bst.cariMaxIPK().tampilInformasi();

        System.out.println("\nMahasiswa dengan IPK di atas 3.5:");
        bst.tampilMahasiswaIPKdiAtas(3.5);

        System.out.println("\nPencarian data mahasiswa:");
        System.out.println("Cari mahasiswa dengan IPK 3.54:");
        String hasilCari1 = bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari1);

        System.out.println("Cari mahasiswa dengan IPK 3.22:");
        String hasilCari2 = bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari2);

        bst.add(new Mahasiswa12("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa12("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa12("244160170", "Fizi", "B", 3.46));

        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("InOrder Traversal:");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPreOrder Traversal:");
        bst.traversePreOrder(bst.root);

        System.out.println("\nPostOrder Traversal:");
        bst.traversePostOrder(bst.root);

        System.out.println("\nPenghapusan data mahasiswa dengan IPK 3.57");
        bst.delete(3.57);

        System.out.println("\nDaftar semua mahasiswa setelah penghapusan (in order traversal):");
        bst.traverseInOrder(bst.root);
    }
}
