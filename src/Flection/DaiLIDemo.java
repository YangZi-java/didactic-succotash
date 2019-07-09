package Flection;

import java.lang.reflect.Proxy;

public class DaiLIDemo {
	public static void main(String[] args) {
//		Student student = new StudentDaoimpl();
		Adjuster ad = new AdjusterDaoimpl();
		MyInvocationHandler handler = new MyInvocationHandler(ad);
		Adjuster proxy = (Adjuster) Proxy.newProxyInstance(ad.getClass().getClassLoader(), ad.getClass().getInterfaces(), handler);
		proxy.add();
		proxy.delete();
		proxy.look();
		proxy.modifiy();
	}
}
