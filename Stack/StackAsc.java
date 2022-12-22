package tugas.Stack;

import java.util.Arrays;

public class StackAsc {

    public static void main(String[] args) {

        StackClass2 toples1 = new StackClass2();
        StackClass2 toples2 = new StackClass2();
        StackClass2 toples3 = new StackClass2();
        int piring, top = 0, z = 0, temp, n1 = 0, n2 = 0;
        int[] angka = {2, 3, 1, 5, 4};
        int[] piring1 = new int[1000], piring2 = new int[1000];
        int n = angka.length;

        // Data awal
        System.out.println("Angka : "+ Arrays.toString(angka));

        System.out.println("\n<<<<< Mengeluarkan data dari toples >>>>>");
        for (int j : angka) {
            toples1.push(j);
        }
        System.out.print("Toples 1 : ");toples1.tampil();
        System.out.println();


        for (int i = 0; i < n; i++){
            piring = toples1.pop();
            if (i == 0) {
                toples2.push(piring);
                top = piring;
                n1++;
            } else {
                if (piring > top) {
                    if (piring > z) {
                        temp = z;
                        toples3.push(piring);
                        if (temp != 0) {
                            toples3.push(temp);
                        }
                        z = piring;
                    } else {
                        toples3.push(piring);
                    }
                    n2++;
                } else {
                    toples2.push(piring);
                    top = piring;
                    n1++;
                }
            }

        }

        toples2.tampil();
        System.out.println();
        toples3.tampil();
    }
}
