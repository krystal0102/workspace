public class TestPuppy {
	
	public static void main(String[] args) {
		
		Puppy duri = new Puppy("포메라니언","두리",2,"여");
		Puppy ddoddo = new Puppy("말티즈","또또",6,"남");
		
		boolean isEqual01 = duri.equals(ddoddo);
		System.out.println(isEqual01);
		
		
	}
}