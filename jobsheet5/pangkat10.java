package jobsheet5;
public class pangkat10 {
    public int nilai, pangkat;

    public pangkat10(int n, int p) {
        nilai = n;
        pangkat = p;
    }
    // int pangkatBF(int a, int n){
    //     int hasil = 1;
    //     for (int i = 0; i < n; i++) {
    //         hasil = hasil*a;
    //     }
    //     return hasil;
    // }
    int pangkatBF(){
        int hasil = 1;
        for (int i = 0; i < this.pangkat; i++) {
            hasil = hasil * this.nilai;
        }
        return hasil;
    }
    int pangkatDC(int a, int n){
        if(n == 1){
            return a;
        }else{
            if(n % 2 == 1){
                return (pangkatDC(a, n/2)*pangkatDC(a, n/2)*a);
            }else{
                return (pangkatDC(a, n/2)*pangkatDC(a, n/2));
            }
        }
    }
}