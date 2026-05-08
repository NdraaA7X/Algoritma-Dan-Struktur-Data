package jobsheet11;

public class MahasiswaAntrian10 {
    String nim;
    String nama;
    String kelas;
    String keperluan;
 
    public MahasiswaAntrian10() {}
 
    public MahasiswaAntrian10(String nim, String nama, String kelas, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.keperluan = keperluan;
    }
 
    void tampilInformasi() {
        System.out.printf("%-12s %-10s %-6s %s%n", nama, nim, kelas, keperluan);
    }
}
