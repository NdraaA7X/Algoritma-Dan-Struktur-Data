package jobsheet9;

public class StackSurat10 {
    Surat10[] stack;
    int size;
    int top;
 
    public StackSurat10(int size) {
        this.size = size;
        stack = new Surat10[size];
        top = -1;
    }
 
    public boolean isFull() {
        return top == size - 1;
    }
 
    public boolean isEmpty() {
        return top == -1;
    }
 
    public void push(Surat10 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
        }
    }
 
    public Surat10 pop() {
        if (!isEmpty()) {
            Surat10 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }
 
    public Surat10 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat.");
            return null;
        }
    }
 
    public void cariSurat(String namaMahasiswa) {
        boolean ketemu = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                System.out.println("Surat ditemukan!");
                System.out.println("ID Surat  : " + stack[i].idSurat);
                System.out.println("Nama      : " + stack[i].namaMahasiswa);
                System.out.println("Kelas     : " + stack[i].kelas);
                System.out.println("Jenis Izin: " + stack[i].jenisIzin + (stack[i].jenisIzin == 'S' ? " (Sakit)" : " (Izin)"));
                System.out.println("Durasi    : " + stack[i].durasi + " hari");
                ketemu = true;
            }
        }
        if (!ketemu) {
            System.out.println("Surat atas nama " + namaMahasiswa + " tidak ditemukan.");
        }
    }
}
