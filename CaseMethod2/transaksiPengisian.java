package CaseMethod2;

public class transaksiPengisian {
    kendaraan Kendaraan = new kendaraan();
    BBM bbm = new BBM();
    double liter;
    double totalBayar;

    public transaksiPengisian() {
    }

    public transaksiPengisian(double liter, double totalBayar) {
        this.liter = liter;
        this.totalBayar = totalBayar;
    }
}