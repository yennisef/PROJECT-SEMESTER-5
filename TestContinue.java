public class TestContinue {
    public static void main (String argv[]){
        int i,j;
        j=50;
        for (i=5; i>0; i--){
            if(j>100)
            continue;
            j += 50;
            System.out.println("i= "+i);
        }
        System.out.println("program berhenti i="+i +"j=" +j);
    }
}
