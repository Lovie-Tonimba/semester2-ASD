
import java.util.Scanner;

public class studentFinalScoreJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");

        System.out.print("Masukkan Nilai Tugas  : ");
        double nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis   : ");
        double nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS    : ");
        double nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS    : ");
        double nilaiUAS = sc.nextDouble();
        
        System.out.println("======================");
        System.out.println("======================");
        
        double N = 0;

        if(nilaiTugas >= 0 && nilaiTugas <= 100){
            if(nilaiKuis >= 0 && nilaiKuis <= 100){
                if(nilaiUTS >= 0 && nilaiUTS <= 100){
                    if(nilaiUAS >= 0 && nilaiUAS <= 100){
                        double hitungNTugas = nilaiTugas * 0.2;
                        double hitungNKuis = nilaiKuis * 0.2;
                        double hitungNUTS = nilaiUTS * 0.3;
                        double hitungNUAS = nilaiUAS * 0.3;
                        
                        N = hitungNTugas + hitungNKuis + hitungNUTS + hitungNUAS;
                        if(N > 80 && N <= 100){
                            System.out.println("Nilai Akhir     : " + N);
                            System.out.println("Nilai Huruf     :  A");
                        }else if(N > 73 && N <= 80){
                            System.out.println("Nilai Akhir     : " + N);
                            System.out.println("Nilai Huruf     :  B+");
                        }else if(N > 65 && N <= 73){
                            System.out.println("Nilai Akhir     : " + N);
                            System.out.println("Nilai Huruf     :  B");
                        }else if(N > 60 && N <= 65){
                            System.out.println("Nilai Akhir     : " + N);
                            System.out.println("Nilai Huruf     :  C+");
                        }else if(N > 50 && N <= 60){
                            System.out.println("Nilai Akhir     : " + N);
                            System.out.println("Nilai Huruf     :  C");
                        }else if(N > 39 && N <= 50){
                            System.out.println("Nilai Akhir     : " + N);
                            System.out.println("Nilai Huruf     :  D");
                        }else{
                            System.out.println("Nilai Akhir     : " + N);
                            System.out.println("Nilai Huruf     :  E");
                        }

                        System.out.println("======================");
                        System.out.println("======================");
            
                        if(N > 50 && N <= 100){
                            System.out.println("SELAMAT ANDA LULUS");
                        }else{
                            System.out.println("TIDAK LULUS");
                        }
                
                    }else{
                        System.out.println("Nilai tidak valid");
                        System.out.println("======================");
                        System.out.println("======================");            
                    }
                }else{
                    System.out.println("Nilai tidak valid");
                    System.out.println("======================");
                    System.out.println("======================");        
                }
            }else{
                System.out.println("Nilai tidak valid");
                System.out.println("======================");
                System.out.println("======================");    
            }
        }else{
            System.out.println("Nilai tidak valid");
            System.out.println("======================");
            System.out.println("======================");
        }
    }
}