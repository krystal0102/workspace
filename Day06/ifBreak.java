public class ifBreak {
	//for과 ASCII코드를 이용해 HELLO 만들어보기
	public static void main(String[] args){
		
		for (char i =65; i < 91; i++) {
			//H 출력
			if (i == 'H') {
				System.out.print(i);
				break; //H를 찾으면 현재 돌고 있는 for문을 중단시켜줌. 종료!
			}	
		}
		
		for (char i =65; i < 91; i++) {
			//E 출력
			if (i == 'E') {
				System.out.print(i);
				break; 
			}	
		}
		
		for (char i =65; i < 91; i++) {
			//L 출력
			if (i == 'L') {
				System.out.print(i);
				System.out.print(i);
				break;
			}	
		}
		
		for (char i =65; i < 91; i++) {
			//O 출력
			if (i == 'O') {
				System.out.print(i);
				break;
			}	
		}
	}
}