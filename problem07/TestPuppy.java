public class TestPuppy {
	
	public static void main(String[] args) {
		
		Puppy duri = new Puppy("포메라니언","두리",2,"여");
		Puppy ddoddo = new Puppy("말티즈","또또",6,"남");
		
		boolean isEqual = duri.equals(ddoddo);
		
		
		if(isEqual){
			System.out.println("같은 강아지다");
		}
		
		else{
			System.out.println("다른 강아지다");
		}
	}
}