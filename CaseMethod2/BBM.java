package CaseMethod2;
public class BBM {
    String namaBBM;
    double hargaPerLiter;
    double jumlahltr;
    double totalBayar;
    kendaraan data;
    BBM next;
    BBM prev;

    public BBM(BBM prev, kendaraan data, BBM next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    // public BBM(String namaBBM, double hargaPerLiter) {
    //     this.namaBBM = namaBBM;
    //     this.hargaPerLiter = hargaPerLiter;
    // }
}