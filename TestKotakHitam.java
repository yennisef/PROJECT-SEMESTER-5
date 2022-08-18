public class TestKotakHitam {
    public static void main (String argv[]){
        KotakHitam k1, k2;
        int vol1, luas1, pjg1, vol2, luas2, pjg2;
        k1=new KotakHitam (10,15,4,"Halo java");
        k2=new KotakHitam();
        vol1=k1.volume();
        luas1=k1.luas();
        pjg1=k1.getPanjang();
        System.out.println("kotak k1 luas= "+luas1+"volume= "+vol1+"panjang= "+pjg1);
        vol2=k2.volume();
        luas2=k2.luas();
        pjg2=k2.getPanjang();
        System.out.println("kotak k2 luas= "+luas2+"volume= "+vol2+"panjang= "+pjg2);
        k1.rekam("ada suara pesawat terbang");
        k2.rekam("ada tanda sirene dari arah utara");
        k1.putarRekaman();
        k2.putarRekaman();
    }
}
