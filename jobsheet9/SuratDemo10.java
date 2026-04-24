package jobsheet9;

import java.util.Scanner;

public class SuratDemo10 {
    public static void main(String[] args) {
        StackSurat10 stack = new StackSurat10(10);
        Scanner sc = new Scanner(System.in);
        int pilih;
 
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
 
            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S=Sakit / I=Izin): ");
                    char jenisIzin = sc.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();
                    Surat10 surat = new Surat10(idSurat, nama, kelas, jenisIzin, durasi);
                    stack.push(surat);
                    System.out.printf("Surat dari %s berhasil diterima.\n", nama);
                    break;
 
                case 2:
                    Surat10 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat dari: " + diproses.namaMahasiswa);
                        System.out.println("Kelas     : " + diproses.kelas);
                        System.out.println("Jenis Izin: " + diproses.jenisIzin + (diproses.jenisIzin == 'S' ? " (Sakit)" : " (Izin)"));
                        System.out.println("Durasi    : " + diproses.durasi + " hari");
                        System.out.println("Surat berhasil divalidasi.");
                    }
                    break;
 
                case 3:
                    Surat10 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir dari: " + terakhir.namaMahasiswa);
                        System.out.println("ID Surat  : " + terakhir.idSurat);
                        System.out.println("Jenis Izin: " + terakhir.jenisIzin);
                        System.out.println("Durasi    : " + terakhir.durasi + " hari");
                    }
                    break;
 
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cari = sc.nextLine();
                    stack.cariSurat(cari);
                    break;
 
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 4);
        sc.close();
    }
}
