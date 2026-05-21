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
        System.out.printf("%-12s %-16s %s%n", "No Antrian", "Nama", "No HP");
        NodeAntrian10 curr = head;
        while (curr != null) {
            System.out.printf("%-12d %-16s %s%n",
                curr.data.noAntrian,
                curr.data.namaPembeli,
                curr.data.noHp);
            curr = curr.next;
        }
    }

    public String hapusHead() {
        if (head == null) return null;
        String nama = head.data.namaPembeli;
        head = head.next;
        if (head != null) head.prev = null;
        else tail = null;
        return nama;
    }

    public boolean isEmpty() {
        return head == null;
    }
}