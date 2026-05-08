package jobsheet11;

import java.util.Scanner;

public class SLLMain10 {
    public static void main(String[] args) {
        SingleLinkedList10 sll = new SingleLinkedList10();
        Scanner sc = new Scanner(System.in);

        Mahasiswa10 mhs1 = new Mahasiswa10("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa10 mhs2 = new Mahasiswa10("22212202", "Cintia", "3C", 3.5);
        Mahasiswa10 mhs3 = new Mahasiswa10("22212202", "Bimon",  "2B", 3.8);
        Mahasiswa10 mhs4 = new Mahasiswa10("21212203", "Dirga",  "4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs2);
        sll.insertAt(2, mhs3);
        sll.print();

        System.out.println("data index 1 : ");
        sll.getData(1);
 
        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();
 
        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

        System.out.println("=== Tambah data Manual ===");
        System.out.print("Masukkan jumlah data: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("-- Data ke-" + (i + 1) + " --");
            System.out.print("NIM   : "); String nim = sc.nextLine();
            System.out.print("Nama  : "); String nama = sc.nextLine();
            System.out.print("Kelas : "); String kelas = sc.nextLine();
            System.out.print("IPK   : "); double ipk = sc.nextDouble();
            sc.nextLine();
            sll.addLast(new Mahasiswa10(nim, nama, kelas, ipk));
        }
        sll.print();

        sc.close();
    }
}
