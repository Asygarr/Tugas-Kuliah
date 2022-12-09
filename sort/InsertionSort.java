package tugas.sort;

import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        // Deklarasi
        Scanner in = new Scanner(System.in);
        int n = 5;
        int[] data = new int[n];
        int temp;

        // Pengisian data array
        for (int i=0; i < n; i++){
            System.out.print("Masukkan data pada indeks "+i+" : ");data[i] = in.nextInt();
        }

        // Output awal
        System.out.println("\nTampilan data awal : ");
        for (int i=0; i < n; i++){
            System.out.println("Data pada indeks "+i+" : "+data[i]);
        }

        // Proses
        for (int i=1; i< data.length; i++){
            for (int j=i; j>0; j--){
                if (data[j] < data[j-1]){
                    temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                } else {
                    break;
                }
            }
        }

        // Output akhir
        System.out.println("\nTampilan data akhir : ");
        for (int i = 0; i < data.length; i++){
            System.out.println("Data pada indeks ke "+i+" : "+data[i]);
        }
    }
}
