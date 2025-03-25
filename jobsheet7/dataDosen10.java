package jobsheet7;
public class dataDosen10 {
    dosen10[] dosen = new dosen10[4];
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
            //JOBSHEET 7 LATIHAN
            if(dsn != null){
                dsn.tampilInformasi();
                System.out.println("--------------------------------------");
            }
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

    //JOBSHEET7 SEARCHING
    void pencarianDataSequential10(String nama){
        int posisi = -1;
        for (int j = 0; j < dosen.length; j++) {
            if(dosen[j].nama.equalsIgnoreCase(nama) && dosen[j] != null){
                posisi = j;
                break;
            }
        }
        if(posisi != -1){
            System.out.println("Data dosen dengan nama :" + nama + " ditemukan pada indeks " + posisi);
            dosen[posisi].tampilInformasi(); //untuk menampilkan informasi lengkap dosen yang ditemukan
        }else{
            System.out.println("Dosen dengan nama " + nama + " tidak ditemukan");
        }
    }
    void pencarianDataBinary10(int usia){
        sortingASC();
        int mid;
        int left = 0;
        int right = dosen.length - 1;
        int [] arr = new int[dosen.length];
        int hitung = 0;
        while(left <= right){
            mid = (left + right) / 2;
            if(usia == dosen[mid].usia && dosen[mid] != null){
                arr[hitung++] = mid;
                //loop mencari semua dosen dengan usia yang sama dengan yang dicari disebelah kiri mid
                int temp = mid - 1;
                while (temp >= left && dosen[temp] != null && dosen[temp].usia == usia) { 
                    arr[hitung++] = temp;
                    temp--;
                }
                //loop mencari semua dosen dengan usia yang sama dengan yang dicari disebelah kanan mid
                temp = mid + 1;
                while (temp <= right && dosen[temp] != null && dosen[temp].usia == usia) { 
                    arr[hitung++] = temp;
                    temp--;
                }
                break;
            }else if(dosen[mid].usia < usia && dosen[mid] != null){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        if(hitung > 0){
            if (hitung == 1) {
                System.out.println("Dosen dengan usia " + usia + " ditemukan pada index " + arr[0]);
                dosen[arr[0]].tampilInformasi();
            } else {
                System.out.println("Peringatan! Terdapat " + hitung + " dosen dengan usia " + usia + " yaitu : ");
                for (int i = 0; i < hitung; i++) {
                    System.out.println("Index: " + arr[i]);
                    dosen[arr[i]].tampilInformasi(); 
                }
            }
        }else{
            System.out.println("Dosen dengan usia " + usia + " tidak ditemukan");
        }
    }
}