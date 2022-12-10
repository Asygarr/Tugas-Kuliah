package tugas;

import java.util.Scanner;

public class Stack {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //menambah objek scanner input
        int data; //variabel luar stack 
        StackClass toples = new StackClass(); //objek dan class

        System.out.println("<<<< MEMASUKKAN DATA >>>>");
        for (int i = 0; i < 5; i++){ //menginput data menggunakan loop
            System.out.print("Maukkan data : ");data = input.nextInt();
            toples.push(data);
        }
        System.out.print("DATA : "); toples.tampil(); //menampilkan data
        System.out.println();

        System.out.println("\n<<<< MENGELUARKAN DATA >>>>");
        toples.tampil();
        for (int i=0;i<4;i++) { //mengeluarkan data menggunakan objek pop dan perulangan (loop)
            toples.pop();
            System.out.println();
            toples.tampil();
        }
    }
}
