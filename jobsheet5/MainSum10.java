package jobsheet5;

import java.util.Scanner;

public class MainSum10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();

        Sum10 sm = new Sum10(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke-" + (i + 1) + ": ");
            sm.keuntungan[i] = input.nextDouble();
        }

        System.out.println("Total keuntungan Menggunakan Brute Force: " + sm.totalBF());
        System.out.println("Total keuntungan Menggunakan Divide and Conquer: " + sm.totalDC(sm.keuntungan, 0, elemen - 1));
        
        input.close();
    }
}
