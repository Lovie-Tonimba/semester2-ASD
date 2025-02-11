import java.util.Scanner;
public class royalGardenJ1 {
    public static void main(String[] args) {
        pendapatan();
        jumlahStockCabang4();
    }

    static String toko[] = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
    static String bunga[] = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    static int array[][] = new int[toko.length][bunga.length];
    static double harga[] = {75000, 50000, 60000, 10000};

    static void pendapatan(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < toko.length; i++) {
            System.out.println(toko[i]);
            double totalPendapatan = 0;
            for (int j = 0; j < bunga.length; j++) {
                System.out.print(" " + bunga[j] + " : ");
                array[i][j] = sc.nextInt();
                double hasilPenjualan = array[i][j] * harga[j];
                System.out.println("  Total hasil penjualan " + bunga[j] + " : " + hasilPenjualan);
                
                totalPendapatan += array[i][j] * harga[j];
            }
            System.out.println("Total pendapatan " + toko[i] + " : " + totalPendapatan);
            System.out.println("======================");
        }
    }

    static void jumlahStockCabang4(){
        Scanner sc = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("Jumlah stock setiap jenis bunga pada cabang " + toko[3]);
        int [] stockCB4 = new int[bunga.length];
        while (true) { 
            System.out.println("Apakah ada bunga yang mati? (y/n): ");
            String jawab = sc.nextLine();
            if(jawab.equalsIgnoreCase("y")){
                stockCB4[0] = array[3][0] - 1;
                stockCB4[1] = array[3][1] - 2;
                stockCB4[2] = array[3][2] - 0;
                stockCB4[3] = array[3][3] - 5;
                for (int j = 0; j < bunga.length; j++) {
                    System.out.println(bunga[j] + " : " + stockCB4[j]);
                }
                break;
            }else if(jawab.equalsIgnoreCase("n")){
                for (int j = 0; j < bunga.length; j++) {
                    System.out.println(bunga[j] + " : " + array[3][j]);
                }
                break;
            }else{
                System.out.println("Pilih antara y/n. Coba lagi");
            }
        }
    }
}