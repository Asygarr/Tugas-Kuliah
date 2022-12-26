package tugas.numerik;

public class MainClassNumerik {
    public static void main(String [] args){
        MetodeRegulaFalsi mrg1=new MetodeRegulaFalsi();
        mrg1.hitung(1,2,0.00001);

        System.out.println("\n");
        MetodeBiseksi mbs1=new MetodeBiseksi();
        mbs1.hitung(1, 2, 0.000001);

//        System.out.println("\n");
//        MetodeNewtonRepshon mnr = new MetodeNewtonRepshon();
//        mnr.Hitung(1, 0.00001);
    }
}
