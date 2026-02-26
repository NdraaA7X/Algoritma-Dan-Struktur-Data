package jobsheet3;

import java.util.Scanner;
public class MahasiswaDemo10 {
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        Mahasiswa10[] arrayOfMahasiswa10 = new Mahasiswa10[3];
        String dummy;

        for (int i=0; i < 3; i++) {
            arrayOfMahasiswa10[i] = new Mahasiswa10();

            System.out.println("Masukan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM   : ");
            arrayOfMahasiswa10[i].nim = sc.nextLine();
            System.out.print("Nama  : ");
            arrayOfMahasiswa10[i].nama = sc.nextLine();
            System.out.print("Kelas : ");
            arrayOfMahasiswa10[i].kelas = sc.nextLine();
            System.out.print("IPK   : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa10[i].ipk = Float.parseFloat(dummy);
            System.out.println("-----------------------------");
        }

         for (int i=0; i < 3; i++) {
                System.out.println("Data Mahasiswa ke-" + (i+1));
                System.out.println("NIM     : " + arrayOfMahasiswa10[i].nim);
                System.out.println("Nama    : " + arrayOfMahasiswa10[i].nama);
                System.out.println("Kelas   : " + arrayOfMahasiswa10[i].kelas);
                System.out.println("IPK     : " + arrayOfMahasiswa10[i].ipk);
        }
        sc.close();
    }
}