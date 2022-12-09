package tugas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Random random = new Random();
        int kostumer = random.nextInt(100);
        int waktu1=0, waktu2=0, waktu3=0;
        int[] menit=new int[100];
        Scanner sc = new Scanner(System.in);
        int teller = 0;
        int antrian = 0;
        int menu;
        String[] nama = new String[100];

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy H:mm:ss");
        Date date = new Date();
        dateFormat.format(date);

        for (int i = 1; i <= kostumer; i++){
            antrian+=1;
            menit[antrian] = random.nextInt(30);
            System.out.println("=====PILIHAN YANG DI INGINKAN======");
            System.out.println("1. Teller");
            System.out.println("2. Exit");
            System.out.println();
            System.out.print("Pilihan Layanan===> : ");
            menu = sc.nextInt();

            if (menu == 1) {
                if (antrian==1){
                    teller = 1;
                } if (antrian==2){
                    teller = 2;
                } if (antrian==3){
                    teller = 3;
                } else {
                    if (waktu1<waktu2 && waktu1<waktu3) {
                        teller = 1;
                    } else if (waktu2<waktu1 && waktu2<waktu3) {
                        teller = 2;
                    } else if (waktu3<waktu2 && waktu3<waktu1){
                        teller = 3;
                    }
                }

                if (teller == 1){
                    waktu1+=menit[antrian];
                } else if (teller == 2){
                    waktu2+=menit[antrian];
                } else if (teller==3){
                    waktu3+=menit[antrian];
                }

                System.out.println("=====Selamat Datang Di Bank=====");
                System.out.print(" Masukkan Nama : ");
                nama[menu] = sc.next();
                System.out.println("\n");
                System.out.println(date);
                System.out.println("Nama Costumer : " + nama[menu]);
                System.out.println("Nomor Antrian : " + antrian);
                System.out.println("Waktu Antrian : " + menit[antrian] + " menit ");
                System.out.println("TELLER");
                System.out.println("  " + teller);
                System.out.println();
                System.out.println();

            } else if (menu == 2) {
                break;
            }
        }
    }
}
