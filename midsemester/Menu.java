package tugas.midsemester;

import java.util.Scanner;

public class Menu {
    Scanner in = new Scanner(System.in);
    Proses pro = new Proses();

    public void GoFood () {
        System.out.println("\nPilih makanan : ");
        System.out.println("1. Ayam goreng \n2. Ayam geprek \n3. Ayam krispi");
        System.out.print("pilihan anda : ");int pilih = in.nextInt();
        pro.ProsesGofood(pilih);
    }

    public void GoSend (){
        System.out.print("\nBarang yang ingin dikirim : ");String barang = in.next();
        System.out.print("Berat barang : ");int berat = in.nextInt();
        System.out.println("PILIH RUTE (A,B,C) : ");
        System.out.print("Rute : ");String rute = in.next();
        pro.ProsesGosend(barang, berat, rute);
    }

    public void Gocar (){
        System.out.println("\nPILIH RUTE (A,B,C) : ");
        System.out.print("Rute : ");String rute = in.next();
        pro.ProsesGocar(rute);
    }

    public void Gopay (int loop){
        if (loop == 1) {
            pro.FirstBoot();
        }
        System.out.println("\n1. Top UP \n2. Cek Saldo");
        System.out.print("Pilihan : ");int pilih = in.nextInt();
        pro.ProsesGopay(pilih, loop);
    }
}
