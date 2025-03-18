package jobsheet6;
public class mahasiswa10 {
    String nim;
    String nama;
    String kelas;
    double ipk;
    mahasiswa10(){

    }
    mahasiswa10(String nm, String name, String kls, double ip){
        nim = nm;
        nama = name;
        ipk = ip;
        kelas = kls;
    }
    void tampilInformasi(){
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Kelas   : " + kelas);
        System.out.println("IPK     : " + ipk);
    }
}