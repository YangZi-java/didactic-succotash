package TCP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file = new FileOutputStream("getin.txt");
		ServerSocket ss = new ServerSocket(5673);
		Socket s = ss.accept();
		BufferedReader ir = new BufferedReader(new InputStreamReader(s.getInputStream()));
		while(true) {
			String str = ir.readLine();
			file.write(str.getBytes());
			System.out.println(str);
		}
	}

}
