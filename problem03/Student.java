class Student {
	// 속성; 인스턴스 변수(instance Variable), 멤버 변수(Member variable)
	int studentId;
	String name;
	int age;
	String major;
	int grade;
	
	
	public Student(int studentId, String name, int age, 
					String major, int grade){
						this.studentId = studentId;
						this.name = name;
						this.age = age;
						this.major = major;
						this.grade = grade;
					}
	// 괄호 안에 들어가는 것들을 parameter, argument 라고 한다.
	void study(){
		System.out.println(this.name +"이(가)" + this.major+ "공부를 한다" );
	}
	
	void introduce () {
		System.out.println (
		"저는 " + this.major+ this.grade + "학년 재학중인 " +
		+this.studentId +" "+ this.name + "입니다.");
	}
	
	//풀이, String을 사용할 경우!
	// String study() {
	// return this.name + "(이)가" + this.major + "공부를 한다.";
	// }

	//String introduce() {
    // return "저는" + this.major + "" + this.grade + "학년" + "재학중인" + this.name + "입니다.";
	//}

	
	
}
