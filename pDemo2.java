public class pDemo2 extends P{ //merupakan subclass dari superclass P
    int b = 10; //inisiasi variabel b dengan tipe data integer bernilai 10
    public void cetak(){ //mencetak 
        System.out.println("class actual: b= "+b);//mencetak variabel b
        super.cetak(); //memanggil cetak di super class P
    }
    public static void main (String argv[]){
        pDemo2 P=new pDemo2();//inisiasi objek pada pdemo2
        P.cetak();//mencetak objek yang terdapat di superclass P
    }
}
