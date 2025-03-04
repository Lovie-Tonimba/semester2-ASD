package kuis1;
import java.util.Scanner;
public class main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        perpustakaan10 perpus = new perpustakaan10();

        System.out.println("Menu Perpustakaan: ");
        System.out.println("1. Tambah Buku");
        System.out.println("2. Tambah Mahasiswa");
        System.out.println("3. Pinjam Buku");
        System.out.println("4. Kembalikan Buku");
        System.out.println("5. Tampilkan Peminjaman");
        System.out.println("6. Keluar");
        while (true) {
            System.out.print("Pilih menu: ");
            int pilih = sc.nextInt();
            sc.nextLine();

            if (pilih == 1) {
                System.out.println();
                System.out.print("Masukkan kode buku        : ");
                String kode = sc.nextLine();
                System.out.print("Masukkan judul buku       : ");
                String judul = sc.nextLine();
                System.out.print("Masukkan penulis          : ");
                String penulis = sc.nextLine();
                perpus.tambahBuku(kode, judul, penulis);
            }else if(pilih == 2){
                System.out.println();
                System.out.print("Masukkan NIM mahasiswa    : ");
                String nim = sc.nextLine();
                System.out.print("Masukkan nama mahasiswa   : ");
                String nama = sc.nextLine();
                perpus.tambahMahasiswa(nim, nama);
            }else if(pilih == 3){
                System.out.println();
                System.out.print("Masukkan NIM mahasiswa    : ");
                String nim = sc.nextLine();
                System.out.print("Masukkan kode buku        : ");
                String kode = sc.nextLine();
                perpus.pinjamBuku(nim, kode);
            }else if(pilih == 4){
                System.out.println();
                System.out.print("Masukkan NIM mahasiswa    : ");
                String nim = sc.nextLine();
                System.out.print("Masukkan kode buku        : ");
                String kode = sc.nextLine();
                perpus.kembalikanBuku(nim, kode);
            }else if(pilih == 5){
                System.out.println();
                System.out.println("Daftar Peminjaman Buku  : ");
                perpus.tampilkanPeminjaman();
            }else if(pilih == 6){
                System.out.println("Terima kasih telah menggunakan sistem perpustakaan.");
                break;
            }else{
                System.out.println("Invalid input. Pilih salah satu menu yang tertera");
            }
        }
    }
}