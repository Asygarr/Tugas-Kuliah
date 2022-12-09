package tugas.TVClassAndObject;

import java.util.Scanner;

public class SeleksiTampilan {
    ClassOperasi luas = new ClassOperasi();
    classTV remot = new classTV();
    Scanner input = new Scanner(System.in);
    int seleksi, a, b;

    public void SeleksiLuas (int s){
        if (s == 1){
            System.out.print("Tentukan luas persegi : ");seleksi = input.nextInt();
            luas.LuasPersegi(seleksi);
            luas.Tampil();
        }
        if (s == 2){
            System.out.print("Tentukan luas lingkaran : ");seleksi = input.nextInt();
            luas.Lingkaran(seleksi);
            luas.Tampil();
        }
        if (s == 3){
            System.out.println("Tentukan luas persegi panjang : ");
            System.out.print("Nilai a : ");a = input.nextInt();
            System.out.print("Nilai b : ");b = input.nextInt();
            luas.PersegiPanjang(a,b);
            luas.Tampil();
        }
        if (s == 4){
            System.out.println("Tentukan luas segitiga : ");
            System.out.print("Nilai a : ");a = input.nextInt();
            System.out.print("Nilai b : ");b = input.nextInt();
            luas.LuasSegitiga(a,b);
            luas.Tampil();
        }
    }

    public void TV (int s){
        if (s == 1){
            System.out.print("Masukkan no saluran TV : ");seleksi = input.nextInt();
            remot.GantiChannel(seleksi);
        }
        if (s == 2){
            System.out.print("Tambahkan suara : ");seleksi = input.nextInt();
            remot.TambahSuara(seleksi);
        }
        if (s == 3){
            System.out.print("Kurangkan suara : ");seleksi = input.nextInt();
            remot.KurangSuara(seleksi);
        }
        if (s == 4){
            System.out.print("Tambahkan kecerahan : ");seleksi = input.nextInt();
            remot.TambahTerang(seleksi);
        }
        if (s == 5){
            System.out.print("Kurangkan kecerahan : ");seleksi = input.nextInt();
            remot.KurangTerang(seleksi);
        }
    }
}
