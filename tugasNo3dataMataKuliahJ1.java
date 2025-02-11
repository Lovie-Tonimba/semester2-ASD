import java.util.Scanner;

public class tugasNo3dataMataKuliahJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = sc.nextInt();

        String matkul[] = new String[n];
        int sks[] = new int[n];
        int semester[] = new int[n];
        String hari[] = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nData mata kuliah ke-" + (i+1));
            sc.nextLine();
            System.out.print("Nama mata kuliah  : ");
            matkul[i] = sc.nextLine();
            System.out.print("SKS               : ");
            sks[i] = sc.nextInt();
            System.out.print("Semester          : ");
            semester[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Hari              : ");
            hari[i] = sc.nextLine();
        }

        while (true) { 
            System.out.println("\n=== JADWAL KULIAH ===");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal kuliah berdasarkan hari tertentu");
            System.out.println("3. Tampilkan jadwal kuliah berdasarkan semester tertentu");
            System.out.println("4. Cari mata kuliah berdasarkan nama mata kuliah");
            System.out.print("Pilih salah satu (0 untuk exit program): ");
            int input = sc.nextInt();
            sc.nextLine();

            if (input == 1) {
                seluruhJadwal(n, matkul, sks, semester, hari);
            } else if (input == 2) {
                System.out.print("Masukkan hari jadwal kuliah yang ingin ditampilkan: ");
                String cariHari = sc.nextLine();
                jadwalByHari(n, matkul, sks, semester, hari, cariHari);
            } else if (input == 3) {
                System.out.print("Masukkan semester jadwal kuliah yang ingin ditampilkan: ");
                int cariSemester = sc.nextInt();
                jadwalBySemester(n, matkul, sks, semester, hari, cariSemester);
            } else if(input == 4) {
                System.out.print("Masukkan nama mata kuliah yang ingin dicari: ");
                String cariMatkul = sc.nextLine();
                cariMataKuliah(n, matkul, sks, semester, hari, cariMatkul);
            }else if (input == 0) {
                System.out.println("Terima kasih! Program selesai.");
                break;
            } else {
                System.out.println("Invalid input. Coba lagi.");
            }
        }
    }

    static void seluruhJadwal(int n, String[]matkul, int[]sks, int[]semester, String[]hari){
        System.out.println("\n=== SELURUH JADWAL KULIAH ===");
        for (int i = 0; i < n; i++) {
            System.out.println(matkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hari[i]);
        }
    }

    static void jadwalByHari(int n, String[]matkul, int[]sks, int[]semester, String[]hari, String cariHari){
        System.out.println("\n=== JADWAL KULIAH HARI " + cariHari.toUpperCase() + " ===");
        boolean penanda = true;
        for (int i = 0; i < n; i++) {
            if (hari[i].equalsIgnoreCase(cariHari)) {
                System.out.println(matkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i]);
                penanda = false;
            }
        }
        if (penanda) {
            System.out.println("Tidak ada jadwal kuliah pada hari " + cariHari);
        }
    }

    static void jadwalBySemester(int n, String[] matkul, int[] sks, int[] semester, String[] hari, int cariSemester) {
        System.out.println("\n=== JADWAL KULIAH SEMESTER " + cariSemester + " ===");
        boolean penanda = true;
        for (int i = 0; i < n; i++) {
            if (semester[i] == cariSemester) {
                System.out.println(matkul[i] + " | SKS: " + sks[i] + " | Hari: " + hari[i]);
                penanda = false;
            }
        }
        if (penanda) {
            System.out.println("Tidak ada jadwal kuliah untuk semester " + cariSemester);
        }
    }

    static void cariMataKuliah(int n, String[] matkul, int[] sks, int[] semester, String[] hari, String cariMatkul) {
        System.out.println("\n=== HASIL PENCARIAN MATA KULIAH: " + cariMatkul + " ===");
        boolean ditemukan = true;
        for (int i = 0; i < n; i++) {
            if (matkul[i].equalsIgnoreCase(cariMatkul)) {
                System.out.println("Nama: " + matkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hari[i]);
                ditemukan = false;
            }
        }
        if (ditemukan) {
            System.out.println("Mata kuliah '" + cariMatkul + "' tidak ditemukan.");
        }
    }
}