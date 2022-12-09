package tugas;

public class Stack {

    public static void main(String[] args) {
        int data; //variabel luar stack 
        StackClass toples = new StackClass();

        System.out.println("<<<< MEMASUKKAN DATA >>>>");
        toples.push(5);
        toples.push(6);
        toples.push(3);
        toples.push(15);
        
        toples.tampil();
        data = 18;
        toples.push(data);
        
        System.out.println();
        toples.tampil();
        
        data = 25;
        toples.push(data);
        System.out.println();
        toples.tampil();

        toples.push(25);
        System.out.println();
        System.out.println("\n<<<< MENGELUARKAN DATA >>>>");
        toples.tampil();

        toples.pop();
        System.out.println();
        toples.tampil();

        toples.pop();
        System.out.println();
        toples.tampil();
        
        toples.pop();
        System.out.println();
        toples.tampil();
            
    }
    
}
