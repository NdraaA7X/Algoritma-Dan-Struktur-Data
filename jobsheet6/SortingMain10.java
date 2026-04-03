package jobsheet6;

public class SortingMain10 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        int b[] = {30, 20, 2, 8, 14};

        shorting10 dataurut1 = new shorting10(a, a.length);
            System.out.println("Data Awal 1");
            dataurut1.tampil();
            dataurut1.bubbleSort();
            System.out.println("Data Sudah Diurutkan dengan BUBBLE SORT (ASC)");
            dataurut1.tampil();      
            
        shorting10 dataurut2 = new shorting10(b, b.length);
            System.out.println("Data Awal 2");
            dataurut2.tampil();
            dataurut2.SelectionSort();
            System.out.println("Data Sudah Diurutkan dengan SELECTION SORT (ASC)");
            dataurut2.tampil();
    }
}
