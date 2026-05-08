package jobsheet11;
import java.util.Scanner;

public class AntrianMain10 {
    public static void main(String[] args) {
        QueueLinkedList10 antrian = new QueueLinkedList10();
        Scanner sc = new Scanner(System.in);
        int pilih;
 
        do {
            System.out.println("\nMenu Antrian Unit Kemahasiswaan:");
            System.out.println("1. Daftar Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Jumlah Mahasiswa Mengantri");
            System.out.println("7. Cek Antrian Kosong");
            System.out.println("8. Cek Antrian Penuh");
            System.out.println("9. Kosongkan Antrian");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
 
            switch (pilih) {
                case 1:
                    System.out.print("NIM       : "); String nim = sc.nextLine();
                    System.out.print("Nama      : "); String nama = sc.nextLine();
                    System.out.print("Kelas     : "); String kelas = sc.nextLine();
                    System.out.print("Keperluan : "); String keperluan = sc.nextLine();
                    antrian.enqueue(new MahasiswaAntrian10(nim, nama, kelas, keperluan));
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.peekFront();
                    break;
                case 4:
                    antrian.peekRear();
                    break;
                case 5:
                    antrian.print();
                    break;
                case 6:
                    antrian.jumlahAntrian();
                    break;
                case 7:
                    System.out.println(antrian.isEmpty() ? "Antrian kosong." : "Antrian tidak kosong.");
                    break;
                case 8:
                    System.out.println(antrian.isFull() ? "Antrian penuh." : "Antrian belum penuh.");
                    break;
                case 9:
                    antrian.clear();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 9);
        sc.close();
    }
}
