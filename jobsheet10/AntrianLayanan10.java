package jobsheet10;

public class AntrianLayanan10 {
    Mahasiswa10[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan10(int max) {
        this.max = max;
        data = new Mahasiswa10[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void tambahAntrian(Mahasiswa10 mhs) {
        if (isFull()) {
            System.out.println("Antrian Penuh, Tidak Dapat Menambah Mahasiswa");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " Berhasil Masuk Ke Antrian");
    }

    public Mahasiswa10 LayaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
            return null;
        }
        Mahasiswa10 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
        } else {
            System.out.print("Mahasiswa Terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
            return;
        }
        System.out.println("Daftar Mahasiswa Dalam Antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void LihatAkhir() {
    if (isEmpty()) {
        System.out.println("Antrian kosong.");
    } else {
        System.out.println("Mahasiswa paling belakang:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        data[rear].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }
}
