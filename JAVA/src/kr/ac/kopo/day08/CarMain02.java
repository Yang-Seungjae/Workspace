package kr.ac.kopo.day08;

//실행 클래스
public class CarMain02 {

	void aaa() {
		
	}
	
	public static void main(String[] args) {
		
	
		
		Car c = new Car(); 
		c.model = "소나타";
		c.price = 3000;
		Car c2 = new Car();
		c2.model = "모닝";
		c2.price = 1900;
		Car c3 = new Car();
		c3.model = "테슬라";
		c3.price = 8000;
		
		
		Car[] carArr = {c, c2, c3}; // new Car[no]
		for(int i = 0; i < carArr.length; i++) {
			System.out.print("모델명 : " + carArr[i].model + ", 가격 : " + carArr[i].price + "\n");
		}

		
		
		
		
	}
}
