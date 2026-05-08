package jobsheet11;

public class Mahasiswa10 {
    String nim;
    String nama;
    String kelas;
    double ipk;
 
    public Mahasiswa10() {}
 
    public Mahasiswa10(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }
 
    void tampilInformasi() {
        System.out.printf("%-12s %-10s %-6s %.1f%n", nama, nim, kelas, ipk);
    }
}
