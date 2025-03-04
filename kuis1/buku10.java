package kuis1;
public class buku10 {
    String kodeBuku;
    String judulBuku;
    String penulis;
    boolean statusPeminjaman;

    public buku10(String kodeBuku, String judulBuku, String penulis){
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.penulis = penulis;
        this.statusPeminjaman = false;
    }
}