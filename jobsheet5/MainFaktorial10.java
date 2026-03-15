package jobsheet5;
import java.util.Scanner;

public class MainFaktorial10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = sc.nextInt();
        Faktorial10 fk = new Faktorial10();
        System.out.println("Nilai Faktorial " + nilai + " Menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai Faktorial " + nilai + " Menggunakan DC: " + fk.faktorialDC(nilai));

        sc.close();
    }
}

