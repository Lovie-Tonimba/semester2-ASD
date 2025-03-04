package kuis1;
public class perpustakaan10 {
    buku10[] arrayBuku;
    mahasiswa10[] arrayMahasiswa;
    int jmlBuku;
    int jmlMahasiswa;

    public perpustakaan10(){
        this.arrayBuku = new buku10[5];
        this.arrayMahasiswa = new mahasiswa10[2];
        this.jmlBuku = 0;
        this.jmlMahasiswa = 0;
    }

    void tambahBuku(String kd, String jdl, String penulis){        
        if(jmlBuku < arrayBuku.length){
            arrayBuku[jmlBuku] = new buku10(kd, jdl, penulis);
            jmlBuku++;
            System.out.println("Buku berhasil ditambahkan!\n");
        }else{
            System.out.println("Daftar koleksi buku dalam perpustakaan ini sudah penuh\n");
        }
    }
    void tambahMahasiswa(String nim, String nama){
        if(jmlMahasiswa < arrayMahasiswa.length){
            arrayMahasiswa[jmlMahasiswa] = new mahasiswa10(nim, nama);
            jmlMahasiswa++;
            System.out.println("Mahasiswa berhasil ditambahkan!\n");
        }else{
            System.out.println("Kapasistas Mahasiswa dalam perpustakaan ini sudah penuh\n");
        }
    }
    void pinjamBuku(String nim, String kd){
        mahasiswa10 mahasiswa = null;
        buku10 buku = null;

        for (int i = 0; i < jmlMahasiswa; i++) {
            if(arrayMahasiswa[i].nim.equalsIgnoreCase(nim)){
                mahasiswa = arrayMahasiswa[i];
                break;
            }
        }
        for (int i = 0; i < jmlBuku; i++) {
            if(arrayBuku[i].kodeBuku.equalsIgnoreCase(kd)){
                buku = arrayBuku[i];
                break;
            }
        }
        if(mahasiswa != null && buku != null){
            if(mahasiswa.jumlahBuku < 2 && !buku.statusPeminjaman){
                mahasiswa.pinjamBuku[mahasiswa.jumlahBuku] = buku;
                mahasiswa.jumlahBuku++;
                buku.statusPeminjaman = true;
                System.out.println(mahasiswa.nama + " berhasil meminjam " + buku.judulBuku + "\n");
            }else{
                System.out.println("Gagal meminjam buku: " + buku.judulBuku + " karena sudah dipinjam orang lain." + "\n");
            }
        }else{
            System.out.println("Buku tidak terdaftar dalam perpustakaan ini\n");
        }
    }
    void kembalikanBuku(String nim, String kd){
        mahasiswa10 mahasiswa = null;
        buku10 buku = null;

        for (int i = 0; i < jmlMahasiswa; i++) {
            if(arrayMahasiswa[i].nim.equalsIgnoreCase(nim)){
                mahasiswa = arrayMahasiswa[i];
                break;
            }
        }
        for (int i = 0; i < jmlBuku; i++) {
            if(arrayBuku[i].kodeBuku.equalsIgnoreCase(kd)){
                buku = arrayBuku[i];
                break;
            }
        }
        if(mahasiswa != null && buku != null){
            for(int i = 0; i < mahasiswa.jumlahBuku; i++){
                if(mahasiswa.pinjamBuku[i] == buku){
                    for (int j = i; j < mahasiswa.jumlahBuku - 1; j++) {
                        mahasiswa.pinjamBuku[j] = mahasiswa.pinjamBuku[j+1];
                    }
                    mahasiswa.pinjamBuku[mahasiswa.jumlahBuku - 1] = null;
                    mahasiswa.jumlahBuku--;
                    buku.statusPeminjaman = false;
                    System.out.println(mahasiswa.nama + " berhasil mengembalikan " + buku.judulBuku + "\n");
                }
            }
        }else{
            System.out.println("Tidak ada buku dengan kode tersebut yang dipinjam\n");
        }
    }
    void tampilkanPeminjaman(){
        boolean peminjaman = false;
        for (int i = 0; i < jmlMahasiswa; i++) {
            mahasiswa10 mhs = arrayMahasiswa[i];
            if(mhs.jumlahBuku > 0){
                peminjaman = true;
                System.out.print(mhs.nama + " meminjam : ");
                System.out.println();
                for (int j = 0; j < mhs.jumlahBuku; j++) {
                    System.out.print(mhs.pinjamBuku[j].judulBuku + ", ");
                }
                System.out.println();
            }
        }
        if(!peminjaman){
            System.out.println("Belum ada buku perpustakaan yang sedang dipinjam\n");
        }
    }
}