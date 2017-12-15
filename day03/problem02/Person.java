class Person {
		// 속성
		int headSize;	// 머리크기		(숫자)
		int height;		// 키 			(숫자)
		String gender;	// 성별 		(문자)
		int age;		// 나이 		(숫자)
		String name;	// 이름 		(문자)
		String family;	// 가족 		(문자)
	

		// 생성자(Constructor) (클래스의 속성 값들을 초기화) -> return할 수 없음!
		public Person(int headSize, int height, String gender, 
			int age, String name, String family) {
			this.headSize = headSize;
			this.height = height;
			this.gender = gender;
			this.age = age;
			this.name = name;
			this.family = family;	
		}
	
		// 메서드 (Method) -> 행동을 나타내는 것
		// 무엇을 먹는다 ( 배부르다, 배고프다 )
		String eat(String food) {
			if (food.equals("빵")) {
				return "배부르다";
			}
			else {
				return "배고프다.";
			}
		}
		
		// 어디에서 잔다 ( 꿀잠잤다, 피곤하다 )
		String sleep(String where) {
			if (where.equals("땅바닥")) {
				return "피곤하다";
			}
			else {
				return "꿀잠잤다";
			}
		}
		
		// 어디위로 걷는다
		void walk (String where) {
			System.out.println(where + "위로 걷는다.");
		}

		// 무엇을 생각한다
		void think(String how) {
			System.out.println(how + "을(를) 생각한다.");
		}
		
		// 숫자 a와 숫자b를 더하는 메서드
		int add(int a, int b) {
			return a + b; 
		}
}