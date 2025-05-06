package jobsheet10;
import java.util.Scanner;
public class DPA {
    public static void menu() {
        System.out.println("\n=== Menu Antrian Persetujuan KRS ===");
        System.out.println("1. Tambah Antrian KRS");
        System.out.println("2. Panggil Antrian untuk Proses KRS (2 Mahasiswa)");
        System.out.println("3. Tampilkan Semua Antrian");
        System.out.println("4. Tampilkan Dua Antrian Terdepan");
        System.out.println("5. Tampilkan Antrian Paling Akhir");
        System.out.println("6. Cetak Jumlah Antrian");
        System.out.println("7. Cetak Jumlah Sudah Proses KRS");
        System.out.println("8. Cetak Jumlah Belum Proses KRS");
        System.out.println("9. Kosongkan Antrian KRS");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        antrianKRS antrianKRS = new antrianKRS();
        int pilihan;
        do {
            menu();
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = sc.nextLine();
                    mhs mahasiswa = new mhs(nim, nama, prodi, kelas);
                    antrianKRS.tambahAntrian(mahasiswa);
                    break;
                case 2:
                    antrianKRS.panggilAntrian();
                    break;
                case 3:
                    antrianKRS.tampilkanSemuaAntrian();
                    break;
                case 4:
                    antrianKRS.tampilkanDuaTerdepan();
                    break;
                case 5:
                    antrianKRS.tampilkanAntrianTerakhir();
                    break;
                case 6:
                    antrianKRS.cetakJumlahAntrian();
                    break;
                case 7:
                    antrianKRS.cetakJumlahDiproses();
                    break;
                case 8:
                    System.out.println("Jumlah mahasiswa yang belum proses KRS: " + antrianKRS.cetakJumlahBelumDiproses());
                    break;
                case 9:
                    antrianKRS.kosongkanAntrian();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        sc.close();
    }
}