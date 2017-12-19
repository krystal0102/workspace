public class Array {
	
	public static void main(String[] args) {
		
		String mon = "월";
		String tue = "화";
		String wed = "수";
		String thr = "목";
		String fri = "금";
		String sat = "토";
		String sun = "일";
		
		System.out.print(mon);
		System.out.print(tue);
		System.out.print(wed);
		System.out.print(thr);
		System.out.print(fri);
		System.out.print(sat);
		System.out.print(sun);
		
		System.out.println();
		
		//배열 Array 을 만들어 보자. []배열이라는 뜻! -> 스트링 배열~
		
		//정적 배열
		String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
		//length를 이용해 weeks의 배열 크기를 조건문으로 작성 -> 숫자를 일일히 지정하지 않아도 됨
		for (int i=0; i<weeks.length; i++) {
			System.out.print(weeks[i]);
		}
		
		System.out.println();
		
		//동적배열
		String[] fruit = new String[3];
		fruit[0] = "사과";
		fruit[1] = "딸기";
		fruit[2] = "포도";
		for (int i=0; i<fruit.length; i++) {
			System.out.println(fruit[i]);
		}
		
		//2차원배열
		//정적 배열 -> 2차원이니까 []가 두개!
		String[][] person = {{"홍길동", "서울", "남자"}, {"홍길순", "부산", "여자"}};
		
		//Person[] p = new Person[3]; -> 클래스를 이용해서 배열값을 뽑아냄
		
		String result1 = person[0][0]; //홍길동
		String result2 = person[0][1]; //서울
		String result3 = person[1][2]; //여자
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		
		//배열이 두개이므로 length크기는 2. 또한 for를 사용할 때도 두개가 들어가야함
		for ( int i=0; i<person.length; i++) {
			for ( int j=0; j<person[i].length; j++) {
				System.out.println(person[i][j]);
			}
		}
		
		//동적배열 (과일 - 이름, 품질, 개수, 맛)
		String[][] fruitArray = new String[3][4];
		fruitArray[0][0] = "귤";
		fruitArray[0][1] = "상";
		fruitArray[0][2] = "10";
		fruitArray[0][3] = "상큼";
		
		fruitArray[1][0] = "사과";
		fruitArray[1][1] = "중";
		fruitArray[1][2] = "25";
		fruitArray[1][3] = "달콤";
		
		fruitArray[2][0] = "배";
		fruitArray[2][1] = "상";
		fruitArray[2][2] = "20";
		fruitArray[2][3] = "시원";
		
		System.out.println(fruitArray[0][0]); 
		
		// 위 2차원 배열을 for문을 이용하여 출력하세요
		// 출력형식 : 이름: 귤
		//			  품질: 상
		//			  개수: 10
		//			  맛: 상큼
		
		System.out.println();
		
		for (int i=0; i<fruitArray.length; i++) {
			
			for (int j=0; j<fruitArray[i].length; j++) {
				
				//if 다음에 사용하는 else는 분기점이라고 생각하면됨
				if ( j == 0 ) {
					System.out.print("이름 : ");
				}
				
				else if ( j == 1 ) {
					System.out.print("품질 : ");
				}
				
				else if ( j == 2 ) {
					System.out.print("개수 : ");	
				}
				
				else if ( j == 3 ) {
					System.out.print("맛 : ");
					
				}
				
				System.out.println(fruitArray[i][j]);
			}
			System.out.println();
		}
		
		
	}
}