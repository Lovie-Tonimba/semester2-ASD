package arrayOfObjectsJobsheet3;
import java.util.Scanner;
public class MataKuliahDemo10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        MataKuliah10[] arrrayOfMataKuliah = new MataKuliah10[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Sks           : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam    : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-------------------------------");

            arrrayOfMataKuliah[i] = new MataKuliah10(kode, nama, sks, jumlahJam);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            System.out.println("Kode        : " + arrrayOfMataKuliah[i].kode);
            System.out.println("Nama        : " + arrrayOfMataKuliah[i].nama);
            System.out.println("Sks         : " + arrrayOfMataKuliah[i].sks);
            System.out.println("Jumlah Jam  : " + arrrayOfMataKuliah[i].jumlahJam);
            System.out.println("-------------------------------");
        }
    }
}