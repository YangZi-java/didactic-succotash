package NewProperty;

public abstract class MiJu {
	private void MiJU() {}
	public static final MiJu m1 = new MiJu() {
		@Override
		public void message() {
			// TODO Auto-generated method stub
			System.out.println("ÖØÐ´ÄãµÄmessage");
		}
	};
	public static final MiJu m2 = new MiJu() {
		@Override
		public void message() {
			// TODO Auto-generated method stub
			System.out.println("duangduang");
		}
	};
	public static final MiJu m3 = new MiJu() {
		@Override
		public void message() {
			// TODO Auto-generated method stub
			System.out.println("alalalal");
		}
	};
	public void show() {
		System.out.println("I got your exampl");
	}
	public abstract void  message(); 
}
