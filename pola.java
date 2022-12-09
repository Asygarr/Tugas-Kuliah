package tugas;

public class pola {
    public static void main(String[] args) {

        int Baris, NilaiBaris=48, PenguranganKolom=12, PenguranganBaris=12;
        for (int i = 1; i<=4; i++){
            Baris=NilaiBaris;
            for (int j = 1; j<=4; j++){
                System.out.print(Baris+" ");
                Baris-=PenguranganKolom;
            }
            System.out.println(" ");
            NilaiBaris-=PenguranganBaris;
            PenguranganKolom-=3;
        }


        System.out.println("\n");


        int a=1;
        for (int i = 1; i<=4; i++){
            for (int j = 1; j<4; j++){
                System.out.print(a++ + " ");
            }
            System.out.println(a--);
        }


        System.out.println("\n");


        int k=4;
        int baris1, nilaibaris1=25, pengurangankolom=5, penguranganbaris=10;
        int baris2, nilaibaris2=4, pertambahankolom=2, pertambahanbaris=3;
        for (int i=1; i<=7; i++){
            if (i<=3){
                baris1=nilaibaris1;
                for (int j=1; j<=k; j++){
                    System.out.print(baris1+" ");
                    baris1-=pengurangankolom;
                    pengurangankolom--;
                }
                nilaibaris1-=penguranganbaris;
                pengurangankolom=5;
                k--;
            } if (i>=4){
                baris2=nilaibaris2;
                for (int j=1; j<=k; j++){
                    System.out.print(baris2+" ");
                    baris2+=pertambahankolom;
                }
                nilaibaris2+=pertambahanbaris;
                if (nilaibaris2==13){
                    nilaibaris2+=3;
                }
                k++;
            }
            System.out.println(" ");
        }


        System.out.println("\n");


        for (int i=1; i<=7; i++){
            for (int j = 1; true; j++){
                System.out.print("* ");
                if (i==j){
                    break;
                } else if ((i+j)==8){
                    break;
                }
            }
            System.out.println(" ");
        }

    }
}
