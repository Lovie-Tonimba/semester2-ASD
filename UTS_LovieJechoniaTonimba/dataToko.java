package UTS_LovieJechoniaTonimba;
public class dataToko {
    //10_Lovie Jechonia Tonimba
    //SIB1G
    String kode;
    String namaBarang;
    int stok;
    double hargaSatuan;
    int jumlahTerjual;

    dataToko(){
    }
    dataToko(String kode, String namaBarang, int stok, double hargaSatuan){
        this.kode = kode;
        this.namaBarang = namaBarang;
        this.stok = stok;
        this.hargaSatuan = hargaSatuan;
        this.jumlahTerjual = 0;
    }

    dataToko[] daftarBarang = new dataToko[3];
    int idx = 0;

    void tampilDataBarang(){
        System.out.println("Kode            : " + kode);
        System.out.println("Nama Barang     : " + namaBarang);
        System.out.println("Stok            : " + stok);
        System.out.println("Harga Satuan    : " + hargaSatuan);
    }
    double hitungTotalHarga(int jumlahBeli){
        return jumlahBeli * hargaSatuan;
    }
    void tambahJumlahTerjual(int jumlah){
        this.jumlahTerjual = this.jumlahTerjual + jumlah;
    }
    int jumlahYangTerjual(){
        return this.jumlahTerjual;
    }

    void tambah(dataToko barang){
        if(idx < daftarBarang.length){
            daftarBarang[idx] = barang;
            idx++;
        }else{
            System.out.println("Data barang sudah penuh");
        }
    }
    void tampil() {
        System.out.println("Data Barang:");
        System.out.printf("%-6s %-15s %-6s %-13s\n", "Kode", "Nama Barang", "Stok", "Harga Satuan");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < idx; i++) {
            System.out.printf("%-6s %-15s %-6d %-13.2f\n",
                    daftarBarang[i].kode,
                    daftarBarang[i].namaBarang,
                    daftarBarang[i].stok,
                    daftarBarang[i].hargaSatuan);
        }
        System.out.println("-------------------------------------------------");
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (daftarBarang[j].stok < daftarBarang[j + 1].stok) {
                    dataToko temp = daftarBarang[j];
                    daftarBarang[j] = daftarBarang[j + 1];
                    daftarBarang[j + 1] = temp;
                }
            }
        }
    }

    dataToko getBarangTerlaris() {
        int maxIdx = 0;
        for (int i = 1; i < idx; i++) {
            if (daftarBarang[i].jumlahYangTerjual() > daftarBarang[maxIdx].jumlahYangTerjual()) {
                maxIdx = i;
            }
        }
        return daftarBarang[maxIdx];
    }
}