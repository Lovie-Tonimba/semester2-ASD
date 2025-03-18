public class sortingTeori {
    public static void main(String[] args) {
        int [] data = {23, 35, 7, 14, 67};
        int size = data.length;

        System.out.println("BUBBLE SORT");
        bubbleSort(data, size);
        printArray(data);
        System.out.println("SELECTION SORT");
        System.out.println("INTERSECTION SORT");
    }
    static void bubbleSort(int[] arr, int size) {
        boolean swap;
        for (int i = 0; i < size - 1; i++) {
            swap = false; // Untuk mengecek apakah terjadi pertukaran
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] < arr[j + 1]) { // Tukar jika lebih kecil
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break; 
            }
        } 
    }
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
    //     //System.out.println("BUBBLE SHORT");
    //     for (int i = 0; i < size - 1; i++) {
    //         for (int j = 0; j < size - i - 1; j++) {
    //             if (data[j] < data[j + 1]) { // Tukar jika lebih kecil
    //                 int temp = data[j];
    //                 data[j] = data[j + 1];
    //                 data[j + 1] = temp;
    //             }
    //         }
    //     }
    //     System.out.println("BUBBLE SHORT");
    //     for (int num : data) {
    //         System.out.print(num + " ");
    //     }

    //     //System.out.println("SELECTION SHORT");
    //     for (int i = 0; i < size - 1; i++) {
    //         int maxIndex = i;
    //         for (int j = i + 1; j < size; j++) {
    //             if (data[j] > data[maxIndex]) {
    //                 maxIndex = j;
    //             }
    //         }
    //         int temp = data[i];
    //         data[i] = data[maxIndex];
    //         data[maxIndex] = temp;
    //     }
    //     System.out.println("\nSELECTION SHORT");
    //     for (int num : data) {
    //         System.out.print(num + " ");
    //     }

    //     //System.out.println("INSERTION SHORT");
    //     for (int i = 1; i < size; i++) {
    //         int key = data[i];
    //         int j = i - 1;

    //         while (j >= 0 && data[j] < key) { // Geser jika lebih kecil
    //             data[j + 1] = data[j];
    //             j--;
    //         }
    //         data[j + 1] = key;
    //     }
    //     System.out.println("\nINSERTION SHORT");
    //     for (int num : data) {
    //         System.out.print(num + " ");
    //     }