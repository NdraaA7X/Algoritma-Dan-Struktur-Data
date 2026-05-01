package jobsheet10;

public class AntrianKRS10 {
        Mahasiswaa10[] data;
    int front;
    int rear;
    int size;
    int max;
    int totalDilayani;
    int maxDilayani;

    public AntrianKRS10(int max) {
        this.max = max;
        this.maxDilayani = 30;
        data = new Mahasiswaa10[max];
        front = 0;
        rear = -1;
        size = 0;
        totalDilayani = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void kosongkanAntrian() {
        if (!isEmpty()) {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        } else {
            System.out.println("Antrian sudah kosong.");
        }
    }

    public void tambahAntrian(Mahasiswaa10 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian. Posisi antrian: " + size);
    }

    public void panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa yang dipanggil.");
            return;
        }
        System.out.println("=== Memanggil antrian untuk proses KRS ===");
        int dipanggil = 0;
        while (dipanggil < 2 && !isEmpty()) {
            if (totalDilayani >= maxDilayani) {
                System.out.println("Batas maksimal mahasiswa yang dilayani DPA (" + maxDilayani + ") sudah tercapai.");
                break;
            }
            Mahasiswaa10 mhs = data[front];
            front = (front + 1) % max;
            size--;
            totalDilayani++;
            dipanggil++;
            System.out.print("Melayani mahasiswa ke-" + totalDilayani + ": ");
            mhs.tampilkanData();
        }
        if (dipanggil == 0) {
            System.out.println("Tidak ada mahasiswa yang bisa dilayani.");
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void lihat2Terdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("2 Mahasiswa terdepan dalam antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        int tampil = Math.min(2, size);
        for (int i = 0; i < tampil; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void lihatPalingAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Mahasiswa paling akhir dalam antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        data[rear].tampilkanData();
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getTotalDilayani() {
        return totalDilayani;
    }

    public int getBelumKRS() {
        return size;
    }
}
