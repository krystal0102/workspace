class PuppyAdv {
	
	// 인스턴스 변수
	String type;
	String name;
	int age;
	String gender;
	
	//Constructor
	public PuppyAdv(String type, String name, int age, String gender) {
		
		this.type = type;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	
	// 연산자 우선순위 
	// 0. && : 논리곱, ||논리합
	// 1. = - * /
	// 
	
	//puppy.java의 경우 if값이 중괄호 안에 중복되게 들어가므로 가독성 떨어짐
	//if문 하나만 쓰고 equals 가독성 좋게 개선하기!! ->&&를 이용한다
	boolean equals(PuppyAdv p) {
		// 컴퓨터 연산자에서 우선순위는 ==먼저하고 &&
		if (this.type == p.type && this.name == p.name) {
			return true;
		}
		return false; 
			
	}
}