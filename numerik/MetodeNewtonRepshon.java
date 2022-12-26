package tugas.numerik;
import java.text.DecimalFormat;
public class MetodeNewtonRepshon {
    double a, b, fa, fb, error, tempB;
    int i=1;

    double fungsi1(double x){
        return (x * x * x)+( x * x)-(3 * x)-3;
    }

    double fungsi2(double x){
        return (3 * Math.pow(x, 2))+(2 * x) - 3;
    }

    public void Hitung(double isiA, double totalErr){
        System.out.println(" METODE NEWTON REPSON ");
        DecimalFormat df = new DecimalFormat("0.0000");
        String tabel = "%-5s %-10s %-10s %-10s %-10s %-10s %n";
        System.out.format(tabel, "i", "a", "b", "fa", "fb", "error");
        System.out.println("=========================================================");

        a = isiA;
        error = totalErr+1;


        while (Double.parseDouble(df.format(error))>totalErr){
            fa = fungsi1(a);
            tempB = b;
            b = a - (fa/fungsi2(a));
            fb = fungsi1(b);
            error = Math.abs((b-tempB)/b);

            System.out.format(tabel, i, df.format(a), df.format(b),
                    df.format(fa), df.format(fb), df.format(error));
            a = b;
            i++;
        }
        System.out.println(" Akar Persamaan B = "+df.format(b));
    }
}
