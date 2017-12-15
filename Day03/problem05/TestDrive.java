public class TestDrive{
	
	public static void main (String[] args) {
		
		Board a =
		new Board (Integer.parseInt(args[0]),args[1],args[2],args[3],args[4]);
		
		//첫번째 값이 숫자이므로
		//타입을 변환하기 위해 Integer 클래스의 메소드를 호출하여
		//parseInt 값을 사용함
		
		String result = a.printBoard ();
		System.out.println(result);
		
	}
}