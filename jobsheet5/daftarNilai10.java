package jobsheet5;
public class daftarNilai10 {
    String nama;
    String nim;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;
    public daftarNilai10(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilaiUAS){
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
    static int utsTertinggi(daftarNilai10[] arr, int l, int r){
        if(l == r){
            return arr[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int leftMax = utsTertinggi(arr, l, mid);
        int rightMax = utsTertinggi(arr, mid + 1, r);

        return Math.max(leftMax, rightMax);
    }
    static int utsTerendah(daftarNilai10[] arr, int l, int r){
        if(l == r){
            return arr[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int leftMin = utsTerendah(arr, l, mid);
        int rightMin = utsTerendah(arr, mid + 1, r);

        return Math.min(leftMin, rightMin);
    }
    double avarageUAS(daftarNilai10[]mhs){
        double total = 0;
        for (int i = 0; i < mhs.length; i++) {
            total = total + mhs[i].nilaiUAS;
        }
        return total / mhs.length;
    }
}