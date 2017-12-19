public class Movie {
	
	public static void main(String[] args) {
		
		int[][] seats = {{0,0,0,0}, {0,1,0,0},{0,0,1,0},{0,0,1,1}};
		
		//1. args에서 값을 받아온다
		// 풀이) String A = args[0];
		//		 String B = args[1];
		//2. A,B를 숫자로 변경
		// int a = Integer.parseInt(A);
		// int b = Integer.parseInt(B);
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		//3.seats배열에 접근해서 값을 가져온다
		// int result = seats[a][b];
		//4.if를 사용하여 0이면 예약가능, 1이면 예약불가 
		// if (result == 0 ) {
		//	System.out.println("예매가 가능한 좌석입니다.");
		//	}
		//	if (seats[a][b] == 1) {
		//	System.out.println("예매가 불가능한 좌석입니다.");
		//	}
		if (seats[a][b] == 0) {
		System.out.println("예매가 가능한 좌석입니다.");
		}
			
		if (seats[a][b] == 1) {
		System.out.println("예매가 불가능한 좌석입니다.");
		}
	
	} 
}