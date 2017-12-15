public class TestCalc {
	
	public static void main(String[] args) {
		
		//class를 사용하기 위해서 객체(Object)를 생성
		
		Calc AAA = new Calc(); //생성자를 만들지 않아서,,,,
		
		
		
		int duhagi = AAA.add(Integer.parseInt(args[0]),Integer.parseInt(args[1])); 
		System.out.println(duhagi);
		
		int bbaegi = AAA.sub(3,4); 
		System.out.println(bbaegi);
		
		int gob = AAA.mul(3,4); 
		System.out.println(gob);
		
		int nanugi = AAA.div(8,4); 
		System.out.println(nanugi);
		
		
		
	}
}