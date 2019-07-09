package NewProperty;

public enum Student {
	JUNIOR("美国"){

		@Override
		public void showing() {
			// TODO Auto-generated method stub
			System.out.println("看不懂");
		}
		
	},SENIOR("英国"){

		@Override
		public void showing() {
			// TODO Auto-generated method stub
			System.out.println("看不懂");
		}
		
	},
	GRADUATE("中国"){

		@Override
		public void showing() {
			// TODO Auto-generated method stub
			System.out.println("看不懂");
		}
		
	};
	
	private String country;
	
//	private Student() {}
	private Student(String country) {
		this.country = country;
	}
	public String getCountry() {
		return country;
	}
	
	public void show() {
		System.out.println("我们都是好孩子，善良的好孩子");
	}	
	public abstract void showing();
	
}
