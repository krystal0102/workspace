public class TestCalc {
	
	public static void main(String[] args) {
		
		Calc AAA = new Calc();
		
		int add = AAA.add(3,4); 
		System.out.println(add);
		
		int sub = AAA.sub(3,4); 
		System.out.println(sub);
		
		int mul = AAA.mul(3,4); 
		System.out.println(mul);
		
		int div = AAA.div(8,4); 
		System.out.println(div);
		
		
		
	}
}