
import java.util.Scanner;

public class tugasNo2kubusJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) { 
            System.out.println("========RUMUS KUBUS========");
            System.out.println("1. Volume Kubus");
            System.out.println("2. Luas Permukaan Kubus");
            System.out.println("3. Keliling Kubus");
            System.out.print("Silahkan pilih salah satu menu yang tersedia (0 untuk exit program): ");
            int input = sc.nextInt();

            if(input == 1){
                System.out.println("=======================");
                volume();
            }else if(input == 2){
                System.out.println("=======================");
                luasPermukaan();
            }else if(input == 3){
                System.out.println("=======================");
                keliling();
            }else if(input == 0){
                System.out.println("Program stop.");
                break;
            }else{
                System.out.println("Invalid input. Coba lagi");
            }
        }
    }
    static void volume(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Rumus Menghitung Volume Kubus");
        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi = sc.nextInt();

        int vol = sisi * sisi * sisi;
        System.out.println("Volume Kubus: " + vol);
    }
    static void luasPermukaan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Rumus Menghitung Luas Permukaan Kubus");
        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi = sc.nextInt();

        int luasP = 6 * sisi * sisi;
        System.out.println("Luas Permukaan Kubus: " + luasP);
    }
    static void keliling(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Rumus Menghitung Keliling Kubus");
        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi = sc.nextInt();

        int kel = 12 * sisi;
        System.out.println("Keliling Kubus: " + kel);
    }
}