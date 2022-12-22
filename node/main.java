package tugas.node;

public class main {

    public static void main (String[] args){
        
        operasi rantai= new operasi();

        rantai.tambah_depan(6);
        rantai.tambah_belakang(5);
        rantai.tambah_depan(8);
        rantai.tambah_belakang(4);
        rantai.tambah_depan(9);

        // Tugas
        rantai.tengah_urut(7);
        rantai.tengah_urut(3);
        
        rantai.tampil();
    }
    
}
