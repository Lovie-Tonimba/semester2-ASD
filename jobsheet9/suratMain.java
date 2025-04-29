package jobsheet9;
import java.util.Scanner;
public class suratMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stackSurat stack = new stackSurat(5);
        surat10[] verified = new surat10[5]; 
        int jumVerified = 0;
        int pilih;
        do { 
            System.out.println("========================== MENU PENGELOLAAN SURAT IZIN MAHASISWA ==========================");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir (Teratas)");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine(); 
                    System.out.print("Jenis Izin (S/I): ");
                    String jenisIzin = sc.nextLine().toUpperCase();
                    char jenis = jenisIzin.length() > 0 ? jenisIzin.charAt(0) : ' ';
                    System.out.print("Durasi Izin (berapa hari?): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    if (jenis == 'S' || jenis == 'I') {
                        surat10 surat = new surat10(id, nama, kelas, jenis, durasi);
                        stack.push(surat);
                        System.out.println("Surat izin dari " + nama + " berhasil diterima.");
                        System.out.println("~~~~~~~~~~ Daftar surat izin yang diterima ~~~~~~~~~~");
                        stack.print();
                    } else {
                        System.out.println("Gunakan 'S' untuk sakit atau 'I' untuk izin lainnya. Coba lagi");
                    }
                    break;
                case 2:
                    surat10 suratDiproses = stack.pop();
                    if(suratDiproses != null){
                        System.out.println("Memproses surat izin dengan ID: " + suratDiproses.idSurat + " dengan data Mahasiswa sebagai berikut: ");
                        System.out.println("Nama: " + suratDiproses.namaMahasiswa +
                                           "\tKelas: " + suratDiproses.kelas +
                                           "\tJenis: " + suratDiproses.jenisIzin +
                                           "\tDurasi: " + suratDiproses.durasi + " hari");
                        System.out.println("Surat izin telah diverifikasi.");
                        System.out.print("Apakah surat ini terverifikasi? (y/n): ");
                        String verifikasi = sc.nextLine();
                        if (verifikasi.equalsIgnoreCase("y")) {
                            if (jumVerified < verified.length) {
                                verified[jumVerified] = suratDiproses;
                                jumVerified++;
                                System.out.println("Surat izin telah diverifikasi dan disimpan.");
                            } else {
                                System.out.println("Kapasitas penyimpanan surat terverifikasi penuh");
                            }
                        } else {
                            System.out.println("Surat izin belum diverifikasi");
                        }
                    }                    
                    break;
                case 3:
                    surat10 suratTerakhir = stack.peek();                    
                    if(suratTerakhir != null){
                        System.out.println("Surat terakhir diajukan oleh " + suratTerakhir.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang ingin dicari: ");
                    String cari = sc.nextLine();
                    surat10 suratDitemukan = null; 
                    for (int i = 0; i <= stack.top; i++) {
                        if (stack.stack[i].namaMahasiswa.equalsIgnoreCase(cari)) {
                            suratDitemukan = stack.stack[i]; 
                            break; 
                        }
                    }
                
                    if (suratDitemukan != null) {
                        System.out.println("Ditemukan surat izin atas nama " + cari + " dengan data Mahasiswa sebagai berikut:");
                        System.out.println("  ID Surat: " + suratDitemukan.idSurat);
                        System.out.println("  Nama: " + suratDitemukan.namaMahasiswa);
                        System.out.println("  Kelas: " + suratDitemukan.kelas);
                        System.out.println("  Jenis: " + suratDitemukan.jenisIzin);
                        System.out.println("  Durasi: " + suratDitemukan.durasi + " hari");
                    } else {
                        System.out.println("Tidak ditemukan surat izin atas nama " + cari);
                    }                    
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}