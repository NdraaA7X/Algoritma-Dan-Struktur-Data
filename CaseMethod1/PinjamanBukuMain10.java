package CaseMethod1;
import java.util.Scanner;

//Ben Eling Tak Wehi keterangan

public class PinjamanBukuMain10 {

    // Berfungsi Untuk Mengurutkana peminjaman berdasarkan denda terbesar
    public static void urutkanDenda(PinjamanBuku10[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            PinjamanBuku10 key = arr[i];
            int j = i - 1;
            // Berfungsi Untuk Mengeser Elemen Yang Dendanya Lebih Kecil Ke Kanan
            while (j >= 0 && arr[j].denda < key.denda) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    
    //Mencari Peminjaman Berdasarkan NIM
    public static void cariPeminjamanNIM(PinjamanBuku10[] original, String nimCari) {
        PinjamanBuku10[] sorted =original.clone();
        int n = sorted.length;
        for (int i = 1; i < n; i++){
            PinjamanBuku10 key = sorted[i];
            int j = i - 1;
            while (j >= 0 && sorted[j].mhs.nim.compareTo(key.mhs.nim) > 0) {
                sorted[j + 1] = sorted[j];
                j--;
            }
            sorted[j + 1] = key;
        }

        //Mencari NIM Pada Tengah2 Array
        int low = 0, high = n - 1;
        boolean found = false;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            int cmp = sorted[mid].mhs.nim.compareTo(nimCari);
            if (cmp == 0) {
                found = true;
                break;
            } else if (cmp < 0){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Data dengan NIM " + nimCari + " tidak ditemukan.");
            return;
        }

         // Jika NIM Maka bisa lebih dari 1 data tampilkan semua
        int start = mid;
        while (start > 0 && sorted[start - 1].mhs.nim.equals(nimCari)) start--;
        int end = mid;
        while (end < n - 1 && sorted[end + 1].mhs.nim.equals(nimCari)) end++;

        for (int i = start; i <= end; i++) {
            sorted[i].tampilanPinjamBuku10();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa10[] mahasiswa10s = {
            new Mahasiswa10("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa10("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa10("22003", "Citra", "Sistem Informasi Bisnis")
        };

        Buku10[] Buku10s = {
            new Buku10("B001", "Algoritma",     2020),
            new Buku10("B002", "Basis Data",    2019),
            new Buku10("B003", "Pemrograman",   2021),
            new Buku10("B004", "Fisika",        2024)
        };

        PinjamanBuku10[] PinjamanBuku10s  = {
            new PinjamanBuku10(mahasiswa10s[0], Buku10s[0], 7),
            new PinjamanBuku10(mahasiswa10s[1], Buku10s[1], 3),
            new PinjamanBuku10(mahasiswa10s[2], Buku10s[2], 10),
            new PinjamanBuku10(mahasiswa10s[2], Buku10s[3], 6),
            new PinjamanBuku10(mahasiswa10s[0], Buku10s[1], 4)
        };

        int pilihan;
        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RAUNG BACA JTI ===");  
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasakan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih : ");
            pilihan = Integer.parseInt(sc.nextLine());

            switch (pilihan) {
                case 1:
                    System.out.println("\nDaftar Mahasiswa:");
                    for (Mahasiswa10 m : mahasiswa10s) {
                        if (m != null) m.tampilanMhasiswa10();
                    }
                    break;
                
                case 2:
                    System.out.println("\nDaftar Buku:");
                    for (Buku10 b : Buku10s) {
                        if (b != null) b.tampilanBuku10();
                    }
                    break;
                
                case 3:
                    System.out.println("\nData Peminjaman:");
                    for (PinjamanBuku10 p : PinjamanBuku10s) {
                        if (p != null) p.tampilanPinjamBuku10();
                    }
                    break;

                case 4:
                    urutkanDenda(PinjamanBuku10s);
                    System.out.println("\nSetelah diurutkan (Denda Terbesar):");
                    for (PinjamanBuku10 p : PinjamanBuku10s) {
                        if (p != null) p.tampilanPinjamBuku10();
                    }
                    break;

                case 5:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    if (!nim.isEmpty()) {
                        cariPeminjamanNIM(PinjamanBuku10s, nim);
                    } else {
                        System.out.println("NIM Tidak Boleh Kosong!");
                    }
                    break;

                default:
                    System.out.println("Keluar.....");
                    break;
            }
        } while (pilihan != 0);

        sc.close();
    }
}