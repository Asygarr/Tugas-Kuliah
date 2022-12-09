package tugas;

import java.util.Scanner;

public class mencaripanjang {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double x1,y1,x2,y2,x3,y3,x,y;
        System.out.print("Masukkan Nilai x1 : "); x1= input.nextDouble();
        System.out.print("Masukkan Nilai y1 : "); y1= input.nextDouble();
        System.out.print("Masukkan Nilai x2 : "); x2= input.nextDouble();
        System.out.print("Masukkan Nilai y2 : "); y2= input.nextDouble();
        x3=x2;
        y3=y1;

        x=x1-x3;
        y=y2-y3;

        System.out.println("Nilai x : "+x);
        System.out.println("Bilai y : "+y+"\n");

        System.out.println("Hasil : "+Math.hypot(x,y));
    }
}
