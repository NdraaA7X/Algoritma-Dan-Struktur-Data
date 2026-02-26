public class DataDosen10 {

    public void dataSemuaDosen(Dosenn10[] arrayOfDosen) {
        System.out.println("\n=== Data Semua Dosen ===");
        int no = 1;
        for (Dosenn10 dosen : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + no);
            System.out.println("Kode          : " + dosen.kode);
            System.out.println("Nama          : " + dosen.nama);
            System.out.println("Jenis Kelamin : " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + dosen.usia);
            System.out.println("------------------------------");
            no++;
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosenn10[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosenn10 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) pria++;
            else wanita++;
        }
        System.out.println("\n=== Jumlah Dosen Per Jenis Kelamin ===");
        System.out.println("Pria   : " + pria + " orang");
        System.out.println("Wanita : " + wanita + " orang");
        System.out.println("------------------------------");
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosenn10[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosenn10 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                jumlahWanita++;
            }
        }

        System.out.println("\n=== Rerata Usia Dosen Per Jenis Kelamin ===");
        if (jumlahPria > 0)
            System.out.println("Rata-rata Usia Pria   : " + (double) totalUsiaPria / jumlahPria);
        else
            System.out.println("Rata-rata Usia Pria   : tidak ada data");

        if (jumlahWanita > 0)
            System.out.println("Rata-rata Usia Wanita : " + (double) totalUsiaWanita / jumlahWanita);
        else
            System.out.println("Rata-rata Usia Wanita : tidak ada data");
        System.out.println("------------------------------");
    }

    public void infoDosenPalingTua(Dosenn10[] arrayOfDosen) {
        Dosenn10 palingTua = arrayOfDosen[0];
        for (Dosenn10 dosen : arrayOfDosen) {
            if (dosen.usia > palingTua.usia) palingTua = dosen;
        }
        System.out.println("\n=== Info Dosen Paling Tua ===");
        System.out.println("Kode          : " + palingTua.kode);
        System.out.println("Nama          : " + palingTua.nama);
        System.out.println("Jenis Kelamin : " + (palingTua.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + palingTua.usia);
        System.out.println("------------------------------");
    }

    public void infoDosenPalingMuda(Dosenn10[] arrayOfDosen) {
        Dosenn10 palingMuda = arrayOfDosen[0];
        for (Dosenn10 dosen : arrayOfDosen) {
            if (dosen.usia < palingMuda.usia) palingMuda = dosen;
        }
        System.out.println("\n=== Info Dosen Paling Muda ===");
        System.out.println("Kode          : " + palingMuda.kode);
        System.out.println("Nama          : " + palingMuda.nama);
        System.out.println("Jenis Kelamin : " + (palingMuda.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + palingMuda.usia);
        System.out.println("------------------------------");
    }
}