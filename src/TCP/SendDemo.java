package TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SendDemo {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket(InetAddress.getByName("LAPTOP-I0RV3BSF"),3467);
		byte[] byt = "�����ٴ��ˣ�ʵ���ܲ���".getBytes();
		OutputStream opt = s.getOutputStream();
		opt.write(byt);
		s.close();
		
	}

}
