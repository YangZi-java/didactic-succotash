package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class SendReflection {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		Socket s = new Socket("LAPTOP-I0RV3BSF",7745);
		byte[] byt = "这是有反馈的，可以交流的".getBytes();
		OutputStream os = s.getOutputStream();
		os.write(byt);
		InputStream is = s.getInputStream();
		byte[] bytr = new byte[1024];
		is.read(bytr);
		String str = new String(bytr,0,bytr.length);
		System.out.println(str);
		s.close();
		
	}

}
