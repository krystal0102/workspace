public class TestPerson {
	  
	public static void main(String[] args) {
		
		Person sanghoon = new Person(861201, "정상훈", 32, "상도동");
		Person gildong = new Person(900421, "홍길동", 28, "서울");
		
		//결과를 담는 공간을 만들어보자
		boolean isEqual = sanghoon.equals(gildong);
		System.out.println(isEqual);
		
		boolean isEqual02 = gildong.equals(sanghoon);
		System.out.println(isEqual02);
		
		
	}
}