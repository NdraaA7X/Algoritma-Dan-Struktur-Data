package CaseMethod1;

public class Buku10 {
    String kodebuku;
    String judulbuku;
    int tahunterbitbuku;

    public Buku10(String kodebuku, String judulbuku, int tahunterbitbuku) {
        this.kodebuku = kodebuku;
        this.judulbuku = judulbuku;
        this.tahunterbitbuku = tahunterbitbuku;
    }
    
    public void tampilanBuku10() {
        System.out.printf("Kode: %-5s | Judul: %-15s | Tahun: %d%n", kodebuku, judulbuku, tahunterbitbuku);
    }
}