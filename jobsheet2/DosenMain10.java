package jobsheet2;

public class DosenMain10 {
    
    public static void main(String[] args) {
        Dosen10 dosen10 = new Dosen10();
        dosen10.idDosen = "D001";
        dosen10.nama = "Budi";
        dosen10.statusAktif = true;
        dosen10.tahunBergabung = 2015;
        dosen10.bidangKeahlian = "Pemrograman";

        dosen10.tampilInformasi();
        System.out.println("Masa Kerja: " + dosen10.hitungMasaKerja(2026) + " tahun");

        dosen10.ubahKeahlian("Jaringan");
        System.out.println("Setelah ubah keahlian");
        dosen10.tampilInformasi();

        Dosen10 dosen2 = new Dosen10(
            "D002",
            "Jokowi",
            false,
            2020,
            "Basis Data"
        );
        
        System.out.println("\nData dosen kedua:");
        dosen2.tampilInformasi();
        System.out.println("Masa Kerja: " + dosen2.hitungMasaKerja(2026) + " tahun");

        dosen2.setStatusAktif(false);
        dosen2.ubahKeahlian("Pemrograman");
        dosen2.tampilInformasi();
    }
}
