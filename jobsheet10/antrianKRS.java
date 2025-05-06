package jobsheet10;
public class antrianKRS {
    mhs[] antrian;
    int front;
    int rear;
    int size;
    int max = 10;
    int jumlahDiproses = 0;
    int kapasitasDPA = 30;
    public antrianKRS() {
        this.antrian = new mhs[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean IsEmpty(){
        if(size == 0){
            return true;
        }else{
            return false;
        }
    }
    public boolean IsFull(){
        if(size == max){
            return true;
        }else{
            return false;
        }
    }
    public void kosongkanAntrian(){
        if(!IsEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Antrian KRS berhasil dikosongkan");
        }else{
            System.out.println("Antrian masih kosong");
        }
    }
    public void tambahAntrian(mhs mahasiswa) {
        if (IsFull()) {
            System.out.println("Antrian KRS penuh, mahasiswa tidak dapat ditambahkan.");
            return;
        }
        rear = (rear + 1) % max;
        antrian[rear] = mahasiswa;
        size++;
        System.out.println(mahasiswa.nama + " berhasil mendaftar antrian KRS.");
    }
    public mhs[] panggilAntrian() {
        if (IsEmpty()) {
            System.out.println("Antrian KRS kosong.");
            return null;
        }
        mhs[] yangDipanggil = new mhs[Math.min(2, size)];
        for (int i = 0; i < yangDipanggil.length; i++) {
            yangDipanggil[i] = antrian[front];
            front = (front + 1) % max;
            size--;
            jumlahDiproses++;
        }
        System.out.print("Memanggil mahasiswa antrian 1 dan 2: ");
        for (mhs m : yangDipanggil) {
            if (m != null) {
                System.out.print(m.nama + " ");
            }
        }
        System.out.println("untuk proses KRS.");
        return yangDipanggil;
    }
    public void tampilkanSemuaAntrian() {
        if (IsEmpty()) {
            System.out.println("Antrian KRS kosong.");
            return;
        }
        System.out.println("=== Daftar Antrian KRS ===");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            antrian[index].tampilkanData();
        }
        System.out.println("==========================");
    }
    public void tampilkanDuaTerdepan() {
        if (IsEmpty()) {
            System.out.println("Antrian KRS kosong.");
            return;
        }
        System.out.println("=== Dua Antrian Terdepan ===");
        int tampilkan = Math.min(2, size);
        for (int i = 0; i < tampilkan; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            antrian[index].tampilkanData();
        }
        System.out.println("===========================");
    }
    public void tampilkanAntrianTerakhir() {
        if (IsEmpty()) {
            System.out.println("Antrian KRS kosong.");
        } else {
            System.out.println("=== Antrian Paling Akhir ===");
            antrian[rear].tampilkanData();
            System.out.println("============================");
        }
    }
    public void cetakJumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian KRS: " + size);
    }
    public void cetakJumlahDiproses() {
        System.out.println("Jumlah mahasiswa yang sudah melakukan proses KRS: " + jumlahDiproses);
    }
    public int cetakJumlahBelumDiproses() {
        int belumDiproses = size;
        int sisaKapasitas = kapasitasDPA - jumlahDiproses;
        if (belumDiproses < sisaKapasitas) {
            return sisaKapasitas - belumDiproses;
        } else {
            return 0;
        }
    }
}