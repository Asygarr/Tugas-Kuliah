package tugas.serach;

public class BinerySearch {

    public static void main(String[] args) {
        int data = 225; char ascii = 0; char[] huruf = new char[1000];
        int mid = (data-1)/2;

        char pilihan = 78; // Mencari huruf N

        // Data
        for (int i = 0; i < data; i++){
            huruf[i] = ascii++;
        }

        seleksiTampilan(pilihan, huruf, mid, data);

    }

    // Jika indeks lebih tinggi
    private static void kurang (int mid, char[] huruf, char pilihan){
        for (int i = 0; i < mid; i++){
            if (huruf[i] == pilihan){
                System.out.println(huruf[i]+" ditemukan pada indeks "+i);
                break;
            }
        }
    }

    // Jika indeks lebih rendah
    private static void lebih (int mid, char[] huruf, char pilihan, int data){
        for (int i = mid; i < data; i++){
            if (huruf[i] == pilihan){
                System.out.println(huruf[i]+" ditemukan pada indeks "+i);
                break;
            }
        }
    }

    // Seleksi Indeks Tengah
    private static void seleksiTampilan (char pilihan, char[] huruf, int mid, int data){
        if (pilihan < huruf[mid]){
            kurang(mid, huruf, pilihan);
        } else if (pilihan >= huruf[mid]){
            lebih(mid, huruf, pilihan, data);
        }
    }
}
