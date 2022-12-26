package tugas.numerik;
import java.text.DecimalFormat;
public class MetodeBiseksi {
    double a, b, c, fa, fb, fc, error, tempC, x;
    int i=1;

    double fungsi (double x) {
        return (x * x * x)+(x * x)-(3 * x)-3;
    }

    public void hitung(double isiA, double isiB, double totalErr) {
        System.out.println(" METODE BISEKSI atau BAGI DUA ");
        DecimalFormat df = new DecimalFormat("0.0000");
        String tabel = "%-5s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %n";
        System.out.format(tabel, "i", "a", "b", "c", "fa", "fb", "fc", "fa * fb", "error");
        System.out.println("=========================================================================================");

        a = isiA;
        b = isiB;
        error = totalErr + 1;
        if (fungsi(a)*fungsi(b)<0) {
            while (Double.parseDouble(df.format(error)) > totalErr) {
                fa = fungsi(a);
                fb = fungsi(b);
                tempC = c;
                c = (a + b)/2;
                fc = fungsi(c);
                error = Math.abs((c - tempC) / c);
                x = fa * fc;
                System.out.format(tabel, i, df.format(a), df.format(b),
                        df.format(c), df.format(fa), df.format(fb),
                        df.format(fc), df.format(x), df.format(error));
                if (x > 0) {
                    b = c;
                } else if (x < 0) {
                    a = c;
                }
                i++;
            }
            System.out.println("akar persamaan c = "+df.format(c));
        }else {
            System.out.println("tidak ada akar persamaaan dalam interval berikut");
        }
    }
}
