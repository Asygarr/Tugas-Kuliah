package tugas;
import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String baca;

        do {
            Random random = new Random();
            int pintu1 = random.nextInt(2);
            int pintu2 = random.nextInt(2);
            System.out.println("Nilai pintu ke satu : "+pintu1);
            System.out.println("Nilai pintu ke dua : "+pintu2);

            for (int i = 1; i <= 6; i++) {
                //pintu 1
                if (i == 3) {
                    if (pintu1 == 0) {
                        System.out.print("|");
                    } else if (pintu1 == 1) {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("|");
                }

                if (i == 1 || i == 4 || i == 6) {
                    for (int j = 1; j <= 5; j++) {
                        //pintu 2
                        if (i == 4 && j == 2) {
                            if (pintu2 == 0) {
                                System.out.print("-");
                            } else if (pintu2 == 1) {
                                System.out.print(" ");
                            }
                        } else {
                            System.out.print("-");
                        }
                    }
                } else {
                    for (int j = 1; j <= 5; j++) {
                        if (i == 2 && j == 3) {
                            System.out.print("C");
                        } else if (i == 5 && j == 3) {
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
            if (pintu1 == 1 && pintu2 == 0) {
                System.out.println("Dawala tidak ketemu cepot, Ada jalan untuk cepot keluar");
            } else if (pintu1 == 0 && pintu2 == 1) {
                System.out.println("Dawala bertemu cepot, Tidak ada jalan untuk cepot keluar");
            } else if (pintu1 == 1 && pintu2 == 1) {
                System.out.println("Dawala bertemu cepot, Ada jalan untuk cepot keluar");
            } else if (pintu1 == 0 && pintu2 == 0) {
                System.out.println("Dawala tidak bertemu cepot, Tidak ada jalan untuk cepot keluar");
            }

            System.out.print("Ulangi? (ya/tidak) : "); baca = sc.nextLine();
            System.out.println();
        } while (baca.equalsIgnoreCase("ya"));
    }
}
