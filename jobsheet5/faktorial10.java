package jobsheet5;

public class faktorial10 {
    int faktorialBF(int n){
        int faktor = 1;
        for (int i = 1; i <= n; i++) {
            faktor = faktor * i;
        }
        return faktor;
    }
    int faktorialDC(int n){
        if(n == 1){
            return 1;
        }else{
            int faktor = n * faktorialDC(n - 1);
            return faktor;
        }
    }
}