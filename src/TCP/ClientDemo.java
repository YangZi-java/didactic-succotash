package TCP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("LAPTOP-I0RV3BSF",5673);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		String line = null;
		while((line=br.readLine())!=null) {
			if(line.equals("over")) {
				break;
			}
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		s.close();
	}
}
