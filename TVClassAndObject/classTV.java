package tugas.TVClassAndObject;

public class classTV {
    int NilaiSuara, NilaiTerang;

    public void GantiChannel (int channel){
        if (channel == 1){
            System.out.println("Channel Anda berganti ke TVRI");
        }
        if (channel == 2){
            System.out.println("Channel Anda berganti ke MNC");
        }
        if (channel == 3){
            System.out.println("Channel Anda berganti ke Indosiar");
        }
        if (channel == 4){
            System.out.println("Channel Anda berganti ke RCTI");
        }
        if (channel == 5){
            System.out.println("Channel Anda berganti ke SCTV");
        }
        if (channel == 6){
            System.out.println("Channel Anda berganti ke ANTV");
        }
        if (channel > 6){
            System.out.println("Channel Tidak Terdaftar");
        }
    }

    public void TambahSuara (int suara){
        NilaiSuara += suara;
        if (NilaiSuara>=100){
            System.out.println("Suara yang ditambahkan terlalu keras");
        } else {
            System.out.println("Suara sekarang bertambah "+suara+" sehingga menjadi "+NilaiSuara);
        }
    }

    public void KurangSuara (int suara){
        NilaiSuara -= suara;
        if (NilaiSuara<=0){
            System.out.println("Suara yang ditambahkan terlalu kecil tidak bisa lebih kecil lagi");
        } else {
            System.out.println("Suara sekarang berkurang "+suara+" sehingga menjadi "+NilaiSuara);
        }
    }

    public void TambahTerang (int terang){
        NilaiTerang = NilaiTerang+terang;
        if (NilaiTerang>=100){
            System.out.println("TV Teralalu terang");
        } else {
            System.out.println("TV sekarang bertambah terang "+terang+" sehingga menjadi "+NilaiTerang);
        }
    }

    public void KurangTerang (int terang){
        NilaiTerang = NilaiTerang-terang;
        if (NilaiTerang<=0){
            System.out.println("TV Teralalu gelap");
        } else {
            System.out.println("TV sekarang bertambah gelap "+terang+" sehingga menjadi "+NilaiTerang);
        }
    }
}
