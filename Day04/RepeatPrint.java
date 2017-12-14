public class RepeatPrint {
	
	public static void main(String[] args) {
		// ==은 length가 0과 똑같은지 비교할 때 쓰는것
		if (args.length == 0) {
			System.out.println("명령 구문이 올바르지 않습니다.");
			System.out.println("사용법:");
			System.out.println("java RepeatPrint [-options]");
			System.out.println("-message <출력할 메세지 입력>");
			System.out.println("-repeat <메세지 출력 반복횟수>");
		}
		
		
		//두번째 조건을 만들고 싶을때 else if 사용
		else if (args.length == 2) {
			
			//equals는 .앞의 값과 equals()안의 값을 비교하여 
			//참과 거짓에 따라 결과를 출력함.
			if (args[0].equals("-message")) {
				System.out.println(args[1]);
			}
		}
	}
}