package tugas.TVClassAndObject;

public class ClassOperasi {
    double nilai1, luas, nilai2;

    public void LuasPersegi (double n){
        nilai1 = n;
        luas = nilai1*nilai1;
    }

    public void Lingkaran (double jari){
        nilai1=jari;
        luas=3.14*nilai1*nilai1;
    }

    public void PersegiPanjang (double a, double b){
        nilai1= a;
        nilai2= b;

        luas=nilai1*nilai2;
    }

    public void LuasSegitiga (double a, double b){
        nilai1=a;
        nilai2=b;

        luas=0.5*nilai1*nilai2;
    }

    public void Tampil() {
        System.out.println("Luas adalah : "+luas);
    }
}
