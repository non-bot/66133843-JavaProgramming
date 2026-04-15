package nqtien;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class VDDocStream {
	public static void main(String[] args) throws IOException{
		FileInputStream fInput = new FileInputStream("src/nqtien/tho.txt");
		InputStreamReader ipReader = new InputStreamReader(fInput);
		BufferedReader bufRead = new BufferedReader(ipReader);
		System.out.println("Tho trong file:");
		String lineDocDuoc = bufRead.readLine();
		while (lineDocDuoc != null) {
			System.out.println(lineDocDuoc);
			lineDocDuoc = bufRead.readLine();			
		}
	}
}
