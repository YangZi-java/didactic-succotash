package Flection;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Properties;

public class FlectionDemo {
	public static void main(String[] args) throws Exception {
		//建议用二
		//获取class 文件对象 Class型之一
//		Person person = new Person();
//		Class c1= person.getClass();
//		//获取class 文件对象 Class型之二
//		Class c2 = Class.forName("Flection.Person");
//		//获取class 文件对象 Class型之三
//		Class c3 = Person.class;
//		System.out.println(c1==c3);
//		System.out.println(c2==c3);
//		Class c = Class.forName("Flection.Person");
//		Constructor[] cs = c.getConstructors();
//		//遍历获取所有公共修饰构造
//		for(Constructor cc:cs) {
//			System.out.println(cc);
//		}
		//获取所有构造方法
//		Constructor[] cs = c.getDeclaredConstructors();
//		for(Constructor cc:cs) {
//			System.out.println(cc);
//		}
		//获取指定构造方法
//		Constructor cs = c.getConstructor();
//		System.out.println(cs);
//		Constructor cs = c.getDeclaredConstructor(String.class,int.class);
//		cs.setAccessible(true);//取消java对修饰符的检查
//		Object obj = cs.newInstance("林青霞",25);
//		Person person = (Person)obj;
//		System.out.println(person);
//		System.out.println(cs);
		//获取成员变量，并修改值
//		Constructor cc = c.getDeclaredConstructor();
//		Object person = cc.newInstance();
//		Field name = c.getDeclaredField("name");
//		Field hometown = c.getDeclaredField("hometown");
//		Field age = c.getDeclaredField("age");
//		name.set(person,"林青霞");
//		hometown.set(person, "北京");
//		age.setAccessible(true);//取消java对修饰符的检查
//		age.set(person,28);
//		System.out.println(person);
//		Method mt = c.getDeclaredMethod("doing", String.class);
//		mt.setAccessible(true);
//		Object obj = mt.invoke(person, "hello");
//		System.out.println(obj);
//		String str = (String)obj;
//		System.out.println(str);
		//通过配置文件调用某个类的某个方法
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
		//使用反射绕过编译器对泛型语法检查
		ArrayList<Integer> arr = new ArrayList<Integer>();
//		arr.add(19);
//		arr.add(34);
//		arr.add("hello");这样是过不了编译器这关的
//		System.out.println(arr);
		Class c = arr.getClass();
//		Constructor cc = c.getConstructor();
//		Object obj = cc.newInstance();
		Method mt = c.getMethod("add",Object.class);
		mt.invoke(arr, "hello");
		System.out.println(arr);
		//这样就对arr写入了字符串数据
	}
}
