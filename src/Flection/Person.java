package Flection;

public class Person {
	

	public String name;
	private int age;
	public String hometown;
	public Person() {}
	public Person(String name, int age, String hometown) {
		super();
		this.name = name;
		this.age = age;
		this.hometown = hometown;
	}
	private Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println("show");
	}

	private void guess() {
		System.out.println("guess");
	}
	private String doing(String s) {
		return s+"doing";
	}
	public void love() {
		System.out.println("love life love java");
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", hometown=" + hometown + "]";
	}

}


