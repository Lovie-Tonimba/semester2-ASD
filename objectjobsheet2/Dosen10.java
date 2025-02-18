package objectjobsheet2;
public class Dosen10 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen10() {
    }

    public Dosen10(String id, String nm, boolean status, int tahun, String bidang) {
        this.idDosen = id;
        this.nama = nm;
        this.statusAktif = status;
        this.tahunBergabung = tahun;
        this.bidangKeahlian = bidang;
    }

    void tampilInformasi() {
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama Dosen      : " + nama);
        System.out.println("Status Aktif    : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
        System.out.println("Status aktif telah diubah : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
    }

    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian telah diubah : " + bidangKeahlian);
    }
}
