
import java.util.Scanner;

public class menghitungIPSemesterJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=====================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=====================");

        String matkul[] = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
        double nilai[] = new double[matkul.length];
        String nilaiHuruf[] = new String[matkul.length];
        double nilaiSetara[] = new double[matkul.length];

        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + matkul[i] + ": ");
            nilai[i] = sc.nextDouble();
        }

        System.out.println("=====================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=====================");

        double totalNilaiSetara = 0;

        for (int i = 0; i < matkul.length; i++) {
            if (nilai[i] > 80 && nilai[i] <= 100){
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4;
            }else if (nilai[i] > 73 && nilai[i] <= 80){
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            }else if(nilai[i] > 65 && nilai[i] <= 73){
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3;
            }else if(nilai[i] > 60 && nilai[i] <= 65){
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            }else if(nilai[i] > 50 && nilai[i] <= 60){
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2;
            }else if(nilai[i] > 39 && nilai[i] <= 50){
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1;
            }else if(nilai[i] <= 39){
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0;
            }

            totalNilaiSetara += nilaiSetara[i];
        }

        System.out.println("MK                                   Nilai Angka   Nilai Huruf   Bobot Nilai");        
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("%-40s %-12.2f %-12s %.2f\n", matkul[i], nilai[i], nilaiHuruf[i], nilaiSetara[i]);
        }
        System.out.println("============================================================================");
        
        double ipk = totalNilaiSetara / matkul.length;
        System.out.println("IP : " + ipk);
    }
}
