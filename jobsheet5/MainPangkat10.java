package jobsheet5;

import java.util.Scanner;

public class MainPangkat10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah element : ");
        int elemen = input.nextInt();
        
        Pangkat10[] png = new Pangkat10[elemen];
        for(int i=0; i<elemen; i++) {
            System.out.print("Masukkan Nilai basis elemen ke-"+(i+1)+" : ");
            int basis = input.nextInt();
            System.out.print("Masukkan Nilai pangkat elemen ke-"+(i+1)+" : ");
            int pangkat = input.nextInt();
            png[i] = new Pangkat10(basis, pangkat);
        }

        System.out.println("HASIL PANGKAT BRUTEFORCE:");
        for (Pangkat10 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.PangkatBF(p.nilai, p.pangkat));
        }
        System.out.println("HASIL PANGKAT DIVIDE CONQUER:");
        for (Pangkat10 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatDC(p.nilai, p.pangkat));
        }
        input.close();
    }   
}