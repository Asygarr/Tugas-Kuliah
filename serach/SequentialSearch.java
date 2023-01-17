package tugas.serach;

import java.util.Random;

public class SequentialSearch {

    public static void main(String[] args) {
        Random random = new Random();

        // pilihan
        String pilihan = "Piring Plastik";

        // Deklarasi
        String[] piring = new String[5]; int[] indeks = new int[5]; int data = 5;

        // Random Indeks
        for (int i = 0; i < data; i++) {
            indeks[i] = random.nextInt(3);
        }

        // Pemanggilan Method Function
        Data(data, indeks, piring, pilihan);
    }

    // Proses Data
    private static void Data (int data, int[] indeks, String[] piring, String pilihan){
        for (int i = 0; i < data; i++) {
            if (i == indeks[0]) {
                piring[i] = "Piring Kaca";
            }
            if (i == indeks[1]) {
                piring[i] = "Piring Aluminium";
            }
            if (i == indeks[2]) {
                piring[i] = "Piring Plastik";
            }
        }

        Tampilan(pilihan, piring, data);

    }

    // Output
    private static void Tampilan (String pilihan, String[] seleksi, int data){
        for (int i = 0; i < data; i++) {
            if (pilihan.equals(seleksi[i])) {
                System.out.println(seleksi[i] + " Ditemukan pada indeks : " + i);
            }
        }
    }
}
