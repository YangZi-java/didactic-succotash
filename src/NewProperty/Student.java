package NewProperty;

public enum Student {
	JUNIOR("����"){

		@Override
		public void showing() {
			// TODO Auto-generated method stub
			System.out.println("������");
		}
		
	},SENIOR("Ӣ��"){

		@Override
		public void showing() {
			// TODO Auto-generated method stub
			System.out.println("������");
		}
		
	},
	GRADUATE("�й�"){

		@Override
		public void showing() {
			// TODO Auto-generated method stub
			System.out.println("������");
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
		System.out.println("���Ƕ��Ǻú��ӣ������ĺú���");
	}	
	public abstract void showing();
	
}
