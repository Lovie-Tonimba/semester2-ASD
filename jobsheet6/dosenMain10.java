package jobsheet6;
import java.util.Scanner;
public class dosenMain10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dataDosen10 list = new dataDosen10();
        int input;

        while (true) { 
            System.out.println("==================MENU DATA DOSEN=================");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting ASC Usia Termuda ke Tertua dengan BUBBLE SORT");
            System.out.println("4. Sorting DSC Usia Tertua ke Termuda dengan SELECTION SORT & INSERTION SORT");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            input = sc.nextInt();
            sc.nextLine();
             
            if(input == 1){
                System.out.println("TAMBAH DATA DOSEN");
                for (int i = 0; i < 2; i++) {
                    System.out.println("Masukkan data dosen ke-" + (i+1));
                    System.out.print("Kode: ");
                    String kode = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (Pria:True Wanita:False): ");
                    boolean jk = sc.nextBoolean();
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine();
                    
                    list.tambah(new dosen10(kode, nama, jk, usia));
                }        
            }else if(input == 2){
                System.out.println("TAMPILKAN DATA DOSEN");
                System.out.println("=======================================================================");
                System.out.println("Data dosen sebelum sorting:");
                list.tampil();
        
            }else if(input == 3){
                System.out.println("Sorting ASC Usia Termuda ke Tertua dengan BUBBLE SORT");
                System.out.println("=======================================================================");
                System.out.println("Data dosen setelah sorting ASC dengan Bubble Sort");
                list.sortingASC();
                list.tampil();
            }else if(input == 4){
                System.out.println("Sorting DSC Usia Tertua ke Termuda dengan SELECTION SORT & INSERTION SORT");
                System.out.println("=======================================================================");
                System.out.println("Data dosen setelah sorting DSC dengan Selection Sort");
                list.sortingDSC();
                list.tampil();
        
                System.out.println("=======================================================================");
                System.out.println("Data dosen setelah sorting DSC dengan Insertion Sort):");
                list.insertionSort();
                list.tampil();
            }else if(input == 5){
                System.out.println("Terima Kasih");
                break;
            }else{
                System.out.println("Invalid input coba lagi");
            }
        }
    }
}