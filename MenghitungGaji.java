package tugas;

import java.util.Scanner;

public class MenghitungGaji {

    public static void main(String[] args){
        //deklarasi
        String nama,alamat,jabatan;   //input
        String status;                //input
        float anak;                   //input
        float gaji_pokok=0;           //output
        float tk=0,ta=0;              //output
        float tt;                     //output
        float pajak= (float) 0.05;    //output

        //penginputan
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama anda = ");
        nama = sc.nextLine();
        System.out.print("Masukkan alamat anda = ");
        alamat = sc.nextLine();
        System.out.print("Masukkan jabatan anda = ");
        jabatan = sc.nextLine();
        System.out.print("Masukkan status anda = ");
        status = sc.nextLine();
        System.out.print("Anak = ");
        anak = sc.nextFloat();

        //proses
        if (jabatan.equalsIgnoreCase("admin")){
            gaji_pokok = 3000000;
        }
        if (jabatan.equalsIgnoreCase("kabag")){
            gaji_pokok = 4500000;
        }
        if (jabatan.equalsIgnoreCase("manager")){
            gaji_pokok = 5000000;
        }


        if (status.equalsIgnoreCase("belum menikah")){
            tk = 500000;
        }
        if (status.equalsIgnoreCase("janda")){
            tk = 250000;
        }
        if (status.equalsIgnoreCase("janda")) {
            tk = 250000;
        }
        if (status.equalsIgnoreCase("Belum Menikah")){
            tk = 0;
        }


        if (anak<3){
            ta = 500000;
        }
        if (anak>3) {
            ta = 5000000;
        }

        tt = tk + ta;
        float gaji_total = (gaji_pokok + tt) - pajak;

        //output
        System.out.println("BIODATA KARYAWAN");
        System.out.println("Nama Karywan = "+nama);
        System.out.println("Alamat = "+alamat);
        System.out.println("Jabatan = "+jabatan);
        System.out.println("Gaji Pokok = "+gaji_pokok);
        System.out.println("Total Tunjangan = "+tt);
        System.out.println("Total Gaji = "+gaji_total);
    }
}
