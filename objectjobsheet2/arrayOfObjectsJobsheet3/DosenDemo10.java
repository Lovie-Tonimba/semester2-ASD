package arrayOfObjectsJobsheet3;
import java.util.Scanner;
public class DosenDemo10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Dosen10[] arrayOfDosen = new Dosen10[3];
        String kode, nama, inputJK;
        int usia;
        boolean jenisKelamin;
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            System.out.print("Kode          : ");
            kode = sc.next();  
            sc.nextLine();          
            System.out.print("Nama          : ");
            nama = sc.next();
            sc.nextLine();
            System.out.print("Jenis Kelamin (Pria/Wanita): ");
            inputJK = sc.next();
            if (inputJK.equalsIgnoreCase("Pria")) {
                jenisKelamin = true;
            }else if(inputJK.equalsIgnoreCase("Wanita")){
                jenisKelamin = false;
            }else{
                System.out.println("Input tidak valid. Default : Laki-laki");
                jenisKelamin = true;
            }
            
            System.out.print("Usia          : ");
            usia = sc.nextInt();

            arrayOfDosen[i] = new Dosen10(kode, nama, jenisKelamin, usia);
            System.out.println("------------------------------------------------");
        }

        System.out.println("\nDATA DOSEN");
        for (Dosen10 dosen : arrayOfDosen) {
            System.out.println("Kode            : " + dosen.kode);
            System.out.println("Nama            : " + dosen.nama);
            System.out.println("Jenis Kelamin   : " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia            : " + dosen.usia);
            System.out.println("------------------------------------------------");
        }
    }
}