package tugas.node;

public class main {

    public static void main (String[] args){
        
        operasi rantai= new operasi();

        rantai.tambah_depan(6);
        rantai.tampil();
        rantai.tambah_belakang(5);
        rantai.tampil();
        rantai.tambah_depan(8);
        rantai.tampil();
        rantai.tambah_belakang(4);
        rantai.tampil();
        rantai.tambah_depan(9);
        rantai.tampil();
        rantai.tambah_depan(11);
        rantai.tampil();

        System.out.println("\nTAMBAH TENGAH TERURUT");
        // Tugas
        System.out.print("7 : ");
        rantai.tengah_urut(7);
        rantai.tampil();
        System.out.print("3 : ");
        rantai.tengah_urut(3);
        rantai.tampil();
        System.out.print("10 : ");
        rantai.tengah_urut(10);
        rantai.tampil();

    }
    
}
