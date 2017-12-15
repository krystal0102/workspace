public class TestDrive {
		public static void main (String[] args) {
			Student sujeong = 
			new Student(171213, "이수정", 25, "컴퓨터공학", 1);
			
			Student sanghoon = 
			new Student(171212, "정상훈", 32, "기계공학", 3);
			
			Student sangil = 
			new Student(171211, "김상일", 35, "물리학", 4);
			
			sujeong.study ();
			sujeong.introduce();
			
			sanghoon.study ();
			sanghoon.introduce();
			
			sangil.study ();
			sangil.introduce();
			
			
			//String을 사용한 경우
			//
			//String result1 = sujeong.study();
			//System.out.println(result1);
			//
			//String result2 = sujeong.introduce();
			//System.out.println(result2)
		}
}