import java.util.Scanner;
public class array3d {
    public static void main(String[] args) {

        // Membuat Array dan Scanner
        String[][] nama = new String[3][3];
        Scanner scan = new Scanner(System.in);

        // mengisi setiap meja
        for(int bar = 0; bar < nama.length; bar++){
            for(int kol = 0; kol < nama[bar].length; kol++){
                System.out.format("Nama yang lulus ujian (%d,%d): ", bar, kol);
                nama[bar][kol] = scan.nextLine();
            }
        }

        // menampilkan isi Array
        System.out.println("-------------------------");
        for(int bar = 0; bar < nama.length; bar++){
            for(int kol = 0; kol < nama[bar].length; kol++){
                System.out.format("| %s | \t", nama[bar][kol]);
            }
            System.out.println("");
        }
        System.out.println("-------------------------");
    }
}
