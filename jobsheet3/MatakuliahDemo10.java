package jobsheet3;
import java.util.Scanner;

public class MatakuliahDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Jumlah Matakuliah: ");
        int Jumlah = Integer.parseInt(sc.nextLine());

        Matakuliah10[] arrayOfMatakuliah10 = new Matakuliah10[Jumlah];
        String kode, nama, dummy;
        int sks, jumlahjam;

        for (int i = 0; i < Jumlah; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode      : ");
            kode = sc.nextLine();
            System.out.print("Nama      : ");
            nama = sc.nextLine();
            System.out.print("SKS       : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam: ");
            dummy = sc.nextLine();
            jumlahjam = Integer.parseInt(dummy);
            System.out.println("-----------------------------");

            arrayOfMatakuliah10[i] = new Matakuliah10(kode, nama, sks, jumlahjam);
        }
            for (int i = 0; i < Jumlah; i++) {
                System.out.println("Data Matakuliah ke-" + (i + 1));
                 arrayOfMatakuliah10[i].cetakInfo();
            }
        sc.close();
    }
}