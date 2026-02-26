package jobsheet2;

public class MataKuliah10 {
    String KodeMK;
    String NamaMK;
    int SKS;
    int jumlahjam;

    void tampilInformasi() {
        System.out.println("Kode MK     : " + KodeMK);
        System.out.println("Nama Matkul : " + NamaMK);
        System.out.println("SKS         : " + SKS);
        System.out.println("Jumlah Jam  : " + jumlahjam);
    }

    void ubahSKS(int sksBaru) {
        SKS = sksBaru;
        System.out.println("SKS berhasil diubah. SKS saat ini: " + SKS);
    }

    void tambahJam(int jam) {
        jumlahjam += jam;
        System.out.println("Jumlah Jam berhasil ditambahkan");
    }

    void kurangiJam(int jam) {
        if (jumlahjam >= jam) {
            jumlahjam -= jam;
            System.out.println("Jumlah Jam berhasil dikurangi.");
            System.out.println("Jam Sekarang : " + jumlahjam);
        } else {
            System.out.println("Pengurangan gagal, jam tidak mencukupi");
        }
    }

    public MataKuliah10() {
        KodeMK = "-";
        NamaMK = "-";
        SKS = 0;
        jumlahjam = 0;
    }

    public MataKuliah10(String kdMK, String nmMK, int sks, int jmlhjam) {
        KodeMK = kdMK;
        NamaMK = nmMK;
        this.SKS = sks;
        jumlahjam = jmlhjam;
    }
}

