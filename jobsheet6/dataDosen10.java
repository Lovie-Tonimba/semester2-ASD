package jobsheet6;
public class dataDosen10 {
    dosen10[] dosen = new dosen10[10];
    int idx;
    void tambah(dosen10 dsn){
        if(idx < dosen.length){
            dosen[idx] = dsn;
            idx++;
        }else{
            System.out.println("data sudah penuh");
        }
    }
    void tampil(){
        for (dosen10 dsn : dosen) {
            dsn.tampilInformasi();
            System.out.println("--------------------------------------");
        }
    }
    //MENGURUTKAN USIA DOSEN TERMUDA KE TERTUA DENGAN BUBBLE SORT
    void sortingASC(){
        for (int i = 0; i < dosen.length - 1; i++) {
            for (int j = 0; j < dosen.length - 1 - i; j++) {
                if(dosen[j].usia > dosen[j+1].usia){
                    dosen10 tmp = dosen[j];
                    dosen[j] = dosen[j+1];
                    dosen[j+1] = tmp;
                }
            }
        }
    }
    //MENGURUTKAN USIA DOSEN TERTUA KE TERMUDA DENGAN SELECTION SORT
    void sortingDSC(){
        for (int i = 0; i < dosen.length - 1; i++) {
            int maxIdx = i;
            for (int j = i+1; j < dosen.length; j++) {
                if(dosen[j].usia > dosen[maxIdx].usia){
                    maxIdx = j;
                }
            }
            dosen10 tmp = dosen[maxIdx];
            dosen[maxIdx] = dosen[i];
            dosen[i] = tmp;
        }
    }
    //SORTING DSC MENGURUTKAN BERDASARKAN USIA DOSEN TERTUA KE TERMUDA
    void insertionSort(){
        for (int i = 0; i < dosen.length; i++) {
            dosen10 temp = dosen[i];
            int j = i;
            while (j > 0 && dosen[j-1].usia < temp.usia) { 
                dosen[j] = dosen[j-1];
                j--;
            }
            dosen[j] = temp;
        }
    }
}