package tugas;

public class metnum {
    public static void main(String[] args) {
        double a1,a2,a3,b1,b2,b3,c1,c2,c3,h1,H1,h2,H2,h3,H3,T1,T2,T3;
        System.out.println("NAMA = MUHAMMAD ADIL SYAPUTRA \nKELAS = 3B INFORMATIKA \nNIM = 105841105721 \nLAHIR = 18 AGUSTUS (08)");
        System.out.println("\nTUGAS PEMODELAN DAN METODE NUMERIK");
        System.out.println("Rumus mencari Tinggi Bola(h)= -5t^2 + 20t + 6 ");
        System.out.println("Rumus mencari waktu (t) = -b (+-) √(b^2- 4ac)/2a");
        System.out.println("Mencari \nTinggi Bola(h) \nwaktu(t) \nSesuai dengan \n1. Tanggal lahir \n2. Bulan lahir \n3. NIM Dua digit \n");

        System.out.println("========================================================\n");

        // Memakai Tanggal Lahir
        System.out.println("1. Tanggal lahir 18 \nt=1\nh=8 ");
        T1 = 1;
        H1 = 8;
        a1 = -5 / H1;
        b1 = 20 / H1;
        c1 = 6 / H1;
        h1 = (double) -5 * Math.pow(T1, 2) + 20 * T1 + 6;
        System.out.println("h =  -5t^2 + 20t + 6\nh= -5*" + T1 + "^2+20*" + T1 + "+6\nh = " + h1);
        System.out.println("Hasil dari Tinggi jika t=" + T1 +" adalah =" + h1);
        double D1 = Math.pow(b1, 2) - 4 * a1 * c1;
        System.out.println();
        System.out.println("untuk h = " +H1+ "\nh =-5t^2 +20t +c\n" +H1+ " =-5t^2 +20t +c\n0 = (-5t^2 +20t +c)/"+ H1 +"\n");
        System.out.println("nilai a=-5/" +H1+ "=" + a1 + "\nnilai b=20/" +H1+ "=" + b1 + "\nnilai c=6/" +H1+ "=" + c1);
        System.out.println();
        double tp1 = -b1 - Math.sqrt(D1) / 2 * a1;
        double tm1 = -b1 + Math.sqrt(D1) / 2 * a1;
        System.out.println("t = -b (+-) √(b^2- 4ac)/2a\nt = " + b1 + "(+-)√" + "(" + b1 + "^2-4*" + a1 + "*" + c1 + ")/2*" + a1 + "\nt = -" + b1 + "-√" + D1 + "/2*" + a1 + "\nt(+) = " + tp1 + "\nt(-) = " + tm1);
        System.out.println("Hasil dari Waktu jika h = "+H1+" t=" + tp1 + " atau t=" + tm1);

        // Memakai Bulan Lahir
        System.out.println("\n2. Bulan lahir 08 \nt=0\nh=8 ");
        T2 = 0;
        H2 = 8;
        a2 = -5 / H2;
        b2 = 20 / H2;
        c2 = 6 / H2;
        h2 = (double) -5 * Math.pow(T2, 2) + 20 * T2 + 6;
        System.out.println("h =  -5t^2 + 20t + 6\nh= -5*" + T2 + "^2+20*" + T2 + "+6\nh = " + h2);
        System.out.println("Hasil dari Tinggi jika t=" + T2 +" adalah =" + h2);
        double D2 = Math.pow(b2, 2) - 4 * a2 * c2;
        System.out.println();
        System.out.println("untuk h = " +H2+ "\nh =-5t^2 +20t +c\n" +H2+ " =-5t^2 +20t +c\n0 = (-5t^2 +20t +c)/"+ H2 +"\n");
        System.out.println("nilai a=-5/" +H2+ "=" + a2 + "\nnilai b=20/" +H2+ "=" + b2 + "\nnilai c=6/" +H2+ "=" + c2);
        System.out.println();
        double tp2 = -b2 - Math.sqrt(D2) / 2 * a2;
        double tm2 = -b2 + Math.sqrt(D2) / 2 * a2;
        System.out.println("t = -b (+-) √(b^2- 4ac)/2a\nt = " + b2 + "(+-)√" + "(" + b2 + "^2-4*" + a2 + "*" + c2 + ")/2*" + a2 + "\nt = -" + b2 + "-√" + D2 + "/2*" + a2 + "\nt(+) = " + tp2 + "\nt(-) = " + tm2);
        System.out.println("Hasil dari Waktu jika h = "+H2+" t=" + tp2 + " atau t=" + tm2);

        // Memakai NIM
        System.out.println("\n3. NIM 105841105721 \nt=5\nh=7 ");
        T3 = 5;
        H3 = 7;
        a3 = -5 / H3;
        b3 = 20 / H3;
        c3 = 6 / H3;
        h3 = (double) -5 * Math.pow(T3, 2) + 20 * T3 + 6;
        System.out.println("h =  -5t^2 + 20t + 6\nh= -5*" + T3 + "^2+20*" + T3 + "+6\nh = " + h3);
        System.out.println("Hasil dari Tinggi jika t=" + T3 +" adalah =" + h3);
        double D3 = Math.pow(b3, 2) - 4 * a3 * c3;
        System.out.println();
        System.out.println("untuk h = " +H3+ "\nh =-5t^2 +20t +c\n" +H3+ " =-5t^2 +20t +c\n0 = (-5t^2 +20t +c)/"+ H3 +"\n");
        System.out.println("nilai a=-5/" +H3+ "=" + a3 + "\nnilai b=20/" +H3+ "=" + b3 + "\nnilai c=6/" +H3+ "=" + c3);
        System.out.println();
        double tp3 = -b3 - Math.sqrt(D3) / 2 * a3;
        double tm3 = -b3 + Math.sqrt(D3) / 2 * a3;
        System.out.println("t = -b (+-) √(b^2- 4ac)/2a\nt = " + b3 + "(+-)√" + "(" + b3 + "^2-4*" + a3 + "*" + c3 + ")/2*" + a3 + "\nt = -" + b3 + "-√" + D3 + "/2*" + a3+ "\nt(+) = " + tp3 + "\nt(-) = " + tm3);
        System.out.println("Hasil dari Waktu jika h = "+H3+" t=" + tp3 + " atau t=" + tm3);
    }
}
