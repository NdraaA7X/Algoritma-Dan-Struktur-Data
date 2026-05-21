package CaseMethod2;

class NodeAntrian10 {
    Pembeli10 data;
    NodeAntrian10 next;
    NodeAntrian10 prev;

    public NodeAntrian10(Pembeli10 data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class AntrianDLL10 {
    NodeAntrian10 head;
    NodeAntrian10 tail;
    int counter;

    public AntrianDLL10() {
        head = null;
        tail = null;
        counter = 0;
    }

    public void tambahAntrian(String nama, String noHp) {
        counter++;
        Pembeli10 p = new Pembeli10(counter, nama, noHp);
        NodeAntrian10 node = new NodeAntrian10(p);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + counter);
    }

    public void cetakAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("==============================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("==============================");
        System.out.printf("%-12s %-15s %-15s%n", "No Antrian", "Nama", "No HP");
        NodeAntrian10 curr = head;
        while (curr != null) {
            System.out.printf("%-12d %-15s %-15s%n",
                curr.data.noAntrian,
                curr.data.namaPembeli,
                curr.data.noHp);
            curr = curr.next;
        }
    }

    public String hapusAntrian(int noAntrian) {
        NodeAntrian10 curr = head;
        while (curr != null) {
            if (curr.data.noAntrian == noAntrian) {
                String nama = curr.data.namaPembeli;
                if (curr.prev != null) curr.prev.next = curr.next;
                else head = curr.next;

                if (curr.next != null) curr.next.prev = curr.prev;
                else tail = curr.prev;

                return nama;
            }
            curr = curr.next;
        }
        return null;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
