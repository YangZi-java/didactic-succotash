package Flection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	public Object target;
	
	public MyInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Ȩ��У��");
		Object obj = method.invoke(target, args);
		System.out.println("���ʼ�¼");
		return obj;//���ص��Ǵ������
	}

}
