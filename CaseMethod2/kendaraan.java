package CaseMethod2;
public class kendaraan {
    String platNomor;
    String tipe;
    String merk;

    public kendaraan() {
    }

    public kendaraan(String plat, String tipe, String merk) {
        this.platNomor = plat;
        this.tipe = tipe;
        this.merk = merk;
    }
    public void tampilkanInformasi(){
        System.out.println("Plat Nomor  : " + platNomor);
        System.out.println("Tipe        : " + tipe);
        System.out.println("Merk        : " + merk);
    }
}