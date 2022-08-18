public class TestKotak {
    public static void main(String argv[]){
        Kotak kl;
        int vol,luas,pjg;
        kl=new Kotak();
        kl.setPanjang(10);
        kl.setLebar(15);
        kl.setTinggi(4);

        vol=kl.volume();
        luas=kl.luas();
        pjg=kl.getPanjang();
        System.out.println("kotak kl luas= "+luas+"volume= "+vol+"Panjang= "+pjg);
    }
}
