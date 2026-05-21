package CaseMethod2;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianDLL10 antrian = new AntrianDLL10();
        PesananDLL10 pesanan = new PesananDLL10();

        // Pre-load data dummy pakai konstruktor (sesuai catatan jobsheet)
        antrian.tambahAntrian("Ainra", "08224500000");
        antrian.tambahAntrian("Danra", "08224511111");
        antrian.tambahAntrian("Sanri", "08224522222");
        antrian.tambahAntrian("Vania", "08422234556");

        int pilihan;
        do {
            System.out.println("\n==============================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("==============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP        : ");
                    String hp = sc.nextLine();
                    antrian.tambahAntrian(nama, hp);
                    break;

                case 2:
                    antrian.cetakAntrian();
                    break;

                case 3:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong.");
                        break;
                    }
                    System.out.print("Nomor Antrian yang dipanggil : ");
                    int noAntrian = sc.nextInt();
                    sc.nextLine();

                    String namaPembeli = antrian.hapusAntrian(noAntrian);
                    if (namaPembeli == null) {
                        System.out.println("Nomor antrian tidak ditemukan.");
                        break;
                    }

                    System.out.print("Kode Pesanan  : ");
                    int kode = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama Pesanan  : ");
                    String namaMakanan = sc.nextLine();
                    System.out.print("Harga         : ");
                    int harga = sc.nextInt();
                    sc.nextLine();

                    pesanan.tambahPesanan(kode, namaMakanan, harga, namaPembeli);
                    System.out.println(namaPembeli + " telah memesan " + namaMakanan);
                    break;

                case 4:
                    pesanan.laporanPesanan();
                    break;

                case 0:
                    System.out.println("Keluar dari sistem. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
