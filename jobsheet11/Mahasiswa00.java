package jobsheet11;
public class Mahasiswa00 {
    String nim;
    String nama;
    String kelas;
    double ipk;
    public Mahasiswa00() {
    }
    public Mahasiswa00(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }
    void tampilInformasi(){
        System.out.println(nama + "\t\t" + nim + "\t\t" + kelas + "\t\t" + ipk);
    }
}