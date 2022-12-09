package tugas;

import java.util.Scanner;

public class tugas2 {

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        String[] nama = new String[100], departemen = new String[100], jabatan = new String[100], jenis_kelamin = new String[100];
        int[] tanggungan = new int[100], jumlah_anak = new int[100], totalTJanak=new int[100], ttp=new int[100],tad=new int[100],tkd=new int[100],tkj=new int[100];
        int[][] usia_anak=new int[100][100];
        int jumlah_karyawan, totalgajikaryawan=0, KL = 0, KP = 0;
        double[] gaji=new double[100], gajibersih = new double[100], pajak=new double[100], tunjangan=new double[100];

        System.out.print("Masukkan jumlah karyawan : ");
        jumlah_karyawan = input.nextInt();
        for (int k = 0; k < jumlah_karyawan; k++) {
            System.out.println("ISI BIODATA KARYAWAN");
            nama[k]= input.nextLine();
            System.out.print("Nama karyawan : ");nama[k]= input.nextLine();
            System.out.print("Jenis kelamin : ");jenis_kelamin[k]= input.nextLine();
            System.out.print("Departemen : ");departemen[k]= input.nextLine();
            System.out.print("Jabatan : ");jabatan[k]= input.nextLine();

            if (departemen[k].equalsIgnoreCase("Keuangan")){
                tanggungan[k]= 17;
                System.out.print("Jumlah anak : ");jumlah_anak[k]= input.nextInt();
                totalTJanak[k]=0;
                for (int i=1;i<=jumlah_anak[k];i++){
                    System.out.print("Usia anak ke "+i+" : ");usia_anak[k][i]=input.nextInt();
                    if (usia_anak[k][i]<=tanggungan[k]){
                        totalTJanak[k]+=1;
                    }
                }
                tunjangan[k]=totalTJanak[k]*100000;
                ttp[1]+=tunjangan[k];
                tad[1]+=totalTJanak[k];
                tkd[1]+=1;
            } else if (departemen[k].equalsIgnoreCase("Tenaga Kerja")){
                tanggungan[k]= 20;
                System.out.print("Jumlah anak : ");jumlah_anak[k]= input.nextInt();
                totalTJanak[k]=0;
                for (int i=1;i<=jumlah_anak[k];i++){
                    System.out.print("Usia anak ke "+i+" : ");usia_anak[k][i]=input.nextInt();
                    if (usia_anak[k][i]<=tanggungan[k]){
                        totalTJanak[k]+=1;
                    }
                }
                tunjangan[k]=totalTJanak[k]*100000;
                ttp[2]+=tunjangan[k];
                tad[2]+=totalTJanak[k];
                tkd[2]+=1;
            } else if (departemen[k].equalsIgnoreCase("Kesehatan")){
                tanggungan[k]= 23;
                System.out.print("Jumlah anak : ");jumlah_anak[k]= input.nextInt();
                totalTJanak[k]=0;
                for (int i=1;i<=jumlah_anak[k];i++){
                    System.out.print("Usia anak ke "+i+" : ");usia_anak[k][i]=input.nextInt();
                    if (usia_anak[k][i]<=tanggungan[k]){
                        totalTJanak[k]+=1;
                    }
                }
                tunjangan[k]=totalTJanak[k]*100000;
                ttp[3]+=tunjangan[k];
                tad[3]+=totalTJanak[k];
                tkd[3]+=1;
            }

            if (jabatan[k].equalsIgnoreCase("Manajer")){
                gaji[k]=8000000;
                tkj[1]+=1;
            } else if (jabatan[k].equalsIgnoreCase("Admin")){
                gaji[k]=5000000;
                tkj[2]+=1;
            } else if (jabatan[k].equalsIgnoreCase("Kabag")){
                gaji[k]=3000000;
                tkj[3]+=1;
            }

            if (jenis_kelamin[k].equalsIgnoreCase("Laki laki")){
                KL+=1;
            } else if (jenis_kelamin[k].equalsIgnoreCase("Perempuan")){
                KP+=1;
            }

            pajak[k]=(gaji[k]+tunjangan[k])*0.02;
            gajibersih[k]=(gaji[k]+tunjangan[k])-pajak[k];
            totalgajikaryawan+=gajibersih[k];

            System.out.println("Nama karyawan : "+nama[k]);
            System.out.println("Gaji Bersih : "+gajibersih[k]+"\n");

        }

        System.out.println("========================================================");
        System.out.println("Jumlah tenaga kerja departemen keuangan : "+tkd[1]+" Karyawan");
        System.out.println("Jumlah tenaga kerja departemen tenaga kerja : "+tkd[2]+" Karyawan");
        System.out.println("Jumlah tenaga kerja departemen kesehatan : "+tkd[3]+" Karyawan");
        System.out.println();
        System.out.println("Jumlah tenaga kerja jabatan manajer : "+tkj[1]+" Karyawan");
        System.out.println("Jumlah tenaga kerja jabatan admin : "+tkj[2]+" Karyawan");
        System.out.println("Jumlah tenaga kerja jabatan kabag : "+tkj[3]+" Karyawan");
        System.out.println();
        System.out.println("Jumlah karyawan laki laki : "+KL+" Karyawan");
        System.out.println("Jumlah karyawan perempuan : "+KP+" Karyawan");
        System.out.println();
        System.out.println("Tanggungan anak departemen keuangan : "+tad[1]+" anak");
        System.out.println("Tanggungan anak departemen tenaga kerja : "+tad[2]+" anak");
        System.out.println("Tanggungan anak departemen kesehatan : "+tad[3]+" anak");
        System.out.println();
        System.out.println("Total tunjangan departemen keuangan : Rp."+ttp[1]);
        System.out.println("Total tunjangan departemen tenaga kerja : Rp."+ttp[2]);
        System.out.println("Total tunjangan departemen kesehatan : Rp."+ttp[3]);

        System.out.println("\nTotal semua gaji karyawan : Rp."+totalgajikaryawan);

    }
}