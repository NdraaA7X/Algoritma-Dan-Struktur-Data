package CaseMethod2;

class NodePesanan10 {
    Pesanan10 data;
    NodePesanan10 next;
    NodePesanan10 prev;

    public NodePesanan10(Pesanan10 data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class PesananDLL10 {
    NodePesanan10 head;
    NodePesanan10 tail;

    public PesananDLL10() {
        head = null;
        tail = null;
    }

    public void tambahPesanan(int kode, String namaPesanan, int harga, String namaPembeli) {
        Pesanan10 p = new Pesanan10(kode, namaPesanan, harga, namaPembeli);
        NodePesanan10 node = new NodePesanan10(p);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    private void sortByNama() {
        if (head == null || head.next == null) return;

        NodePesanan10 i = head.next;
        while (i != null) {
            Pesanan10 key = i.data;
            NodePesanan10 j = i.prev;
            while (j != null && j.data.namaPesanan.compareToIgnoreCase(key.namaPesanan) > 0) {
                j.next.data = j.data;
                j = j.prev;
            }
            if (j == null) head.data = key;
            else j.next.data = key;
            i = i.next;
        }
    }

    public void laporanPesanan() {
        if (head == null) {
            System.out.println("Belum ada pesanan.");
            return;
        }
        sortByNama();
        System.out.println("======================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("======================================");
        System.out.printf("%-14s %-20s %-10s%n", "Kode Pesanan", "Nama Pesanan", "Harga");
        NodePesanan10 curr = head;
        int total = 0;
        while (curr != null) {
            System.out.printf("%-14d %-20s %-10d%n",
                curr.data.kodePesanan,
                curr.data.namaPesanan,
                curr.data.harga);
            total += curr.data.harga;
            curr = curr.next;
        }
        System.out.println("--------------------------------------");
        System.out.println("Total Pendapatan : Rp " + total);
    }

    public boolean isEmpty() {
        return head == null;
    }
}
