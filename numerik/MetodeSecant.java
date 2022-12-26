package tugas.numerik;
import java.text.DecimalFormat;
public class MetodeSecant {
    double a, b, fa, fb, c, fc, error, tempC;
    int i=1;

    double fungsi (double x) {
        return  (x * x * x) - (7 * x) + 1;
    }

    public void hitung (double isiA, double isiB, double totalErr) {
        System.out.println(" METODE SECANT ");
        DecimalFormat df= new DecimalFormat("0.0000");
        String tabel= "%-5s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %n";
        System.out.format(tabel, "i", "a", "b", "c", "fa", "fb", "fc", "error");
        System.out.println("==============================================================================");

        a= isiA;
        b= isiB;
        error= totalErr+1;

        while (Double.parseDouble(df.format(error))>totalErr) {
            fa = fungsi(a);
            fb = fungsi(b);
            tempC = c;
            c = b - ((fb*(a-b)) / (fa - fb));
            fc = fungsi(c);
            error = Math.abs((c - tempC) / c);

            System.out.format(tabel, i ,df.format(a), df.format(b),
                    df.format(c), df.format(fa), df.format(fb),
                    df.format(fc), df.format(error));

            a = b;
            b = c;
            i++;
        }
        System.out.println(" Akar Persamaan C = "+df.format(c));
    }

}
