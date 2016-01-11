package test;
public class Car {
	
	private String maker, model, color;
	private int curSpeed;


	public Car() {
		maker = "";
		model = "";
		color = "";
		curSpeed = 0;
	}
	
	
	void speedUp(int up) {

		System.out.printf("현재 속도" + curSpeed + "에서" + up + "만큼 가속합니다.");
		System.out.println("현재속도는 =" +(curSpeed+up));
	}
	

	void speedDown(int down) {
		
		System.out.printf("현재 속도" + curSpeed + "에서" + down + "만큼 감속합니다.");
		System.out.println("현재속도는 = " + (curSpeed-down));
	}

	public class SportsCar extends Car {
		void speedUp() {
			int up = 40;
			System.out.printf("(스포츠카) 현재 속도" + curSpeed + "에서" + up + "만큼 가속합니다.");
		}
	
		void speedDown() {
			int down = 50;
			System.out.printf("(스포츠카) 현재 속도" + curSpeed + "에서" + down + "만큼 감속합니다.");
		}
	}
	
	
	public static void main(String[] args) {
		Car vehicle1 = new Car();
		vehicle1.maker = "기아자동차";
		vehicle1.model = "K3";
		vehicle1.color = "White";
		vehicle1.curSpeed = 100;
		vehicle1.speedUp(120);
		
		Car c1 = new Car();
		c1.maker = "현대";
		c1.model = "아반떼";
		c1.color = "black";
		c1.curSpeed = 130;
		for(int i=20; i<35;i++){
			
			c1.speedDown(i);	
		}
		
	
		
		
	}
}