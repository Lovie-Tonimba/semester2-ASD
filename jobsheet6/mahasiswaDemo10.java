package jobsheet6;

import java.util.Scanner;

public class mahasiswaDemo10 {
    public static void main(String[] args) {
        // mahasiswaBerprestasi10 list = new mahasiswaBerprestasi10();
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

        
        // System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        // list.selectionSort();
        // list.tampil();
        
        // System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        // list.insertionSort();
        // list.tampil();
        
        
        //modif
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();
        mahasiswaBerprestasi10 list = new mahasiswaBerprestasi10(jumlah);
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            
            list.tambah(new mahasiswa10(nim, nama, kelas, ipk));
        }
        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();
        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();
    }
}