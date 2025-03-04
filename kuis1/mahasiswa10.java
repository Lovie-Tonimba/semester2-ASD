package kuis1;

public class mahasiswa10 {
    String nim;
    String nama;
    int jumlahBuku;
    buku10[] pinjamBuku;

    public mahasiswa10(String nim, String nama){
        this.nim = nim;
        this.nama = nama;
        this.pinjamBuku = new buku10[2];
        this.jumlahBuku = 0;
    }
}