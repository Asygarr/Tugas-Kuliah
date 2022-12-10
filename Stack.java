package tugas;

import java.util.Scanner;

public class Stack {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int data; //variabel luar stack 
        StackClass toples = new StackClass();

        System.out.println("<<<< MEMASUKKAN DATA >>>>");
        for (int i = 0; i < 5; i++){
            System.out.print("Maukkan data : ");data = input.nextInt();
            toples.push(data);
        }
        System.out.print("DATA : ");
        toples.tampil();

        System.out.println();
        System.out.println("\n<<<< MENGELUARKAN DATA >>>>");
        toples.tampil();

        for (int i=0;i<4;i++) {
            toples.pop();
            System.out.println();
            toples.tampil();
        }
    }
    
}
