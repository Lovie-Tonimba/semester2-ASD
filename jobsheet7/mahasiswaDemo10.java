package jobsheet7;

import java.util.Scanner;
public class mahasiswaDemo10 {
    public static void main(String[] args) {
        mahasiswaBerprestasi10 list = new mahasiswaBerprestasi10();
            // mahasiswa10 m1 = new mahasiswa10("123", "Zidan", "2A", 3.2);
            // mahasiswa10 m2 = new mahasiswa10("124", "Ayu", "2A", 3.5);
            // mahasiswa10 m3 = new mahasiswa10("125", "Sofi", "2A", 3.1);
            // mahasiswa10 m4 = new mahasiswa10("126", "Sita", "2A", 3.9);
            // mahasiswa10 m5 = new mahasiswa10("127", "Miki", "2A", 3.7);
    
            // list.tambah(m1);
            // list.tambah(m2);
            // list.tambah(m3);
            // list.tambah(m4);
            // list.tambah(m5);
    
            // System.out.println("Data mahasiswa sebelum sorting: ");
            // list.tampil();
    
            // System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
            // list.bubbleSort();
            // list.tampil();
            
            // System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
            // list.selectionSort();
            // list.tampil();
            
            // System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
            // list.insertionSort();
            // list.tampil();
    
            // System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC)");
            // list.insertionSortDSC();
            // list.tampil();
    
            
            //modif

            // System.out.println("Data mahasiswa sebelum sorting: ");
            // list.tampil();
            // System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
            // list.bubbleSort();
            // list.tampil();

            //JOBSHEET 7 SEARCHING
            Scanner sc = new Scanner(System.in);
            int jumMhs = 5;
            for (int i = 0; i < jumMhs; i++) {
                System.out.println("Masukkan data mahasiswa ke-" + (i+1));
                System.out.print("NIM   : ");
                String nim = sc.nextLine();
                System.out.print("Nama  : ");
                String nama = sc.nextLine();
                System.out.print("Kelas : ");
                String kelas = sc.nextLine();
                System.out.print("IPK   : ");
                String ip = sc.nextLine();
                double ipk = Double.parseDouble(ip);
                System.out.println("------------------------------------");                
                list.tambah(new mahasiswa10(nim, nama, kelas, ipk));
            }
            list.tampil();
            //melakukan pencarian data sequential
            System.out.println("------------------------------------");                
            System.out.println("Pencarian data");
            System.out.println("------------------------------------");                
            System.out.println("masukkan ipk mahasiswa yang dicari: ");
            System.out.print("IPK: ");
            double cari = sc.nextDouble();

            System.out.println("menggunakan sequential searching");
            double posisi = list.sequentialSearching(cari);
            int pss = (int)posisi;
            list.tampilPosisi(cari, pss);
            list.tampilDataSearch(cari, pss);
    }
}