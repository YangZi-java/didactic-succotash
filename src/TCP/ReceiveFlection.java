package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ReceiveFlection {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(7745);
		Socket s = ss.accept();
		InputStream is = s.getInputStream();
		byte[] byt = new byte[1024];
		is.read(byt);
		String name = s.getInetAddress().getHostName();
		String str = new String(byt,0,byt.length);
		System.out.println(str+name);
		OutputStream os = s.getOutputStream();
		os.write(" ’µΩ¡À£¨–ª–ª".getBytes());
		s.close();
		
	}
}
