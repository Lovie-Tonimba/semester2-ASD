package objectjobsheet2;
public class mahasiswaMain10J2 {
    public static void main(String[] args) {
        mahasiswa10J2 mhs1 = new mahasiswa10J2();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateipk(3.60);
        mhs1.tampilkanInformasi();

        mahasiswa10J2 mhs2 = new mahasiswa10J2("Annisa Naabila", "2141720171", 3.25, "TI 2L");
        mhs2.updateipk(3.30);
        mhs2.tampilkanInformasi();

    }
}