package jobsheet10;

public class Mahasiswaa10 {
    String nim;
    String nama;
    String prodi;
    String kelas;

    public Mahasiswaa10(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}
