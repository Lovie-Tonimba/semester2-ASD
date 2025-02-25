package arrayOfObjectsJobsheet3;
public class DataDosen10 {
    void dataSemuaDosen(Dosen10[] arrayOfDosen) {
        System.out.println("\nDATA SEMUA DOSEN");
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Kode            : " + arrayOfDosen[i].kode);
            System.out.println("Nama            : " + arrayOfDosen[i].nama);
            System.out.println("Jenis Kelamin   : " + (arrayOfDosen[i].jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia            : " + arrayOfDosen[i].usia);
            System.out.println("------------------------------------------------");
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen10[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("\nJUMLAH DOSEN PER JENIS KELAMIN");
        System.out.println("Pria   : " + pria);
        System.out.println("Wanita : " + wanita);
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen10[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int sumPria = 0, sumWanita = 0;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin) {
                totalUsiaPria += arrayOfDosen[i].usia;
                sumPria++;
            } else {
                totalUsiaWanita += arrayOfDosen[i].usia;
                sumWanita++;
            }
        }
        double rataPria = (sumPria > 0) ? (double) totalUsiaPria / sumPria : 0;
        double rataWanita = (sumWanita > 0) ? (double) totalUsiaWanita / sumWanita : 0;
        System.out.println("\nRATA-RATA USIA PER JENIS KELAMIN");
        System.out.printf("Pria   : %.2f tahun\n", rataPria);
        System.out.printf("Wanita : %.2f tahun\n", rataWanita);
    }

    void infoDosenPalingTua(Dosen10[] arrayOfDosen) {
        Dosen10 palingTua = arrayOfDosen[0];
        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > palingTua.usia) {
                palingTua = arrayOfDosen[i];
            }
        }
        System.out.println("\nDOSEN PALING TUA");
        System.out.println("Kode            : " + palingTua.kode);
        System.out.println("Nama            : " + palingTua.nama);
        System.out.println("Jenis Kelamin   : " + (palingTua.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia            : " + palingTua.usia);
    }

    void infoDosenPalingMuda(Dosen10[] arrayOfDosen) {
        Dosen10 palingMuda = arrayOfDosen[0];
        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < palingMuda.usia) {
                palingMuda = arrayOfDosen[i];
            }
        }
        System.out.println("\nDOSEN PALING MUDA");
        System.out.println("Kode            : " + palingMuda.kode);
        System.out.println("Nama            : " + palingMuda.nama);
        System.out.println("Jenis Kelamin   : " + (palingMuda.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia            : " + palingMuda.usia);
    }
}