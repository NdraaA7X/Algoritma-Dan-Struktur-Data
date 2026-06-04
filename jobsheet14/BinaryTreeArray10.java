package jobsheet14;

public class BinaryTreeArray10 {
    Mahasiswa10[] dataMahasiswa;
    int idxLast;
 
    public BinaryTreeArray10() {
        this.dataMahasiswa = new Mahasiswa10[10];
    }
 
    void populateData(Mahasiswa10 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }
 
    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    void add(Mahasiswa10 data) {
        idxLast++;
        dataMahasiswa[idxLast] = data;
    }
 
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}
