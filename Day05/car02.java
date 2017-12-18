class Car {
	
	String brand;
	String color;
	String type;
	int year;
	
	
	Public Car(String brand, String color, String type, int year){
		this.brand = brand;
		this.color = color;
		this.type = type;
		this.year = year;
	}
	
	
	void Start(String engine) {
		System.out.println(engine + "시동을 걸었다.");
	}
	
	void change(String gear) {
		System.out.println(gear + "으로 기어를 변환했다.");
	}
	
	void door(String open) {
		System.out.println(open + "을 열었다.");
	}
	
	void accel(String speed) {
		System.out.println(speed + "속도를 올렸다.");
	}
	
}