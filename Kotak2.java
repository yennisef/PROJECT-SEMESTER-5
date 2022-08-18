public class Kotak2 {
    private int panjang, lebar, tinggi;
    public Kotak2(){
        panjang=0;
        lebar=0;
        tinggi=0;
    }
    public Kotak2 (int pjg, int lbr, int tg){
        panjang=pjg;
        lebar=lbr;
        tinggi=tg;
    }
    public void setpanjang(int pjg){
        panjang=pjg;
    }
    public void setLebar(int lbr){
        lebar=lbr;
    }
    public void setTinggi(int tg){
        tinggi=tg;
    }
    public int getPanjang(){
        return panjang;
    }
    public int getLebar(){
        return lebar;
    }
    public int getTinggi(){
        return tinggi;
    }
    public int luas(){
        int hasil;
        hasil=2*panjang*lebar+2*panjang*tinggi+2*lebar*tinggi;
        return hasil;
    }
    public int volume(){
        int hasil;
        hasil=panjang*lebar*tinggi;
        return hasil;
    }
}
