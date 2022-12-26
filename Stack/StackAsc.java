package tugas.Stack;

import java.util.Arrays;

public class StackAsc {

    public static void main(String[] args) {

        StackClass2 toples1 = new StackClass2();
        StackClass2 toples2 = new StackClass2();
        StackClass2 toples3 = new StackClass2();
        int piring, temp, top2 = 0, top3 = 0, pr2 = 0, pr3 = 0, n2 = 0, n3 = 0;
        int[] angka = {3, 1, 5, 2, 4};
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
                top2 = piring;
                n2++;
            } else {
                if (piring > top2) {
                    if (piring > top3) {
                        temp = top3;
                        toples3.push(piring);
                        if (temp != 0) {
                            toples3.push(temp);
                        }
                        top3 = piring;
                    } else {
                        toples3.push(piring);
                    }
                    n3++;
                } else {
                    toples2.push(piring);
                    top2 = piring;
                    n2++;
                }
            }

        }
        System.out.println();
        System.out.print("Toples 2 : "); toples2.tampil();
        System.out.print("\nToples 3 : "); toples3.tampil();

        System.out.println("\n\nTAMPILKAN PENGURUTAN : ? ");
    }
}
