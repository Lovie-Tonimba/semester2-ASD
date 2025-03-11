package jobsheet5;

public class mainDaftarNilai {
    public static void main(String[] args) {
        int maxUTS, minUTS;

        daftarNilai10[] mhs = {
            new daftarNilai10("Ahmad", "220101001", 2022, 78, 82),
            new daftarNilai10("Budi", "220101002", 2022, 85, 88),
            new daftarNilai10("Cindy", "220101003", 2021, 90, 87),
            new daftarNilai10("Dian", "220101004", 2021, 76, 79),
            new daftarNilai10("Eko", "220101005", 2023, 92, 95),
            new daftarNilai10("Fajar", "220101006", 2020, 88, 85),
            new daftarNilai10("Gina", "220101007", 2023, 80, 83),
            new daftarNilai10("Hadi", "220101008", 2020, 82, 84),
        };
        
        maxUTS = daftarNilai10.utsTertinggi(mhs, 0, mhs.length - 1);
        System.out.println("Nilai UTS tertinggi                     : " + maxUTS);
        minUTS = daftarNilai10.utsTerendah(mhs, 0, mhs.length - 1);
        System.out.println("Nilai UTS terendah                      : " + minUTS);

        daftarNilai10 rerata = new daftarNilai10("", "", 0, 0, 0);
        System.out.println("Rata-rata nilai UAS dari semua mahasiswa: " + rerata.avarageUAS(mhs));
    }
}