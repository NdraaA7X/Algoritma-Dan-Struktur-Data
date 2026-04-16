package CaseMethod1;

public class PinjamanBuku10 {
    Mahasiswa10 mhs;
    Buku10 buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int keterlambatan;
    int denda;

    public PinjamanBuku10(Mahasiswa10 mhs, Buku10 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    public void hitungDenda() {
        keterlambatan = lamaPinjam - batasPinjam;
        if (keterlambatan < 0) keterlambatan = 0;
        denda = keterlambatan * 2000;
    }

    public void tampilanPinjamBuku10() {
        System.out.printf("%-7s | %-15s | Lama: %2d | Terlambat: %2d | Denda: %6d%n",
            mhs.nama, buku.judulbuku, lamaPinjam, keterlambatan, denda);
    }
}