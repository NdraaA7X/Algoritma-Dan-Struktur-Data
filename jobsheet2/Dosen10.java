public class Dosen10 {
    
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen10() {
    }

    public Dosen10(String id, String namaDosen, boolean aktif,
                    int tahun, String keahlian) {
        idDosen = id;
        nama = namaDosen;
        statusAktif = aktif;
        tahunBergabung = tahun;
        bidangKeahlian = keahlian;
    }

    void tampilInformasi() {
        System.out.println("===== PROFIL DOSEN =====");
        System.out.println("ID Dosen     : " + idDosen);
        System.out.println("Nama Dosen   : " + nama);
        System.out.println("Status Dosen : " + (statusAktif ? "Aktif" : "Nonaktif"));
        System.out.println("Tahun Gabung : " + tahunBergabung);
        System.out.println("Keahlian     : " + bidangKeahlian);
        System.out.println("========================");
    }

     void setStatusAktif(boolean status) {
        statusAktif = status;
    }
    
    int hitungMasaKerja(int tahunSekarang) {
        int masa = tahunSekarang - tahunBergabung;
        return masa;
    }

    void ubahKeahlian(String keahlianBaru) {
        bidangKeahlian = keahlianBaru;
    }
    
}
