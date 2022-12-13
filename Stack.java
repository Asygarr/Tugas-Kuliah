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
            if (i == 0) {
                toples2.push(flags);
            }if (piring1 == flags) {
                toples2.tampil();
                toples3.push(piring1);
                for (int j = i+1; j < n; j++){
                    piring2 = toples1.pop();
                    toples3.push(piring2);
                } toples3.tampil();
                break;
            } else {
                toples2.push(piring1);
            }
        }



        System.out.println();
    }
}
