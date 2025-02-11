
import java.util.Scanner;

public class tugasNo1platNomorJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char KODE[] = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char KOTA[][] = {
            {'B', 'A', 'N', 'T', 'E', 'N', ' ', ' ', ' ', ' ', ' ', ' '},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A', ' ', ' ', ' ', ' ', ' '},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G', ' ', ' ', ' ', ' ', ' '},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N', ' ', ' ', ' ', ' ', ' '},
            {'B', 'O', 'G', 'O', 'R', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N', ' ', ' '},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G', ' ', ' ', ' ', ' '},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A', ' ', ' ', ' ', ' '},
            {'M', 'A', 'L', 'A', 'N', 'G', ' ', ' ', ' ', ' ', ' ', ' '},
            {'T', 'E', 'G', 'A', 'L', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
        };

        System.out.print("Input kode plat nomor: ");
        char userInput = sc.next().charAt(0);

        boolean penanda = true;
        for (int i = 0; i < KODE.length; i++) {
            if(KODE[i] == userInput){
                System.out.print("Kota dengan plat nomor " + userInput + " merupakan Kota ");
                for (int j = 0; j < KOTA[i].length; j++) {
                    if(KOTA[i][j] != ' '){
                        System.out.print(KOTA[i][j]);
                    }
                }
                penanda = false;
                break;
            }
        }
        if(penanda){
            System.out.println("Kode plat nomor tersebut tidak di temukan");
        }
    }
}