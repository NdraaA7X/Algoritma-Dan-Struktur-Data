package jobsheet6;

public class SortingMain10 {
    
    int a[] = {20, 10, 2, 7, 12};
    shorting10 dataurut1 = new shorting10(a, a.length);

    public SortingMain10() {
        System.out.println("Data Awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data Sudah Diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();
    }
}
