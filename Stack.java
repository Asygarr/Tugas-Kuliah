package tugas;


public class Stack {

    public static void main(String[] args) {
        StackClass toples1 = new StackClass();
        StackClass toples2 = new StackClass();
        String data;
        int n;
        char piring1, flags = ' '; char[] huruf;

        System.out.println("<<<< MEMASUKKAN DATA >>>>");
        data = "BUKU TULIS";
        System.out.print("Kata : "+data+"\n");
        n = data.length();
        huruf = data.toCharArray();

        System.out.println("\n<<<< MENGELUARKAN DATA >>>>");
        for (int i = 0; i < n; i++){
            toples1.push(huruf[i]);
        }
        System.out.print("Hasil 1 : ");toples1.tampil();
        System.out.println();

        System.out.print("Hasil 2 : ");
        for (int i = 0; i < n; i++){
            piring1 = toples1.pop();

            // Mengisi space terlebih dahulu
            if (i == 0) {
                toples2.push(flags);
            }

            // Penukaran kata
            if (piring1 == flags) {
                toples2.tampil(); // Menampilkan kata pertama

                // Menghapus isi di toples 2
                for (int j = i; j >= 0; j--){
                    toples2.pop();
                }

                // Mengisi kata ke-2 di toples 2
                toples2.push(piring1);
                for (int j = i+1; j < n; j++){
                    piring1 = toples1.pop();
                    toples2.push(piring1);
                }
                toples2.tampil(); // Menampilkan kata kedua
                break; // Berhenti loop
            } else {
                toples2.push(piring1); // Mengisi kata pertama di toples 2
            }
        }

        System.out.println();
    }
}
