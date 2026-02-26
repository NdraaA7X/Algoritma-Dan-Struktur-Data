package jobsheet2;

public class MahasiswaMain10 {
    public static void main(String[] args) {
        Mahasiswa10 mhs1 = new Mahasiswa10();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIPK(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa10 mhs2 = new Mahasiswa10("Annisa Nabila", "214720160", "TI 2L", 3.25);
        mhs2.updateIPK(3.30);
        mhs2.tampilkanInformasi();
    }
}   
