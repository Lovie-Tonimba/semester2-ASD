package jobsheet6;
public class mahasiswaDemo10 {
    public static void main(String[] args) {
        mahasiswaBerprestasi10 list = new mahasiswaBerprestasi10();
        mahasiswa10 m1 = new mahasiswa10("123", "Zidan", "2A", 3.2);
        mahasiswa10 m2 = new mahasiswa10("124", "Ayu", "2A", 3.5);
        mahasiswa10 m3 = new mahasiswa10("125", "Sofi", "2A", 3.1);
        mahasiswa10 m4 = new mahasiswa10("126", "Sita", "2A", 3.9);
        mahasiswa10 m5 = new mahasiswa10("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();
    }
}