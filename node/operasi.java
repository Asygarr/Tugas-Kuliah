package tugas.node;

public class operasi {
    node kepala;//inisialisasi node kepala 
    
     public void tambah_depan(int data) {
         node nodebaru= new node();//inisialisasi node baru
         nodebaru.data = data;//mengisi data dari main class ke dalam data di node baru
         nodebaru.next=null;//penunjukannya kosong (tidak menunjuk kemana2)

         if (kepala==null)//jika linked list kosong
         {
             kepala=nodebaru;//node baru jadi kepala
         }
         else
         {
             nodebaru.next=kepala;//node baru menunjuk ke node kepala
             kepala=nodebaru;
         }


     }

     public void tambah_belakang(int data){
         node nodebaru= new node();//inisialisasi node baru
         nodebaru.data = data;//mengisi data dari main class ke dalam data di node baru
         nodebaru.next=null;//penunjukannya kosong (tidak menunjuk kemana2)

         if (kepala==null)//jika linked list kosong
         {
             kepala=nodebaru;//node baru jadi kepala
         }
         else {
             node nodeBantuan=kepala;

             while (nodeBantuan.next!=null)//selama nodebantuan masih menunjuk ke node lain maka lakukan perulangan
             {
                 nodeBantuan=nodeBantuan.next;//nodebantuan menjadi apa yang ditunjuk oleh nodebantuan
             }
             nodeBantuan.next=nodebaru;//nodebantuan menunjuk ke node baru
         }
     }

     public void tambah_tengah(int posisi, int data){
         node nodebaru= new node();//inisialisasi node baru
         nodebaru.data = data;//mengisi data dari main class ke dalam data di node baru
         nodebaru.next=null;//penunjukannya kosong (tidak menunjuk kemana2)

         if (posisi==0)//jika linked list kosong
         {
             tambah_depan(data);
         }
         else
         {
             node nodebantuan=kepala;
             for (int i=0;i<posisi-1;i++) {
                nodebantuan=nodebantuan.next;
             }
             nodebaru.next=nodebantuan.next;//Node Baru menunjuk kepada node yang ditunjuk oleh node Bantuan
             nodebantuan.next=nodebaru;//node Bantuan menunjuk kepada Node baru
         }
     }

     // TUGAS
     public void tengah_urut (int data) {
         node nodebaru= new node();//inisialisasi node baru
         nodebaru.data = data;//mengisi data dari main class ke dalam data di node baru
         nodebaru.next=null;//penunjukannya kosong (tidak menunjuk kemana2)

         if (kepala==null)//jika linked list kosong
         {
             kepala=nodebaru;//node baru jadi kepala
         }
         else
         {
             node nodebantuan=kepala;
             while (nodebantuan.data-1 > nodebaru.data){
                nodebantuan=nodebantuan.next;
             }
             nodebaru.next=nodebantuan.next;//Node Baru menunjuk kepada node yang ditunjuk oleh node Bantuan
             nodebantuan.next=nodebaru;//node Bantuan menunjuk kepada Node baru
         }
     }

     public void tampil() {
        node nodeBantuan=kepala;
        while(nodeBantuan.next!=null)//Menggunakan Perulangan selama nodeBantuan Next tidak sama dengan Null
        {
            System.out.print(nodeBantuan.data+" ");//maka cetak/tampilka isinya
            nodeBantuan=nodeBantuan.next; //nodeBantuan berpindah menjadi apa yang ditunjuk oleh NodeBantuan Sebelumnya
        }

        System.out.println(nodeBantuan.data);//mencetak isi node belakang
    }

}
 
         
    

