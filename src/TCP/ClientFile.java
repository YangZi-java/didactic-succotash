package TCP;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientFile {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("LAPTOP-I0RV3BSF",5647);
		BufferedInputStream br = new BufferedInputStream(new FileInputStream("linqingxia.jpg"));
		
		BufferedOutputStream bw = new BufferedOutputStream(s.getOutputStream());
		byte[] byt = new byte[1024] ;
		int num;
		while((num = br.read(byt))!=-1){
			bw.write(byt,0,num);
			bw.flush();
		}
		s.shutdownOutput();
		BufferedReader brf = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String message = brf.readLine();
		System.out.println(message);
//		brf.close();
//		br.close();
//		bw.close();
		
		
		
	}
}
