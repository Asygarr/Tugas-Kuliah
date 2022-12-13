package tugas;


public class Stack {

    public static void main(String[] args) {
        StackClass toples1 = new StackClass();
        StackClass toples2 = new StackClass();
        StackClass toples3 = new StackClass();
        StackClass toples4 = new StackClass();
        String data;
        int n, tanda = 0;
        char piring, flags = ' '; char[] huruf;

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
        while (true) {
            tanda++;
            piring = toples1.pop();
            if (tanda == 1){
                toples2.push(flags);
            } if (piring == flags){
                toples2.tampil();
                while (true) {
                    tanda++;
                    toples3.push(toples1.pop());
                    if (tanda == n) {
                        toples3.tampil();
                        break;
                    }
                }
                break;
            } else {
                toples2.push(piring);
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
