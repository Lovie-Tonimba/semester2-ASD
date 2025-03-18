package jobsheet6;
public class mahasiswaBerprestasi10 {
    // mahasiswa10[] listMhs = new mahasiswa10[5];
    //modif
    mahasiswa10[] listMhs;
    int idx;
    mahasiswaBerprestasi10(int jumlah){
        listMhs = new mahasiswa10[jumlah];
        idx = 0;
    }
    void tambah(mahasiswa10 m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("data sudah penuh");
        }
    }
    void tampil(){
        for (mahasiswa10 m : listMhs) {
            //modif 
            if (m != null) {
                m.tampilInformasi();
                System.out.println("--------------------------------------");
            }
        }
    }
    void bubbleSort(){
        for (int i = 0; i < listMhs.length; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if(listMhs[j].ipk >listMhs[j-1].ipk){
                    mahasiswa10 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }
    void selectionSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < listMhs.length; j++) {
                if(listMhs[j].ipk < listMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            mahasiswa10 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
    void insertionSort(){
        for (int i = 1; i < listMhs.length; i++) {
            mahasiswa10 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j-1].ipk > temp.ipk) { 
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}