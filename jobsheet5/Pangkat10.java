package jobsheet5;

public class Pangkat10 {
    int nilai, npangkat;

    Pangkat10(int n, int p) {
        nilai = n;
        npangkat = p;
    }

    public int PangkatBF(int a, int b) {
        int hasil = 1;
        for (int i = 0; i < b; i++) {
            hasil = hasil * a;
        }
        return hasil;
    }
}
