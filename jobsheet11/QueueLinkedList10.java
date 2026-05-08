package jobsheet11;

public class QueueLinkedList10 {
    NodeAntrian10 head;
    NodeAntrian10 tail; 
    int size;
    final int MAX = 10;
 
    public QueueLinkedList10() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isFull() {
        return size == MAX;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void enqueue(MahasiswaAntrian10 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        NodeAntrian10 node = new NodeAntrian10(mhs, null);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
        System.out.printf("Mahasiswa %s berhasil masuk antrian.%n", mhs.nama);
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang dipanggil.");
            return;
        }
        System.out.println("Memanggil: " + head.data.nama);
        head.data.tampilInformasi();
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
        size--;
    }

    public void peekFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian terdepan:");
            head.data.tampilInformasi();
        }
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian paling akhir:");
            tail.data.tampilInformasi();
        }
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa yang masih mengantri: " + size);
    }
 
    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar Antrian:");
            System.out.printf("%-4s %-12s %-10s %-6s %s%n", "No", "Nama", "NIM", "Kelas", "Keperluan");
            NodeAntrian10 tmp = head;
            int no = 1;
            while (tmp != null) {
                System.out.printf("%-4d ", no++);
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println();
        }
    }
}
