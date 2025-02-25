package arrayOfObjectsJobsheet3;
import java.util.Scanner;
public class MataKuliahDemo10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Input jumlah data Matakuliah: ");
        int kuota = sc.nextInt();
        System.out.println("------------------------------");

        MataKuliah10[] arrrayOfMataKuliah = new MataKuliah10[kuota];

        for (int i = 0; i < arrrayOfMataKuliah.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            arrrayOfMataKuliah[i] = new MataKuliah10();
            arrrayOfMataKuliah[i].tambahData();
        }

        for (int i = 0; i < arrrayOfMataKuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            arrrayOfMataKuliah[i].cetakInfo();
        }


        // MataKuliah10 modifNo1 = new MataKuliah10("SISOP1G24", "Sistem Opersi");
        // System.out.println("Data Matakuliah ke-4");
        // System.out.println("Kode            : " + modifNo1.kode);
        // System.out.println("Nama            : " + modifNo1.nama);
        // System.out.println("Sks             : " + modifNo1.sks);
        // System.out.println("Jumlah Jam      : " + modifNo1.jumlahJam);
    }
}