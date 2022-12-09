package tugas;

import java.util.Scanner;

public class tugas4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double x3,y3,AC,BC;
        double[] X=new double[3], Y=new double[3];

        double[][] xy=new double[100][100];

        for (int i=0; i<3; i++){
            System.out.print("Masukkan nilai x : ");xy[i][0]=input.nextInt();
        }

//        for (int j=1; j<=2; j++){
//            System.out.print("Masukkan nilai X"+j+" : ");X[j]= input.nextDouble();
//            System.out.print("Masukkan Nilai Y"+j+" : ");Y[j]= input.nextDouble();
//        }
//
//        x3=X[2];
//        y3=Y[1];
//
//        AC=X[1]-x3;
//        BC=Y[2]-y3;

//        System.out.println("Nilai AC : "+AC);
//        System.out.println("Bilai BC : "+BC+"\n");
//
//        System.out.println("Hasil : "+Math.hypot(AC,BC));
    }
}
