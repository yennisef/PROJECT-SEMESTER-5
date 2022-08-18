import  java.io.*;
public class balikkata {
	public static void main(String argv[]) throws IOException{
		String KATA, HASIL;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Masukkan KATA   : "); KATA= br.readLine();
		System.out.println("");
		System.out.print("Hasilnya Adalah : ");
		String [] result = KATA.split("\\s");
			for (int x=result.length-1; x>=0; x--)
			System.out.print(result[x]+" ");
	} 
}
