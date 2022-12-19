package tugas.Stack;


public class Stack {

    public static void main(String[] args) {
        StackClass toples1 = new StackClass();
        StackClass toples2 = new StackClass();
        String data;
        int n;
        char piring, flags = ' '; char[] huruf;

        System.out.println("<<<< MEMASUKKAN DATA >>>>");
        data = "BUKU TULIS YUI";
        System.out.print("Kata : "+data+"\n");
        n = data.length();
        huruf = data.toCharArray();

        System.out.println("\n<<<< MENGELUARKAN DATA >>>>");
        for (int i = 0; i < n; i++){
            toples1.push(huruf[i]);
        }
        System.out.print("Toples 1 : ");toples1.tampil();
        System.out.println();

        System.out.print("Toples 2 : ");
        for (int i = 0; i < n; i++){
            // Mengisi space untuk kata pertama
            piring = toples1.pop();
            if (i == 0) {
                toples2.push(flags);
            }

            // Penukaran kata
            if (piring == flags) {
                toples2.tampil(); // Menampilkan kata pertama

                // Menghapus kata pertama tadi di dalam toples
                for (int j = i; j >= 0; j--){
                    toples2.pop();
                }

                toples2.push(piring); // Mengisi space untuk kata kedua
                for (int j = i+1; j < n; j++){
                    piring = toples1.pop();

                    // Penukaran kata
                    if (piring == flags) {
                        toples2.tampil(); // Menampilkan kata kedua

                        // Menghapus kata kedua tadi di dalam toples
                        for (int k = j; k >= i+1; k--){
                            toples2.pop();
                        }

                        toples2.push(piring); // Mengisi space untuk kata ketiga
                        for (int k = j+1; k < n; k++){
                            piring = toples1.pop();
                            toples2.push(piring); // Push kata ketiga
                        }
                        toples2.tampil(); // Menampilkan kata ketiga
                        break;
                    } else {
                        toples2.push(piring); // Push kata kedua
                    }
                }
                break;
            } else {
                toples2.push(piring); // Push kata pertama
            }
        }

        System.out.println();
    }
}
