package tugas;

import java.util.Scanner;

public class mid {
    public static void main(String[] args){

        // no 1
        String NIM, nama, lagi, namaMax=null, namaMin=null, grade = null;
        int Total_Siswa=0, Total_NA=0, rata;
        float nilaim,nilaik,nilait,nilaif,NilaiAkhir;
        float nm,nk,nt,nf;
        float b=0,k=100;
        do {
            Scanner a = new Scanner(System.in);
            System.out.println("!INPUTAN!");
            System.out.print("Mengulangi? (Ya/Tidak) : ");lagi = a.nextLine();
            System.out.print("Masukkan Nama Anda : ");nama = a.nextLine();
            System.out.print("Masukkan NIM Anda  : ");NIM = a.nextLine();
            System.out.print("Masukkan Nilai Mid : ");nilaim = a.nextFloat();
            System.out.print("Masukkan Nilai Kehadiran : ");nilaik = a.nextFloat();
            System.out.print("Masukkan Nilai Tugas : ");nilait = a.nextFloat();
            System.out.print("Masukkan Nilai Final : ");nilaif = a.nextFloat();

            nm=(float) (0.2*nilaim);
            nk=(float) (0.2*nilaik);
            nt=(float) (0.15*nilait);
            nf=(float) (0.35*nilaif);
            NilaiAkhir = nm+nk+nt+nf;

            if (NilaiAkhir>=50&&NilaiAkhir<65){
                grade="C";
            } else if (NilaiAkhir>=65&&NilaiAkhir<70){
                grade="B-";
            } else if (NilaiAkhir>=70&&NilaiAkhir<80){
                grade="B";
            } else if (NilaiAkhir>=80&&NilaiAkhir<85){
                grade="B+";
            } else if (NilaiAkhir>=85&&NilaiAkhir<90){
                grade="A-";
            } else if (NilaiAkhir>=90&&NilaiAkhir<99){
                grade="A";
            }

            System.out.println("!OUTPUT!");
            System.out.println("Nama : "+nama);
            System.out.println("NIM : "+NIM);
            System.out.println("Nilai Mid : "+nilaim);
            System.out.println("Nilai Kehadiran : "+nilaik);
            System.out.println("Nilai Tugas : "+nilait);
            System.out.println("Nilai Final : "+nilaif);
            System.out.println("Nilai Huruf : "+grade);
            System.out.println("Nilai Akhir : "+NilaiAkhir);
            System.out.println("\n");

            Total_NA+=NilaiAkhir;
            if (NilaiAkhir>b){
                namaMax=nama;
                b=NilaiAkhir;
            }
            if (NilaiAkhir<k){
                namaMin=nama;
                k=NilaiAkhir;
            }
            Total_Siswa+=1;
        } while (lagi.equalsIgnoreCase("Ya"));
        rata=Total_NA/Total_Siswa;
        System.out.println("=========================================");
        System.out.println("!NILAI TERBESAR!");
        System.out.println("Nama Siswa : "+namaMax);
        System.out.println("Nilai Akhir : "+b);
        System.out.println("\n!NILAI TERKECIL!");
        System.out.println("Nama Siswa : "+namaMin);
        System.out.println("Nilai Akhir : "+k);
        System.out.println("\nRata-Rata Nilai : "+rata);
        System.out.println("=========================================");



//        //no 2
//        int a = 1;
//        for (int i = 0; i<=100; i++){
//            a *= 3;
//            System.out.println("Pengulangan : "+a);
//        }
//
//
//
//        //no 3
//        int n,r,nr,Permutasi,Kombinasi;
//        int FakN,FakR,FakNR;
//        FakN=FakR=FakNR=1;
//        Scanner input=new Scanner(System.in);
//        System.out.print("Masukkan Nilai n : ");n=input.nextInt();
//        System.out.print("Masukkan Nilai r : ");r=input.nextInt();
//        nr=n-r;
//        for (int i = 1; i<=n; i++){
//            FakN*=i;
//        }
//        for (int i = 1; i<=r; i++){
//            FakR*=i;
//        }
//        for (int i =1; i<=nr; i++){
//            FakNR*=i;
//        }
//        Permutasi=FakN/FakR;
//        Kombinasi=FakN/FakNR-FakR;
//        System.out.println("Faktorial n : "+FakN);
//        System.out.println("Faktorial r : "+FakR);
//        System.out.println("Faktorial n-r : "+FakNR);
//        System.out.println("Kombinasi : "+Kombinasi);
//        System.out.println("Permutasi : "+Permutasi);
    }
}
