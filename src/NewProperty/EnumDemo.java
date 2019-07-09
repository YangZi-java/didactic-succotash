package NewProperty;

public class EnumDemo {
	public static void main(String[] args) {
//		Student s1 = Student.JUNIOR;
//		Student s2 = Student.SENIOR;
//		Student s3 = Student.GRADUATE;
//		s1.showing();
//		s2.showing();
//		s3.showing();
//		System.out.println(s1.compareTo(s2));
//		System.out.println(s1.compareTo(s3));
//		System.out.println(s1.ordinal());
//		System.out.println(s1.equals(s3));
//		System.out.println(s1.name());
//		System.out.println(s1);
//		System.out.println(s1.country);//竟然是null
//		System.out.println(s2.getCountry());
//		获取指定的枚举变量
//		Student sk = Student.valueOf(Student.class, "JUNIOR");
//		System.out.println(sk);
////		获取枚举中所有枚举变量，此方法API中没有，但可以使用
//		Student[] ss = Student.values();
//		for(Student s:ss) {
//			System.out.println(s);
//		}
		String bb = "he";
		switch(bb) {
		case "11":
			System.out.println("算了吧");
			break;
		case "12":
			System.out.println("好了吧");
			break;
		case "he":
			System.out.println("行吧");
			break;
		default:
			System.out.println("巴巴");
		
		}
		
	}

}
