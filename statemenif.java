import java.util.Scanner;
public class statemenif { //membuat class bernama statemenif
    public static void main (String argv[]) {
    Scanner input = new Scanner (System.in); //instansiasi objek input pada class statemenif

    int nilai; //mendefinisikan string nilai bertipe integer
    System.out.print("Masukkan nilai ujian [ 0 - 100 ]: "); 
    nilai = input.nextInt(); 
        if(nilai >80 && nilai <=100) 
            System.out.println("Nilai = A , Lulus - Memuaskan"); 
        else if(nilai >70 && nilai <=80) 
            System.out.println("Nilai = B, Lulus - Baik"); 
        else if(nilai>60 && nilai <=70) 
            System.out.println("Nilai ujian = C, Lulus - Cukup"); 
        else 
            System.out.println("Nilai ujian = D, Tidak Lulus - Tidak Memuaskan"); 
    } 
}
