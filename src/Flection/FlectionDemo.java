package Flection;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Properties;

public class FlectionDemo {
	public static void main(String[] args) throws Exception {
		//�����ö�
		//��ȡclass �ļ����� Class��֮һ
//		Person person = new Person();
//		Class c1= person.getClass();
//		//��ȡclass �ļ����� Class��֮��
//		Class c2 = Class.forName("Flection.Person");
//		//��ȡclass �ļ����� Class��֮��
//		Class c3 = Person.class;
//		System.out.println(c1==c3);
//		System.out.println(c2==c3);
//		Class c = Class.forName("Flection.Person");
//		Constructor[] cs = c.getConstructors();
//		//������ȡ���й������ι���
//		for(Constructor cc:cs) {
//			System.out.println(cc);
//		}
		//��ȡ���й��췽��
//		Constructor[] cs = c.getDeclaredConstructors();
//		for(Constructor cc:cs) {
//			System.out.println(cc);
//		}
		//��ȡָ�����췽��
//		Constructor cs = c.getConstructor();
//		System.out.println(cs);
//		Constructor cs = c.getDeclaredConstructor(String.class,int.class);
//		cs.setAccessible(true);//ȡ��java�����η��ļ��
//		Object obj = cs.newInstance("����ϼ",25);
//		Person person = (Person)obj;
//		System.out.println(person);
//		System.out.println(cs);
		//��ȡ��Ա���������޸�ֵ
//		Constructor cc = c.getDeclaredConstructor();
//		Object person = cc.newInstance();
//		Field name = c.getDeclaredField("name");
//		Field hometown = c.getDeclaredField("hometown");
//		Field age = c.getDeclaredField("age");
//		name.set(person,"����ϼ");
//		hometown.set(person, "����");
//		age.setAccessible(true);//ȡ��java�����η��ļ��
//		age.set(person,28);
//		System.out.println(person);
//		Method mt = c.getDeclaredMethod("doing", String.class);
//		mt.setAccessible(true);
//		Object obj = mt.invoke(person, "hello");
//		System.out.println(obj);
//		String str = (String)obj;
//		System.out.println(str);
		//ͨ�������ļ�����ĳ�����ĳ������
//		Properties p = new Properties();
//		FileReader fr = new FileReader("peizhi.txt");
//		p.load(fr);
//		fr.close();
//		String classname = p.getProperty("classname");
//		String methodname = p.getProperty("methodname");
//		
//		Class c = Class.forName(classname);
//		Constructor cc = c.getConstructor();
//		Object obj = cc.newInstance();
//		Method mt = c.getMethod("love");
//		
//		mt.invoke(obj);
		//ʹ�÷����ƹ��������Է����﷨���
		ArrayList<Integer> arr = new ArrayList<Integer>();
//		arr.add(19);
//		arr.add(34);
//		arr.add("hello");�����ǹ����˱�������ص�
//		System.out.println(arr);
		Class c = arr.getClass();
//		Constructor cc = c.getConstructor();
//		Object obj = cc.newInstance();
		Method mt = c.getMethod("add",Object.class);
		mt.invoke(arr, "hello");
		System.out.println(arr);
		//�����Ͷ�arrд�����ַ�������
	}
}
