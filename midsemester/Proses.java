package tugas.midsemester;

import java.util.Scanner;

public class Proses {
    int saldo = 0;
    Scanner in = new Scanner(System.in);

    public void ProsesGofood (int pilih){
        int harga = 0;
        String pesanan = null;
        if (pilih == 1){
            harga = 10000;
            pesanan = "Ayamn goreng";
        } if (pilih == 2){
            harga = 20000;
            pesanan = "Ayam geprek";
        } if (pilih == 3){
            harga = 30000;
            pesanan = "Ayam krispi";
        }

        System.out.println("Pesanan : "+pesanan);
        System.out.println("Total harga : Rp."+harga);
        System.out.println("1. Bayar \n2. Tidak");
        System.out.print("Pilih : ");int sc = in.nextInt();
        if (sc == 1){
            if (saldo < harga){
                System.err.println("**SALDO ANDA TIDAK MENCUKUPI, SILAHKAN MELAKUKAN TOP UP GOPAY TERLEBIH DAHULU**");
                System.out.println();
            } else {
                System.out.println("**PESANAN ANDA DALAM PERJALANAN**");
                saldo -= harga;
            }
        } if (sc == 2){
            System.out.println("**PESANAN DIBATALKAN**");
        }
    }

    public void ProsesGosend (String barang, int berat, String rute){
        int harga = 0;
        if (berat < 30){
            harga = 30000;
            if (rute.equalsIgnoreCase("A")){
                harga += 20000;
            } if (rute.equalsIgnoreCase("B")){
                harga += 25000;
            } if (rute.equalsIgnoreCase("C")){
                harga += 50000;
            }
        } if (berat >= 30){
            harga = 50000;
            if (rute.equalsIgnoreCase("A")){
                harga += 30000;
            } if (rute.equalsIgnoreCase("B")){
                harga += 50000;
            } if (rute.equalsIgnoreCase("C")){
                harga += 70000;
            }
        }

        System.out.println("Barang yang akan dikirim : "+barang);
        System.out.println("Total harga : Rp."+harga);
        System.out.println("1. Bayar \n2. Tidak");
        System.out.print("Pilih : ");int pilih = in.nextInt();
        if (pilih == 1){
            if (saldo < harga){
                System.err.println("**SALDO ANDA TIDAK MENCUKUPI, SILAHKAN MELAKUKAN TOP UP GOPAY TERLEBIH DAHULU**");
                System.out.println();
            } else {
                System.out.println("**BARANG ANDA DALAM PENGIRIMAN**");
                saldo -= harga;
            }
        } if (pilih == 2){
            System.out.println("**PENGIRIMAN DIBATALKAN**");
        }
    }

    public void ProsesGocar (String rute){
        int harga = 0;
        if (rute.equalsIgnoreCase("A")){
            harga = 30000;
        } if (rute.equalsIgnoreCase("B")){
            harga = 50000;
        } if (rute.equalsIgnoreCase("C")){
            harga = 70000;
        }

        System.out.println("Rute yang di pilih : "+rute);
        System.out.println("Total harga : Rp."+harga);
        System.out.println("1. Bayar \n2. Tidak");
        System.out.print("Pilih : ");int pilih = in.nextInt();
        if (pilih == 1){
            if (saldo < harga){
                System.err.println("**SALDO ANDA TIDAK MENCUKUPI, SILAHKAN MELAKUKAN TOP UP GOPAY TERLEBIH DAHULU**");
                System.out.println();
            } else {
                System.out.println("**GOCAR TELAH DI PESAN**");
                saldo -= harga;
            }
        } if (pilih == 2){
            System.out.println("**GOCAR DIBATALKAN**");
        }
    }

    public void ProsesGopay (int pilih, int loop){
        if (loop == 1){
            if (pilih == 1){
                System.out.println("Masukkan saldo anda (minimal 1.000.000)");
                System.out.print("Top Up : ");int cek = in.nextInt();
                saldo += cek;
            }
        } else {
            if (pilih == 1){
                System.out.print("Isi saldo : ");int cek = in.nextInt();
                saldo += cek;
            }
        } if (pilih == 2){
            System.out.println("Saldo anda : Rp."+saldo);
        }
    }

    //************************************************************************//

    public void FirstBoot (){
        System.out.println("SALDO ANDA SAAT INI : Rp."+saldo);
        System.out.println("DISARANKAN ISI SALDO GOPAY TERLEBIH DAHULU!!!");
    }
}
