package tugas;

public class StackClass {
    char[] stack = new char[2000];//isi Stack harus dalam bentuk Tipe Array
    int top; //deklarasi variabel top
    
    public void push (char angka) {
        stack[top]=angka;//itu yang tadi dari Classs utama saya ambilki baru saya taro' diposisi paling atas yang disebut top 
        top= top+1;// bertambah mi topnya 12     
    }
    public char pop () {
        char data;//sediakan 1 variabel untuk menampung data yang dikeluarkan dari Stack
        top--;// kurangi top terlebih dahulu
        data = stack[top];//keluarkan isi top dan masukkan ke dalam variabel data
        return data;
    }
    
    public void tampil() {
        for(int i = top-1;i>=0;i--) { //input menggunakan looping
            System.out.print(stack[i]+" ");
        }
    }
    
    
}   
