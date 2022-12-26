package tugas.numerik;

public class MainClassNumerik {
    public static void main(String [] args){
        MetodeBiseksi mbs1=new MetodeBiseksi();
        mbs1.hitung(1, 2, 0.0001);

        System.out.println("\n");
        MetodeRegulaFalsi mrg1=new MetodeRegulaFalsi();
        mrg1.hitung(1,2,0.0001);

        System.out.println("\n");
        MetodeNewtonRepshon mnr = new MetodeNewtonRepshon();
        mnr.Hitung(3, 0.0001);

        System.out.println("\n");
        MetodeSecant ms = new MetodeSecant();
        ms.hitung(2.3,2.5,0.0001);

    }
}
