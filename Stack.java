package tugas;


public class Stack {

    public static void main(String[] args) {
        StackClass toples1 = new StackClass();
        StackClass toples2 = new StackClass();
        StackClass toples3 = new StackClass();
        StackClass toples4 = new StackClass();
        String data;
        int n, tanda = 0;
        char piring1, piring2, piring3, flags = ' '; char[] huruf;

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

        System.out.print("Hasil 2 : ");
        while (true) {
            tanda+=1; //Parameter untuk menghentikan looping
            piring1 = toples1.pop(); //Penampung data yang dikeluarkan
            if (tanda == 1){
                toples2.push(flags); //Mengisi space terlebih dahulu pada pengeluara pertama
            } if (piring1 == flags){ //Tanda pergantian push toples
                toples2.tampil(); //Output : YUI
                toples3.push(piring1); //Mengisi space terlebih dahulu
                while (true){
                    tanda+=1; //Parameter untuk menghentikan looping
                    piring2 = toples1.pop(); //Penampung data yang dikeluarkan
                    if (piring2 == flags) { //Tanda pergantian push toples
                        toples3.tampil(); //Output : TULIS
                        toples4.push(piring2); //Mengisi space terlebih dahulu
                        while (true) {
                            tanda+=1; //Parameter untuk menghentikan looping
                            piring3 = toples1.pop(); //Penampung data yang dikeluarkan
                            toples4.push(piring3); //Push
                            if (tanda == n) { //Menghentikan semua looping
                                toples4.tampil(); //Output : BUKU
                                break;
                            }
                        }
                        break;
                    } else {
                        toples3.push(piring2); //Push
                    }
                }
                break;
            } else {
                toples2.push(piring1); //Push
            }
        }

        /*for (int i = 0; i < n; i++){
            tanda++;
            piring = toples1.pop();
            if (i == 0){
                toples2.push(flags);
            } if (piring == flags) {
                for (int j = tanda; j < n; j++){
                    toples3.push(toples1.pop());
                }
                break;
            } else {
                toples2.push(piring);
            }
        }*/

        System.out.println();
    }
}
