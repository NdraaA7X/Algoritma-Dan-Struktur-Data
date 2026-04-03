package jobsheet6;
import java.util.Scanner;

public class DosenMain10 {
    public static void main(String[] args) {
        Scanner sc      = new Scanner(System.in);
        DataDosen10 dd  = new DataDosen10();
        int pilihan;
 
        do {
            System.out.println("\n========== MENU DATA DOSEN ==========");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting ASC (Bubble Sort - termuda ke tertua)");
            System.out.println("4. Sorting DSC (Selection Sort - tertua ke termuda)");
            System.out.println("5. Insertion Sort (ASC - termuda ke tertua)");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = Integer.parseInt(sc.nextLine());
 
            switch (pilihan) {
                case 1:
                    System.out.print("Kode Dosen     : ");
                    String kode = sc.nextLine();
                    System.out.print("Nama Dosen     : ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    String jkInput = sc.nextLine();
                    boolean jk = jkInput.equalsIgnoreCase("L");
                    System.out.print("Usia           : ");
                    int usia = Integer.parseInt(sc.nextLine());
                    Dosen10 dsn = new Dosen10(kode, nama, jk, usia);
                    dd.tambah(dsn);
                    System.out.println("Data dosen berhasil ditambahkan.");
                    break;
                case 2:
                    System.out.println("\n===== DATA SEMUA DOSEN =====");
                    dd.tampil();
                    break;
                case 3:
                    dd.SortingASC();
                    System.out.println("\n===== Data Dosen Terurut ASC (Bubble Sort - termuda ke tertua) =====");
                    dd.tampil();
                    break;
                case 4:
                    dd.sortingDSC();
                    System.out.println("\n===== Data Dosen Terurut DSC (Selection Sort - tertua ke termuda) =====");
                    dd.tampil();
                    break;
                case 5:
                    dd.insertionSort();
                    System.out.println("\n===== Data Dosen Terurut ASC (Insertion Sort - termuda ke tertua) =====");
                    dd.tampil();
                    break;
                case 0:
                    System.out.println("Program selesai. Sampai jumpa!");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid!");
            }
 
        } while (pilihan != 0);
 
        sc.close();
    }
}
