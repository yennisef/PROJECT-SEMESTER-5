import java.io.*;

public class Compare {
	public static void main(String[] args) {
		String tabel[] = {"ari","gali","ika","rozi"};
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Berikan nama : ");
		System.out.flush();
		String nama = dis.readLine();

		for (int i=0; i<tabel.length; i++) {
			if(tabel[i].equals(nama)) {
				System.out.println(nama + " terdaftar dalam tabel");
				break;
			}
		}
	}
}
