import java.util.Scanner;

public class MataKuliahMain10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MataKuliah10 matkul10 = new MataKuliah10();
        System.out.print("Masukan Kode MK : ");
        matkul10.KodeMK = sc.nextLine();
        System.out.print("Masukan Nama Matkul : ");
        matkul10.NamaMK = sc.nextLine();
        System.out.print("Masukan SKS : ");
        matkul10.SKS = sc.nextInt();
        System.out.print("Masukan Jumlah Jam : ");
        matkul10.jumlahjam = sc.nextInt();
        System.out.println();

        matkul10.tampilInformasi();
        System.out.println();

        System.out.print("Masukan SKS Baru : ");
        matkul10.ubahSKS(sc.nextInt());
        System.out.print("Masukan Jam yang ingin ditambahkan : ");
        matkul10.tambahJam(sc.nextInt());
        matkul10.tampilInformasi();
        System.out.println();

        System.out.print("Masukan Jam yang ingin dikurangi : ");
        matkul10.kurangiJam(sc.nextInt());
        System.out.println();

        matkul10.tampilInformasi();

        System.out.println("\n DATA MATA KULIAH KEDUA");
        sc.nextLine();

        System.out.print("Masukan Kode MK : ");
        String kodeMK = sc.nextLine();
        System.out.print("Masukan Nama Matkul : ");
        String namaMK = sc.nextLine();
        System.out.print("Masukan SKS : ");
        int sks = sc.nextInt();
        System.out.print("Masukan Jumlah Jam : ");
        int jumlahJam = sc.nextInt();

        MataKuliah10 matkul11 = new MataKuliah10(kodeMK, namaMK, sks, jumlahJam);
        System.out.println();

        matkul11.tampilInformasi();

        sc.close();
    }
}
