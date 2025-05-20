package jobsheet12;
import java.util.Scanner;
public class DLLMain {
    public static Mahasiswa10 inputMahasiswa(Scanner sc) {
        System.out.print("Masukkan NIM  : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK  : ");
        double ipk = sc.nextDouble();
        sc.nextLine();

        return new Mahasiswa10(nim, nama, kelas, ipk);
    }
    public static void main(String[] args) {
        DoubleLinkedLists10 list = new DoubleLinkedLists10();
        Scanner sc = new Scanner(System.in);
        int pilihan;
        do { 
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus dari awal");
            System.out.println("4. Hapus dari akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Tambah data baru setelah NIM tertentu");
            System.out.println("8. Tambah data baru pada indeks tertentu");
            System.out.println("9. Hapus data setelah NIM tertentu");
            System.out.println("10. Hapus data pada indeks tertentu");
            System.out.println("11. Tampilkan data node Head"); 
            System.out.println("12. Tampilkan data node Tail"); 
            System.out.println("13. Tampilkan data node pada indeks tertentu"); 
            System.out.println("14. Tampilkan jumlah data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            try {
                switch (pilihan) {
                    case 1:
                        Mahasiswa10 mhs = inputMahasiswa(sc);
                        list.addFirst(mhs);
                        break;
                    case 2:
                        mhs = inputMahasiswa(sc);
                        list.addLast(mhs);
                        break;
                    case 3:
                        list.removeFirst();
                        break;
                    case 4:
                        list.removeLast();
                        break;
                    case 5:
                        list.print();
                        break;
                    case 6:
                        System.out.print("Masukkan NIM yang dicari: ");
                        String nim = sc.nextLine();
                        Node10 found = list.search(nim);
                        if(found != null){
                            System.out.println("Data ditemukan:");
                            found.data.tampil();
                        }else{
                            System.out.println("Data tidak ditemukan.");
                        }
                        break;
                    case 7:
                    //modif no 8
                        System.out.print("Masukkan NIM Mahasiswa yang akan disisipi setelahnya: ");
                        String keyNim = sc.nextLine();
                        System.out.println("Masukkan data Mahasiswa yang akan disisipkan:");
                        mhs = inputMahasiswa(sc);
                        list.insertAfter(keyNim, mhs);
                        break;
                    case 8:
                        System.out.print("Masukkan indeks tempat data akan disisipkan: ");
                        int indexAdd = sc.nextInt();
                        sc.nextLine();

                        mhs = inputMahasiswa(sc);
                        list.add(mhs, indexAdd);
                        System.out.println("Mahasiswa berhasil ditambahkan di indeks " + indexAdd);
                        break;
                    case 9:
                        System.out.print("Masukkan NIM Mahasiswa yang ingin dihapus datanya setelah: ");
                        String key = sc.nextLine();
                        list.removeAfter(key);
                        break;
                    case 10:
                        System.out.print("Masukkan indeks data yang akan dihapus: ");
                        int indexRemove = sc.nextInt();
                        sc.nextLine(); 

                        list.remove(indexRemove);
                        break;
                    case 11: 
                        System.out.println("Data pada Node Head:");
                        list.getFirst().tampil();
                        break;
                    case 12: 
                        System.out.println("Data pada Node Tail:");
                        list.getLast().tampil();
                        break;
                    case 13: 
                        System.out.print("Masukkan indeks node yang ingin ditampilkan: ");
                        int indexGet = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Data pada indeks " + indexGet + " adalah : ");
                        list.get(indexGet).tampil();
                        break;
                    case 14:
                        System.out.println("Jumlah data dalam Double Linked List adalah: " + list.getSize());
                        list.print();
                        break;
                    case 0:
                        System.out.println("Keluar dari program.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid!");
                }
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
            }
        } while (pilihan != 0);
        sc.close();
    }
}