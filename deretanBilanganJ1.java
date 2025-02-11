
import java.util.Scanner;

public class deretanBilanganJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();
        System.out.println("======================");

        String duaDigit = nim.substring(8);
        int n = Integer.parseInt(duaDigit);

        if(n < 10){
            n+=10;
        }
        System.out.println("n : " + n);

        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0){
                if(i == 6 || i == 10){
                    continue;
                }
                System.out.print(i + " ");
            }else{
                System.out.print("* ");
            }
        }
    }
}
