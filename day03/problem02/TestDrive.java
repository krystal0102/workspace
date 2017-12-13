public class TestDrive {
	//프로그램의 시작점
	public static void main(String[] args){
		
		//객체(Object)
		Person sanghoon = 
			new Person(10, 177, "남자", 32, "정상훈", "A");
		
		// 배부르다.
		String result1 = sanghoon.eat("빵");
		System.out.println(result1);
		
		// 꿀잠잤다
		String result2 = sanghoon.sleep("쇼파");
		System.out.println(result2);
		
		// 도로위로 걷는다. ->return할 게 없으므로 변수 선언x
		sanghoon.walk("도로");
		
		// 여러분을 생각한다.
		sanghoon.think("여러분");
		
		// 12
		int result3 = sanghoon.add(5,7); 
		System.out.println(result3);
	}
	
}