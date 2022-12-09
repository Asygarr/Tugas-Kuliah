package tugas;

import java.util.Random;

public class BubbleShort {

    public static void main(String[] args) {
        Random random = new Random();
        int[] data = new int[10]; int ndata = 9;

        // Pengisian data menggunakan random
        for (int i = 0; i < ndata; i++){
            int rand = random.nextInt(1,10);
            data[i] = rand;
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
        System.out.println("Tampilan data : ");
        for (int i = 0; i < data.length; i++){
            System.out.println("Data pada indeks ke "+i+" : "+data[i]);
        }
    }
}
