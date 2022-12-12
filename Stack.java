package tugas;

import java.util.Scanner;

public class Stack {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackClass toples1 = new StackClass();
        StackClass toples2 = new StackClass();
        StackClass toples3 = new StackClass();
        StackClass space = new StackClass();
        String data;
        int n, td=0, tanda; char piring, flags = ' ', tampung;
        char[] abjad;

        System.out.println("<<<< MEMASUKKAN DATA >>>>");
        data = "TES TOL";
        System.out.print("Masukkan kata : "+data);//data = input.nextLine();
        n = data.length();
        abjad = data.toCharArray();

        System.out.println("\n<<<< MENGELUARKAN DATA >>>>");
        for (int i = 0; i < n; i++){
            toples1.push(abjad[i]);
        }
        System.out.print("Hasil 1 : ");toples1.tampil();

        System.out.println();
        while (true) {
            piring = toples1.pop();
            td++;
            if (piring == flags){
                for (int i = 0; i <= 1; i++){
                    space.push(piring);
                }
                tanda=td;
                break;
            } else {
                toples2.push(piring);
            }
        }

        while (true) {
            tanda++;
            toples3.push(toples1.pop());
            if (tanda == n){
                break;
            }
        }
        System.out.print("Hasil 2 : ");
        toples2.tampil();
        space.tampil();
        toples3.tampil();
        System.out.println();


        System.out.println();
    }
}
