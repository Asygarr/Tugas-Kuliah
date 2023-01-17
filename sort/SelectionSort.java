package tugas.sort;

import java.util.Random;

public class SelectionSort {

    public static void main(String[] args) {
        // Deklarasi
        Random random = new Random();
        int n = 5;
        int[] data = new int[n];
        int temp, posisi;

        // Pengisian data menggunakan random
        for (int i = 0; i < n; i++){
            int rand = random.nextInt(1,10);
            data[i] = rand;
        }

        // Output data awal
        System.out.println("Tampilan data awal : ");
        for (int i = 0; i < data.length; i++){
            System.out.println("Data pada indeks ke "+i+" : "+data[i]);
        }

        // Proses
        for (int i = 0; i < data.length; i++){
            temp=data[i];//4
            posisi=i;//0
            for (int j = i; j < data.length; j++){
                if (data[j] < temp){
                    temp=data[j];//2
                    posisi=j;//2
                }
            }
            data[posisi]=data[i];//4
            data[i]=temp;//2
        }
        System.out.println();

        // Output akhir
        System.out.println("Tampilan data akhir : ");
        for (int i = 0; i < data.length; i++){
            System.out.println("Data pada indeks ke "+i+" : "+data[i]);
        }
    }
}
