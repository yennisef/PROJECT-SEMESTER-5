public class StringOperasi {
    public static void main (String argv[]){
        String salam="Terima kasih, anda belajar java programing";
        String bagian=salam.substring(5,16);
        String satu="Satu", dua="Dua", tiga="Tiga";
        System.out.println(bagian);
        System.out.println(salam.toUpperCase());
        System.out.println(salam.toLowerCase());
        System.out.println(satu.compareTo("Satu"));
        System.out.println(satu.compareTo(dua));
        System.out.println(dua.compareTo(tiga));
    }
}
