package CaseMethod1;

public class Mahasiswa10 {
    String nim;
    String nama;
    String prodi;
    
    Mahasiswa10(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampilanMhasiswa10() {
        System.out.printf("NIM: %-7s | Nama: %-10s | Prodi: %s%n", nim, nama, prodi);
    }
}