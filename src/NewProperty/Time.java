package NewProperty;

public abstract class Time {
	public void  getTime() {
		long before = System.currentTimeMillis();
		code();
		long now = System.currentTimeMillis();
		System.out.println(now-before+"����");
	}

	public abstract void code();
}
