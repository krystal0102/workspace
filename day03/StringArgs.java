public class StringArgs {
	public static void main(String[] args) {
		//반복문
		for (int i=0; i < args.length; i++) {
			System.out.print(i + "번째 값:");
			System.out.println(args[i]);
		}
	}
}