package jobsheet11;
public class Mahasiswa {
    String nim;
    String nama;
    String prodi;
    String keperluan;
    public Mahasiswa() {
    }
    public Mahasiswa(String nim, String nama, String prodi, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.keperluan = keperluan;
    }
    public void tampilInformasi(){
        System.out.println("NIM         : " + nim);
        System.out.println("Nama        : " + nama);
        System.out.println("Prodi       : " + prodi);
        System.out.println("Keperluan   : " + keperluan);
    }
}