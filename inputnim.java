import  java.io.*;
class inputnim {
public static void main(String[] args) throws IOException {
String NIM, HASIL;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Input NIM : "); NIM= br.readLine();
HASIL=NIM.replace('1','*');
	
   	System.out.println("NIM Menjadi : "+HASIL);
 	}	
}
