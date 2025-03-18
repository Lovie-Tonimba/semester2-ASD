package jobsheet6;
public class mahasiswaBerprestasi10 {
    mahasiswa10[] listMhs = new mahasiswa10[5];
    int idx;
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
            m.tampilInformasi();
            System.out.println("--------------------------------------");
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
}