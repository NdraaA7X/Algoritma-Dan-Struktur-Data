package jobsheet10;
import java.util.Scanner;

public class AntrianKRSMain10 {
    public static void tampilkanMenu() {
        System.out.println("\n=== Menu Antrian Persetujuan KRS ===");
        System.out.println("1.  Tambah Mahasiswa ke Antrian");
        System.out.println("2.  Panggil Antrian (proses KRS 2 mahasiswa)");
        System.out.println("3.  Tampilkan Semua Antrian");
        System.out.println("4.  Tampilkan 2 Antrian Terdepan");
        System.out.println("5.  Tampilkan Antrian Paling Akhir");
        System.out.println("6.  Cek Antrian Kosong");
        System.out.println("7.  Cek Antrian Penuh");
        System.out.println("8.  Kosongkan Antrian");
        System.out.println("9.  Jumlah Antrian Saat Ini");
        System.out.println("10. Jumlah Mahasiswa yang Sudah KRS");
        System.out.println("11. Jumlah Mahasiswa Belum KRS (masih antri)");
        System.out.println("0.  Keluar");
        System.out.println("------------------------------------");
        System.out.print("Pilih menu: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS10 antrian = new AntrianKRS10(10);
        int pilihan;

        System.out.println("=== Sistem Antrian Persetujuan KRS ===");
        System.out.println("Kapasitas antrian : 10 mahasiswa");
        System.out.println("Kapasitas DPA     : 30 mahasiswa");

        do {
            tampilkanMenu();
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswaa10 mhs = new Mahasiswaa10(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.panggilAntrian();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.lihat2Terdepan();
                    break;
                case 5:
                    antrian.lihatPalingAkhir();
                    break;
                case 6:
                    if (antrian.isEmpty())
                        System.out.println("Antrian KOSONG.");
                    else
                        System.out.println("Antrian TIDAK kosong.");
                    break;
                case 7:
                    if (antrian.isFull())
                        System.out.println("Antrian PENUH.");
                    else
                        System.out.println("Antrian BELUM penuh.");
                    break;
                case 8:
                    antrian.kosongkanAntrian();
                    break;
                case 9:
                    System.out.println("Jumlah antrian saat ini: " + antrian.getJumlahAntrian());
                    break;
                case 10:
                    System.out.println("Jumlah mahasiswa yang sudah KRS: " + antrian.getTotalDilayani());
                    break;
                case 11:
                    System.out.println("Jumlah mahasiswa belum KRS (masih antri): " + antrian.getBelumKRS());
                    break;
                case 0:
                    System.out.println("Terima kasih. Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);

        sc.close();
    }
}
