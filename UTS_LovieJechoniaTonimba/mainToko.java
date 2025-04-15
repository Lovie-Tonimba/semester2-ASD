package UTS_LovieJechoniaTonimba;

import java.util.Scanner;

public class mainToko {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dataToko list = new dataToko();

        while (true) {
            System.out.println("\n============== MENU DATA TOKO ==============");
            System.out.println("1. Input Barang");
            System.out.println("2. Penjualan Barang");
            System.out.println("3. Cek Stok Barang Terbanyak");
            System.out.println("4. Cek Stok Barang Terlaris");
            System.out.println("5. Tampil Barang");
            System.out.println("6. Keluar");
            System.out.print("Masukkan angka menu yang ingin dipilih: ");
            int input = sc.nextInt();
            sc.nextLine();

            if (input == 1) {
                System.out.println("INPUT DATA BARANG");
                for (int i = 0; i < 3; i++) {
                    System.out.println("Masukkan data barang ke-" + (i + 1));
                    System.out.print("Kode  = ");
                    String kode = sc.nextLine();
                    System.out.print("Nama  = ");
                    String nama = sc.nextLine();
                    System.out.print("Stok  = ");
                    int stok = sc.nextInt();
                    System.out.print("Harga = ");
                    double harga = sc.nextDouble();
                    sc.nextLine();

                    list.tambah(new dataToko(kode, nama, stok, harga));
                }

            } else if (input == 2) {
                System.out.println("PENJUALAN BARANG");
                System.out.print("Berapa jenis barang yang ingin dibeli? ");
                int jumlahJenis = sc.nextInt();
                sc.nextLine();

                double totalBayar = 0;
                System.out.println("Struk Penjualan:");
                System.out.printf("%-6s %-15s %-13s %-15s %-13s\n", 
                    "Kode", "Nama Barang", "Jumlah Beli", "Harga Satuan", "Total Harga");
                System.out.println("----------------------------------------------------------------------");

                for (int j = 0; j < jumlahJenis; j++) {
                    System.out.print("Masukkan kode barang ke-" + (j + 1) + ": ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan jumlah beli: ");
                    int jumlahBeli = sc.nextInt();
                    sc.nextLine();

                    boolean found = false;
                    for (int i = 0; i < list.idx; i++) {
                        if (list.daftarBarang[i].kode.equalsIgnoreCase(kode)) {
                            if (list.daftarBarang[i].stok >= jumlahBeli) {
                                double totalHarga = list.daftarBarang[i].hitungTotalHarga(jumlahBeli);
                                list.daftarBarang[i].stok -= jumlahBeli;
                                list.daftarBarang[i].tambahJumlahTerjual(jumlahBeli);

                                System.out.printf("%-6s %-15s %-13d %-15.2f %-13.2f\n",
                                        list.daftarBarang[i].kode,
                                        list.daftarBarang[i].namaBarang,
                                        jumlahBeli,
                                        list.daftarBarang[i].hargaSatuan,
                                        totalHarga);

                                totalBayar += totalHarga;
                            } else {
                                System.out.println("Stok tidak cukup untuk barang " + kode);
                            }
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Barang dengan kode " + kode + " tidak ditemukan.");
                    }
                }
                System.out.println("----------------------------------------------------------------------");
                System.out.printf("Total Bayar: %.2f\n", totalBayar);

            } else if (input == 3) {
                System.out.println("CEK STOK BARANG TERBANYAK");
                list.sortingDSC(); 
                System.out.println("Daftar Barang Berdasarkan Stok:");
                if (list.idx > 0) {
                   list.tampil();
                } else {
                   System.out.println("Tidak ada barang.");
                }
            } else if (input == 4) {
                System.out.println("CEK BARANG TERLARIS");
                dataToko terlaris = list.getBarangTerlaris();
                System.out.println("Barang Terlaris:");
                terlaris.tampilDataBarang();
                System.out.println("Jumlah Terjual  : " + terlaris.jumlahYangTerjual());

            } else if (input == 5) {
                System.out.println("DAFTAR SELURUH BARANG:");
                list.tampil();

            } else if (input == 6) {
                System.out.println("Terimakasih.");
                break;

            } else {
                System.out.println("Invalid input, try again.");
            }
        }
        sc.close();
    }
}