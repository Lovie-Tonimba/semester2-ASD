package objectjobsheet2;
public class DosenMain10 {
    public static void main(String[] args) {
        Dosen10 dosen1 = new Dosen10();
        dosen1.idDosen = "12345";
        dosen1.nama = "Pramana Yoga Saputra";
        dosen1.statusAktif = false;
        dosen1.tahunBergabung = 2015;
        dosen1.bidangKeahlian = "Basis Data";
    
        dosen1.tampilInformasi();
        dosen1.setStatusAktif(true);
        dosen1.ubahKeahlian("Pemrograman");
        System.out.println();
        dosen1.tampilInformasi();
        System.out.println("Masa kerja: " + dosen1.hitungMasaKerja(2025) + " tahun");
    
        System.out.println("==================================================");
    
        Dosen10 dosen2 = new Dosen10("56789", "Hendra Pradibta", false, 2010, "Akuntansi");
        dosen2.tampilInformasi();
        dosen2.setStatusAktif(true);
        dosen2.ubahKeahlian("Manajemen Bisnis");
        System.out.println();
        dosen2.tampilInformasi();
        System.out.println("Masa kerja: " + dosen2.hitungMasaKerja(2025) + " tahun");
    }
}
