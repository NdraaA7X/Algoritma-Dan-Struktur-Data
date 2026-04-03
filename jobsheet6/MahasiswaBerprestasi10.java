package jobsheet6;
import java.util.Scanner;

public class MahasiswaBerprestasi10 {
    Mahasiswa10[] listMhs = new Mahasiswa10[5];
    int idx;

    void tambah(Mahasiswa10 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa10 m : listMhs) {
            m.tampilInformasi();
            System.out.println("---------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa10 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    void insertionSortDesc() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa10 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }

    void tambahDinamis() {
        Scanner sc = new Scanner(System.in);
        if (idx < listMhs.length) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (idx + 1));
            System.out.print("NIM    : ");
            String nim   = sc.nextLine();
            System.out.print("Nama   : ");
            String nama  = sc.nextLine();
            System.out.print("Kelas  : ");
            String kelas = sc.nextLine();
            System.out.print("IPK    : ");
            double ipk   = Double.parseDouble(sc.nextLine());
            System.out.println("------------------------------");
            listMhs[idx] = new Mahasiswa10(nim, nama, kelas, ipk);
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }

        sc.close();
    }
}
