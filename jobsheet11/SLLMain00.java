package jobsheet11;
import java.util.Scanner;
public class SLLMain00 {
    public static void main(String[] args) {
        //MODIF PERCOBAAN 1
        Scanner sc = new Scanner(System.in);
        SingleLinkedList00 sll = new SingleLinkedList00();

        System.out.print("Masukkan jumlah mahasiswa yang ingin ditambahkan: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i+1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa00 mhs = new Mahasiswa00(nim, nama, kelas, ipk);
            System.out.print("Tambahkan ke (1) Awal, (2) Akhir, (3) Setelah Nama, (4) Posisi Tertentu: ");
            int pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    sll.addFirst(mhs);
                    break;
                case 2:
                    sll.addLast(mhs);
                    break;
                case 3:
                    System.out.print("Masukkan nama setelah siapa data akan dimasukkan: ");
                    String namaKey = sc.nextLine();
                    sll.insertAfter(namaKey, mhs);
                    break;
                case 4:
                    System.out.print("Masukkan index (wajib dari 0): ");
                    int index = sc.nextInt();
                    sc.nextLine(); 
                    sll.insertAt(index, mhs);
                    break;
                default:
                System.out.println("Invalid input, data tidak dimasukkan.");
            }
        }
        System.out.println("Data Mahasiswa dalam Linked List:");
        sll.print();
        // Mahasiswa00 mhs1 = new Mahasiswa00("24212200", "Alvaro", "1A", 4.0);
        // Mahasiswa00 mhs2 = new Mahasiswa00("23212201", "Bimon", "2B", 3.8);
        // Mahasiswa00 mhs3 = new Mahasiswa00("22212202", "Cintia", "3C", 3.5);
        // Mahasiswa00 mhs4 = new Mahasiswa00("21212203", "Dirga", "4D", 3.6);
        // sll.print();
        // sll.addFirst(mhs4);
        // sll.print();
        // sll.addLast(mhs1);
        // sll.print();
        // sll.insertAfter("Dirga", mhs3);
        // sll.insertAt(2, mhs2);
        // sll.print();
    }
}