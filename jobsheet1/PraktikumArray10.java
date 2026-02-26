package jobsheet1;

import java.util.Scanner;

public class PraktikumArray10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("PROGRAM MENGHITUNG IP SEMESTER");
        System.out.println("=================================");

        String[] MK = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking & Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };

        int[] sks = {2, 2, 2, 3, 2, 3, 2, 2};

        double[] nilaiAngka = new double[MK.length];

        for (int i = 0; i < MK.length; i++) {
            System.out.print("Masukkan Nilai Angka untuk MK " + MK[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();
        }

        System.out.println("\n=================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=================================");

        System.out.printf("%-40s %-15s %-15s %-15s\n",
                "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double totalBobot = 0;
        int totalSKS = 0;

        for (int i = 0; i < MK.length; i++) {

            String huruf;
            double bobot;

            if (nilaiAngka[i] > 80) {
                huruf = "A";
                bobot = 4;
            } else if (nilaiAngka[i] > 73) {
                huruf = "B+";
                bobot = 3.5;
            } else if (nilaiAngka[i] > 65) {
                huruf = "B";
                bobot = 3;
            } else if (nilaiAngka[i] > 60) {
                huruf = "C+";
                bobot = 2.5;
            } else if (nilaiAngka[i] > 50) {
                huruf = "C";
                bobot = 2;
            } else if (nilaiAngka[i] > 39) {
                huruf = "D";
                bobot = 1;
            } else {
                huruf = "E";
                bobot = 0;
            }

            double bobotNilai = bobot * sks[i];

            totalBobot += bobotNilai;
            totalSKS += sks[i];

            System.out.printf("%-40s %-20.2f %-12s %-16.2f\n",
                    MK[i], nilaiAngka[i], huruf, bobot);
        }

        double ip = totalBobot / totalSKS;

        System.out.println("=================================");
        System.out.printf("IP Semester : %.2f\n", ip);

        sc.close();
    }
}
