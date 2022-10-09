package co.edureka.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.StringTokenizer;

public class ReadFile {

	public static void main(String[] args) throws Exception {
		FileInputStream fin = new FileInputStream("src/co/edureka/io/java.txt");
		
		/*
		System.out.println("no of characters to be read = " + fin.available());
		System.out.println((char)fin.read());
		System.out.println(fin.read());
		System.out.println("no of characters to be read = " + fin.available());
		*/
		
		/*
		//-- read file contents character-by-character
		int n = fin.read();
		while(n != -1) {
			System.out.print((char)n);
			Thread.sleep(100); //100 milliseconds
			n = fin.read();
		}
		*/
		
		/*
		//-- read file contents as a whole
		byte[] b = new byte[fin.available()];
		fin.read(b);
		String str = new String(b);
		System.out.println(str);
		*/
		
		/*
		//-- read file contents line-by-line
		Reader fileSource = new InputStreamReader(fin); //to convert byte stream to character stream
		BufferedReader br = new BufferedReader(fileSource);
		String line = br.readLine();
		while(line != null) {
			System.out.println(line);
			Thread.sleep(2000);
			line = br.readLine();
		}
		*/
		
		//-- read file contents word-by-word
		Reader fileSource = new InputStreamReader(fin);
		BufferedReader br = new BufferedReader(fileSource);
		String line = br.readLine();
		while(line != null) {
			StringTokenizer st = new StringTokenizer(line, " ");
			while(st.hasMoreTokens()) {
				String word = st.nextToken();
				System.out.print(word+"\t");
				Thread.sleep(1000);
			}
			System.out.println();
			Thread.sleep(2000);
			line = br.readLine();
		}		
		fin.close();
	}
}
