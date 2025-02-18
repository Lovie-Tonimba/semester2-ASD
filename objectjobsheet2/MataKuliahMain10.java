package objectjobsheet2;
public class MataKuliahMain10 {
    public static void main(String[] args) {
        MataKuliah10 mk1 = new MataKuliah10();
        mk1.kodeMK = "PASD1G24";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 2;
        mk1.jumlahJam = 6;

        mk1.tampilInformasi();
        mk1.ubahSKS(3);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        System.out.println();
        mk1.tampilInformasi();

        System.out.println("==================================================");

        MataKuliah10 mk2 = new MataKuliah10("BDYWS1G24", "Basis Data", 2, 4);
        mk2.tampilInformasi();
        mk2.ubahSKS(4);
        mk2.tambahJam(1);
        mk2.kurangiJam(2);
        System.out.println();
        mk2.tampilInformasi();
    }
}
