package jobsheet5;

public class MainMahasiswa10 {
    
    public static void main(String[] args) {
        Mahasiswa10[] mhs = {
            new Mahasiswa10("Ahmad", 220101001, 2022, 78, 82),
            new Mahasiswa10("budi", 220101002, 2022, 85, 88),
            new Mahasiswa10("Cindy", 220101003, 2021, 90, 87),
            new Mahasiswa10("Dian", 220101004, 2021, 76, 79),
            new Mahasiswa10("Eko", 220101005, 2023, 92, 95),
            new Mahasiswa10("Fajar", 220101006, 2020, 88, 85),
            new Mahasiswa10("Gina", 220101007, 2023, 80, 83),
            new Mahasiswa10("Hadi", 220101008, 2020, 82, 84)
        };

        int[] nilaiUTS = new int[mhs.length];
        int[] nilaiUAS = new int[mhs.length];
        for (int i = 0; i < mhs.length; i++) {
            nilaiUTS[i] = mhs[i].nilaiUTS;
            nilaiUAS[i] = mhs[i].nilaiUAS;
        }

        Mahasiswa10 m = new Mahasiswa10("", 0, 0, 0, 0);

        System.out.println("a) Nilai UTS Tertinggi (DC): " + m.maxUTS(nilaiUTS, 0, nilaiUTS.length - 1));
        System.out.println("b) Nilai UTS Terendah (DC): " + m.minUTS(nilaiUTS, 0, nilaiUTS.length - 1));
        System.out.println("c) Rata - Rata Nilai UAS (BF): " + m.rataUAS(nilaiUAS));
    }
}
