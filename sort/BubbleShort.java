package tugas.sort;

import java.util.Random;

public class BubbleShort {

    public static void main(String[] args) {
        Random random = new Random();
        int n = 6;
        int[] data = new int[n];

        // Pengisian data menggunakan random
        for (int i = 0; i < n; i++){
            int rand = random.nextInt(1,10);
            data[i] = rand;
        }
        System.out.println("Tampilan data awal : ");
        for (int i = 0; i < data.length; i++){
            System.out.println("Data pada indeks ke "+i+" : "+data[i]);
        }

        // Bubble Short
        int temp;
        for (int i = 0; i < data.length - 1; i++){
            for (int j = i + 1; j < data.length; j++){
                if (data[i] > data[j]){
                    temp = data[j];
                    data[j] = data[i];
                    data[i] = temp;
                }
            }
        }

        // Output
        System.out.println("\nTampilan data : ");
        for (int i = 0; i < data.length; i++){
            System.out.println("Data pada indeks ke "+i+" : "+data[i]);
        }
    }
}
