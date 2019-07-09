package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ReciveDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(7865);
		Socket s = ss.accept();
		InputStream ips = s.getInputStream();
		String ip = s.getInetAddress().getHostName();
		byte[] byt = new byte[1024];
		ips.read(byt);
		String str = new String(byt,0,byt.length);
		System.out.println(ip+str);
		
		
	}
}
