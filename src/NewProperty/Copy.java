package NewProperty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Copy extends Time {

	@Override
	public void code()  {
		// TODO Auto-generated method stub
		FileInputStream is=null;
		try {
			is = new FileInputStream("server.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileOutputStream os=null;
		try {
			 os = new FileOutputStream("abc.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] bytr = new byte[1024];
		int num;
		try {
			while((num=is.read(bytr))!=-1) {
				os.write(bytr);
				os.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
