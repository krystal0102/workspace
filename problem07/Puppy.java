class Puppy {
	
	// 인스턴스 변수
	String type;
	String name;
	int age;
	String gender;
	
	//Constructor
	public Puppy(String type, String name, int age, String gender) {
		
		this.type = type;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	
	//비교 메서드 만들기
	boolean equals(Puppy p) {
		
		if (this.type == p.type) {
			if (this.name == p.name) { 
			//{}가 없으면 첫번째 줄만 if에 속한걸로 인식함
				
				return true;//강아지 종류와 이름이 같은 경우
			}
			
			return false; //강아지 종류는 같은데 이름이 다른 경우 "false"출력
		}
		
		return false; // 강아지 종류가 다르고 이름도 다른 경우
			
	}
}