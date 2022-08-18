public class pDemo1 {
    int b=10;
    public void cetak(){
        System.out.println("Class aktual: b= "+b);
    }
    public static void main (String[] args){
        pDemo1 p=new pDemo1();
        p.cetak();
    }
}
