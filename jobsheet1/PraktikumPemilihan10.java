import java.util.Scanner;
public class PraktikumPemilihan10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("================================");

        System.out.print("Masukkan Nilai Tugas : ");
        double nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai KUIS : ");
        double nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS : ");
        double nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS : ");
        double nilaiUAS = sc.nextDouble();
        
        System.out.println("==========================");
        System.out.println("==========================");

        if (nilaiTugas < 0 || nilaiTugas > 100 || 
            nilaiKuis < 0 || nilaiKuis > 100 || 
            nilaiUTS < 0 || nilaiUTS > 100 || nilaiUAS < 0 || 
            nilaiUAS > 100) {

            System.out.println("NILAI TIDAK VALID");
            System.out.println("================================");
            System.out.println("================================");
            sc.close();
            return;
            
        }

        double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.3 * nilaiUAS);
        String nilaiHuruf = "";

        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 73 && nilaiAkhir < 80) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir >= 65 && nilaiAkhir < 73) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 60 && nilaiAkhir < 65  ) {
            nilaiHuruf = "C+";
        } else  if (nilaiAkhir >= 50 && nilaiAkhir < 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 39 && nilaiAkhir < 50) {
            nilaiHuruf = "D";
        } else  if (nilaiAkhir >= 0 && nilaiAkhir < 39) {
            nilaiHuruf = "E";
        }

        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilaiHuruf);
        
        System.out.println("================================");
        System.out.println("================================");

        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || 
        nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || 
        nilaiHuruf.equals("C")) {
            
            System.out.println("SELAMAT ANDA LULUS.");
        } else {
            System.out.println("MAAF ANDA TIDAK LULUS.");
        }
        
        sc.close();
    }
}