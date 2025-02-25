package arrayOfObjectsJobsheet3;
import java.util.Scanner;
public class MataKuliah10 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah10(String kode, String nama, int sks, int jumlahJam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    public MataKuliah10(){

    }

    void tambahData(){
        Scanner sc = new Scanner(System.in);
        String dummy;

        System.out.print("Kode          : ");
        this.kode = sc.nextLine();
        System.out.print("Nama          : ");
        this.nama = sc.nextLine();
        System.out.print("Sks           : ");
        dummy = sc.nextLine();
        this.sks = Integer.parseInt(dummy);
        System.out.print("Jumlah Jam    : ");
        dummy = sc.nextLine();
        this.jumlahJam = Integer.parseInt(dummy);
        System.out.println("-------------------------------");
    }
    void cetakInfo(){
        System.out.println("Kode        : " + kode);
        System.out.println("Nama        : " + nama);
        System.out.println("Sks         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
        System.out.println("-------------------------------");
    }
    
    // public MataKuliah10(String kode, String nama){
    //     this.kode = kode;
    //     this.nama = nama;
    //     this.sks = 2;
    //     this.jumlahJam = 4;
    // }
}