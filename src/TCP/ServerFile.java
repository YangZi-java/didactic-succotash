package TCP;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFile {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(5647);
		while(true) {
		Socket s = ss.accept();
		BufferedInputStream br = new BufferedInputStream(s.getInputStream());
		BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream("xiaxia.jpg"));
		byte[] byt = new byte[1024];
		int num;
		while((num = br.read(byt))!=-1) {
			bw.write(byt,0,num);
			bw.flush();
		}
		BufferedWriter bwf = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		bwf.write("Õº∆¨“— ’µΩ");
		bwf.flush();
		bwf.close();
		s.close();	
		}
	}

}
