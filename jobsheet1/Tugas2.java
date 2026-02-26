package jobsheet1;

import java.util.Scanner;

public class Tugas2 {
    
    public static void inputJadwal(String[][] jadwal, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.println("Data Jadwal Ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();

            System.out.print("Ruang : ");
            jadwal[i][1] = sc.nextLine();

            System.out.print("Hari : ");
            jadwal[i][2] = sc.nextLine();

            System.out.print("Jam : ");
            jadwal[i][3] = sc.nextLine();

            System.out.println();
        }
    }

    public static void tampilSemua(String[][] jadwal, int n) {
        System.out.println("\n======== JADWAL KULIAH ========");
        System.out.printf("%-20s %-15s %-10s %-15s\n", 
                "Mata Kuliah", "Ruang", "Hari", "Jam");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s %-15s %-10s %-15s\n", 
                jadwal[i][0], 
                jadwal[i][1], 
                jadwal[i][2], 
                jadwal[i][3]);
        }
    }

    public static void cariberdasarkanHari (String[][] jadwal, int n, String hari) {
        System.out.println("\n======== JADWAL KULIAH PADA HARI " + hari.toUpperCase() + " ========");

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
              System.out.println(   jadwal[i][0] + " | " +
                                    jadwal[i][1] + " | " +
                                    jadwal[i][2] + " | " +
                                    jadwal[i][3]);
                                    
            }
        }

        if (!found) {
            System.out.println("Tidak ada Jadwal Pada Hari Tersebut");
        }
    }

    public static void cariBerdasarkanMatkul(String[][] jadwal, int n, String matkul) {
        System.out.println("\n======== JADWAL MATA KULIAH  ========");

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(matkul)) {
              System.out.println(   jadwal[i][0] + " | " +
                                    jadwal[i][1] + " | " +
                                    jadwal[i][2] + " | " +
                                    jadwal[i][3]);
                found = true;       
            }
        }
        if (found) {
            System.out.println("Matakuliah Tidak Ditemukan");
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Jumlah Matakuliah : ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, n, sc);

        tampilSemua(jadwal, n);

        System.out.print("\nMasukan Hari Yang Dicari : ");
        String hari = sc.nextLine();
        cariberdasarkanHari(jadwal, n, hari);

        System.out.print("\nMasukan Nama Mata Kuliah Yang Dicari : ");
        String matkul = sc.nextLine();
        cariBerdasarkanMatkul(jadwal, n, matkul);

        sc.close();
    }
}

