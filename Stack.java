package tugas;


public class Stack {

    public static void main(String[] args) {
        StackClass toples1 = new StackClass();
        StackClass toples2 = new StackClass();
        StackClass toples3 = new StackClass();
        String data;
        int n, td=0, tanda = 0; char piring, flags = ' ';
        char[] abjad;

        System.out.println("<<<< MEMASUKKAN DATA >>>>");
        data = "BUKU TULIS KAKAK";
        System.out.print("Kata : "+data+"\n");
        n = data.length();
        abjad = data.toCharArray();

        System.out.println("\n<<<< MENGELUARKAN DATA >>>>");
        for (int i = 0; i < n; i++){
            toples1.push(abjad[i]);
        }
        System.out.print("Hasil 1 : ");toples1.tampil();
        System.out.println();

        /*while (true) {
            piring = toples1.pop();
            td++;
            if (piring == flags){
                tanda=td;
                for (int i = tanda; i < n; i++){
                    toples3.push(toples1.pop());
                } break;
            } else {
                toples2.push(piring);
            }
        }*/


        for (int i = 0; i < n; i++){
            piring = toples1.pop();
            td++;
            if (i == 0){
                toples2.push(flags);
            } if (piring == flags) {
                tanda=td;
                break;
            } else {
                toples2.push(piring);
            }
        }
        /*while (true) {
            tanda++;
            toples3.push(toples1.pop());
            if (tanda==n){
                break;
            }
        }*/

        for (int i = tanda; i < n; i++){
            toples3.push(toples1.pop());
        }

        System.out.print("Hasil 2 : ");
        toples2.tampil();
        toples3.tampil();

        System.out.println();
    }
}
