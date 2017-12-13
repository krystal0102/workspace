public class TestDrive {
		public static void main (String[] args) {
			Student sujeong = 
			new Student(171213, "수정", 25, "컴퓨터공학", 1);
			
			Student sanghoon = 
			new Student(171212, "상훈", 32, "기계공학", 2);
			
			Student sangil = 
			new Student(171211, "상일", 35, "물리학", 4);
			
			sujeong.study ();
			sujeong.introduce();
			
			sanghoon.study ();
			sanghoon.introduce();
			
			sangil.study ();
			sangil.introduce();
		}
}