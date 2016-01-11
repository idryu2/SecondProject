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

		System.out.printf("���� �ӵ�" + curSpeed + "����" + up + "��ŭ �����մϴ�.");
		System.out.println("����ӵ��� =" +(curSpeed+up));
	}
	

	void speedDown(int down) {
		
		System.out.printf("���� �ӵ�" + curSpeed + "����" + down + "��ŭ �����մϴ�.");
		System.out.println("����ӵ��� = " + (curSpeed-down));
	}

	public class SportsCar extends Car {
		void speedUp() {
			int up = 40;
			System.out.printf("(������ī) ���� �ӵ�" + curSpeed + "����" + up + "��ŭ �����մϴ�.");
		}
	
		void speedDown() {
			int down = 50;
			System.out.printf("(������ī) ���� �ӵ�" + curSpeed + "����" + down + "��ŭ �����մϴ�.");
		}
	}
	
	
	public static void main(String[] args) {
		Car vehicle1 = new Car();
		vehicle1.maker = "����ڵ���";
		vehicle1.model = "K3";
		vehicle1.color = "White";
		vehicle1.curSpeed = 100;
		vehicle1.speedUp(120);
		
		Car c1 = new Car();
		c1.maker = "����";
		c1.model = "�ƹݶ�";
		c1.color = "black";
		c1.curSpeed = 130;
		for(int i=20; i<35;i++){
			
			c1.speedDown(i);	
		}
		
	
		
		
	}
}