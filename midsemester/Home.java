package tugas.midsemester;

import java.util.Scanner;

public class Home {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner input = new Scanner(System.in);
        int ulang, pilih = 0, loop = 0;

        do {
            loop++;
            System.out.println("===MENU===");
            if (loop == 1){
                menu.Gopay(loop);
            } else {
                System.out.println("1. Gofood \n2. GoSend \n3. GoCar \n4. GoPay");
                System.out.print("Pilihan : ");pilih = input.nextInt();
            }

            if (pilih == 1){
                menu.GoFood();
            } if (pilih == 2) {
                menu.GoSend();
            } if (pilih == 3){
                menu.Gocar();
            } if (pilih == 4){
                menu.Gopay(loop);
            } else if (pilih > 4){
                System.out.println("Pilihan tidak ditemukan");
            }

            System.out.println("\n1. Ke menu utama \n2. Tidak");
            System.out.print("Pilihan : ");
            ulang = input.nextInt();
            System.out.println();
        } while (ulang == 1);
    }
}
