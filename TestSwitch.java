public class TestSwitch {
    public static void main (String argv[]){
        char c='_';
        switch (c){
            case '+':
            System.out.println("Operasi penjumlahan");
            break;
            case '_':
            System.out.println("operasi pengurangan");
            break;
            case '/':
            System.out.println("operasi pembagian");
            break;
            case '*':
            System.out.println("operasi perkalian");
            break;
            default:
            System.out.println("operasi tidak dikenal");
        }
    }
}
