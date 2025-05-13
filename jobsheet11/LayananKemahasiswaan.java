package jobsheet11;
import java.util.Scanner;
public class LayananKemahasiswaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList antrian = new QueueLinkedList();
        int pilih;
        do { 
            System.out.println("\n================ Layanan Unit Kemahasiswaan =================");
            System.out.println("1. Daftar Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Cek Jumlah Antrian");
            System.out.println("6. Cek Antrian Kosong");
            System.out.println("7. Cek Antrian Penuh");
            System.out.println("8. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("\n============ Daftar Antrian ============");
                    System.out.print("NIM       : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama      : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi     : ");
                    String prodi = sc.nextLine();
                    System.out.print("Keperluan : ");
                    String keperluan = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, keperluan);
                    antrian.enqueue(mhs);
                    break;
                case 2:
                    System.out.println("\n============ Panggil Antrian ============");
                    antrian.dequeue();
                    break;
                case 3:
                    System.out.println("\n============ Antrian Terdepan ============");
                    antrian.peekFront();
                    break;
                case 4:
                    System.out.println("\n============ Antrian Terakhir ============");
                    antrian.peekRear();
                    break;
                case 5:
                    System.out.println("\n============ Cek Jumlah Antrian ============");
                    System.out.println("Jumlah mahasiswa dalam antrian saat ini: " + antrian.size());
                    antrian.print();
                    break;
                case 6:
                    System.out.println("\n============ Cek Antrian Kosong ============");
                        if (antrian.isEmpty()) {
                            System.out.println("Antrian masih kosong, belum ada mahasiswa yang mendaftar");
                        } else {
                            System.out.println("Terdapat mahasiswa yang mengantri");
                        }
                    break;
                case 7:
                    System.out.println("\n============ Cek Antrian Penuh ============");
                        if (antrian.isFull()) {
                            System.out.println("Antrian sudah penuh");
                        } else {
                            System.out.println("Antrian ini tidak memiliki kapasitas karena berbasis Linked List");
                        }
                    break;
                case 8:
                    System.out.println("\n============ Kosongkan Antrian ============");
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih senang melayani anda!");
                    break;
                default:
                    System.out.println("Invalid input, coba lagi");
            }
        } while (pilih != 0);
    }
}