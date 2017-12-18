public class JavaTypes {
	
	public static void main(String[] args) {
		
		// 분류		자료형		상수
		// 정수형	byte		-128 ~ 127
		// 정수형 	short		-32,768 ~ 32,767
		// 정수형	int(기본형)	십진수, 8진수, 16진수 (-2,147,483,648 ~ 2,147,483,647)
		// 정수형	long		32000L (숫자 뒤에 L을 붙임)
		// 실수형	float		(+,-)1.4E-45 ~ 3.4028235E38 ->1.4곱하기 E의-45승 ~ 3.4028235곱하기 E의 38승 (숫자뒤에 F를 붙임)
		// 실수형	double(기본형)(+,-)4.9E-324 ~ 1.7976931348623157E308 ->float보다 표현할 수 있는 범위가 넓음
		// 문자열	String		""으로 표기
		
		
		// 정수형
		int intValue = 0;
		int num01 = 10;
		int num02 = 010;	//8진수 8을 표기
		int num03 = 0x10;	//16진수 16을 표기
		byte bNum01 = -128;
		short sNum01 = -32768;
		long lNum01 = -2147483648L;
		
		
		System.out.println(intValue);
		System.out.println(num01);
		System.out.println(num02);
		System.out.println(num03);
		System.out.println(bNum01);
		System.out.println(sNum01);
		System.out.println(lNum01);
		
		//실수형
		float floatVal = 3.14f;
		double doubleVal = 256.12;
		
		System.out.println(floatVal);
		System.out.println(doubleVal);
		
		// 문자형
		String stringValue = "안녕하세용^^*";
		String bye = "안녕히계세요^ㅁ^";
		
		System.out.println(stringValue);
		System.out.println(bye);
		
		//문자
		char charVal = '야';
		System.out.println(charVal);
		
		//부울
		boolean isBoolt = true;
		boolean isBoolf = false;
		System.out.println(" " + isBoolt + 10);
		System.out.println(isBoolf);
		boolean result1 = 1 == 2; //1과 2는 같지 않으므로 false임. 따라서 변수 result는 false라고 출력됨
		boolean result2 = 1 != 2;
		System.out.println(result1);
		System.out.println(result2);
		
		
		//코드의 가독성을 높이기 위해 boolean 타입을 사용함
		boolean isEqualNumber = 10 == 11;
		boolean isEqualType = "삽살개" == "삽살개";
		boolean isEqualName = "달리" == "누렁";
		if (isEqualNumber && isEqualType && isEqualName) {
			
		}
		
		
		//형변환해보기
		byte byteRes = (byte)128; //()를 사용하여 int형을 강제로 byte형으로 형변환 할때, 
								  // 결과는 -128로 출력.  
								  // byte의 범위가 -128 ~ 127이므로 
								//	-128로 순환 
		System.out.println(byteRes);
		
		short shortRes = (short)32768; // int -> short 형변환 
		System.out.println(shortRes);
		
		float floatVal01 = 12.34F;
		int intVal01 = (int)floatVal01; //float -> int 형변환
		System.out.println(intVal01);
		
		int charNum = 'A'; // char -> int 형변환. 결과는 65로 출력됨. ASCII 코드에 따라 A는 65로 정해져있기 때문
		System.out.println(charNum);
		
		//숫자를 문자형으로 변환해서 A-Z까지 출력
		for (int i=65; i < 91; i++) {
			char char01 = (char)i;
			System.out.print(char01);
		}
		
		System.out.println();
		
		//다른 풀이
		for(char i = 65; i < 91; i++){
			System.out.print(i);
		}
		
		System.out.println();
		
		//구구단 5단 출력해보기
		for (int i=1; i<10; i++) {
			int gugu = 5 * i;
			System.out.println("5 * "+i+" = "+gugu);
		}
		
	}
}