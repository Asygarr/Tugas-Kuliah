package tugas;


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
        System.out.print("Hasil 1 : ");toples1.tampil();
        System.out.println();

        System.out.print("Hasil 2 : ");
        for (int i = 0; i < n; i++){
            // Start
            piring = toples1.pop();
            if (i == 0) {
                toples2.push(flags);
            }

            if (piring == flags) {
                toples2.tampil();
                for (int j = i; j >= 0; j--){
                    toples2.pop();
                }

                toples2.push(piring);
                for (int j = i+1; j < n; j++){
                    piring = toples1.pop();

                    if (piring == flags) {
                        toples2.tampil();
                        for (int k = j; k >= i+1; k--){
                            toples2.pop();
                        }

                        toples2.push(piring);
                        for (int k = j+1; k < n; k++){
                            piring = toples1.pop();
                            toples2.push(piring);
                        }
                        toples2.tampil();
                        break;
                    } else {
                        toples2.push(piring);
                    }
                }
                break;
            } else {
                toples2.push(piring);
            }
        }

        System.out.println();
    }
}
