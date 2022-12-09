package tugas;

import java.util.Random;
import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String baca;
        int[][] koordinat= {
                {11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25},
                {31, 32, 33, 34, 35},
                {41, 42, 43, 44, 45},
                {51, 52, 53, 54, 55},
                {61, 62, 63, 64, 65},
        };

        do {
            Random random = new Random();
            int pintu1 = random.nextInt(2);
            int pintu2 = random.nextInt(2);
            System.out.println("Nilai pintu ke satu : "+pintu1);
            System.out.println("Nilai pintu ke dua : "+pintu2);

            for (int i = 0; i < 6; i++) {
                //pintu 1
                if (koordinat[i] == koordinat[1]) {
                    if (pintu1 == 1) {
                        System.out.print("|");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("|");
                }

                if (koordinat[i] == koordinat[0] || koordinat[i] == koordinat[3] || koordinat[i] == koordinat[5]) {
                    for (int j = 0; j < 5; j++) {
                        //pintu 2
                        if (koordinat[i][j]==koordinat[3][1]) {
                            if (pintu2 == 1) {
                                System.out.print("-");
                            } else {
                                System.out.print(" ");
                            }
                        } else {
                            System.out.print("-");
                        }
                    }
                } else {
                    for (int j = 0; j < 5; j++) {
                        if (koordinat[i][j]==koordinat[1][2]) {
                            System.out.print("C");
                        } else if (koordinat[i][j]==koordinat[4][2]) {
                            System.out.print("D");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.print("|");
                System.out.println();
            }

            //output
            if (pintu1 == 0 && pintu2 == 1) {
                System.out.println("Dawala tidak ketemu cepot, Ada jalan untuk cepot keluar");
            } else if (pintu1 == 1 && pintu2 == 0) {
                System.out.println("Dawala bertemu cepot, Tidak ada jalan untuk cepot keluar");
            } else if (pintu1 == 0) {
                System.out.println("Dawala bertemu cepot, Ada jalan untuk cepot keluar");
            } else {
                System.out.println("Dawala tidak bertemu cepot, Tidak ada jalan untuk cepot keluar");
            }

            System.out.print("Ulangi? (ya/tidak) : "); baca = sc.nextLine();
            System.out.println();
        } while (baca.equalsIgnoreCase("ya"));
    }
}
