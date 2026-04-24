package jobsheet9;

public class Mahasiswa10 {
    String nim;
    String nama;
    String kelas;
    int nilai;
 
    public Mahasiswa10() {}
 
    public Mahasiswa10(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.nilai = -1;
    }
 
    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}
