public class TestIfElse {
    public static void main (String argv[]){
        int a=10, b=13, x=0, y=0;
        if(a>b)
        x=a;
        else{
            x=b;
            y=100;
        }
        System.out.println("a="+a+"x="+x+"y="+y);

    }
}
