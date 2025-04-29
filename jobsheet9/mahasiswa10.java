package jobsheet9;

public class mahasiswa10 {
    String nama;
    String nim;
    String kelas;
    int nilai;
    public mahasiswa10() {
    }
    public mahasiswa10(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }
    void tugasDinilai(int nilai){
        this.nilai = nilai;
    }
}