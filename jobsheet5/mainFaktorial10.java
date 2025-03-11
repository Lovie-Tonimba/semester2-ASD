package jobsheet5;

import java.util.Scanner;

public class mainFaktorial10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        faktorial10 fk = new faktorial10();
        System.out.println("Nilai faktorial " + nilai + 
        " menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai +
        " menggunakan DC: " + fk.faktorialDC(nilai));
    }
}