package tugas.TVClassAndObject;

import java.util.Scanner;

public class ClassMenu {
    public static void main(String[] args) {
        SeleksiTampilan tampil = new SeleksiTampilan();
        Scanner input = new Scanner(System.in);
        int ulang;

        System.out.println("Menentukan Luas TV : ");
        System.out.println("=======================");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Lingkaran");
        System.out.println("3. Luas Persegi Panjang");
        System.out.println("4. Luas Segitiga");
        System.out.println("=======================");
        System.out.print("Pilhan anda : "); int pilihLuas = input.nextInt();
        tampil.SeleksiLuas(pilihLuas);


        do {
            System.out.println("\nMenu TV : ");
            System.out.println("=====================");
            System.out.println("1. Ganti channel");
            System.out.println("2. Tambah suara");
            System.out.println("3. Kurang suara");
            System.out.println("4. Tambah kecerahan");
            System.out.println("5. Kurang kecerahan");
            System.out.println("=====================");
            System.out.print("Pilhan anda : "); int tv = input.nextInt();
            tampil.TV(tv);

            System.out.print("\n1. kembali ke menu TV \n2. berhenti \npilihan : ");ulang = input.nextInt();
        } while (ulang == 1);
    }
}
