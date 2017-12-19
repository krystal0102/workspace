public class Break {
	
	public static void main(String[] args) {
		
		for (int i=0; i<10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//5까지만 출력해보기
		for (int i=0; i<10; i++) {
			if (i == 6) {
				break;
			}
			System.out.print(i + " ");
		}
	}
}