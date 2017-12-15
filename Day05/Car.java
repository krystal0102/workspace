class Car {
	
	String brand;
	String color;
	String type;
	int year;
	
	
	
	String Start(String engine) {
		String go = engine + "시동을 걸었다.";
		return go;
	}

	
	String change(String gear) {
		String trans = gear + "변환했다.";
		return trans;
	}
	
	String door(String open) {
		String moon = open + "을 열었다.";
		return moon; 
	}
	
	String accel(String speed) {
		String up = speed + "가속하였다.";
		return up;
	}
	
}