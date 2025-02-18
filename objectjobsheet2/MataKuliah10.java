package objectjobsheet2;
public class MataKuliah10 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;
    public MataKuliah10(){
    }
    public MataKuliah10(String kodeMK, String nm, int sks, int jmlJam) {
        this.kodeMK = kodeMK;
        this.nama = nm;
        this.sks = sks;
        this.jumlahJam = jmlJam;
    }
    void tampilInformasi(){
        System.out.println("Kode Mata Kuliah    : " + kodeMK);
        System.out.println("Nama Mata Kuliah    : " + nama);
        System.out.println("SKS                 : " + sks);
        System.out.println("Jumlah Jam Pertemuan: " + jumlahJam);
    }
    void ubahSKS(int sksBaru){
        sks = sksBaru;
        System.out.println("SKS telah diubah    : " + sks);
    }
    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam pertemuan setelah ditambah: " + jumlahJam);
    }
    void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            this.jumlahJam -= jam;
            System.out.println("Jumlah jam pertemuan setelah dikurangi: " + jumlahJam);
        } else {
            System.out.println("Pengurangan jam tidak dapat dilakukan. Jumlah jam tidak mencukupi.");
        }
    }
}