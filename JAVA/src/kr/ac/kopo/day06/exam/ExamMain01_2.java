package kr.ac.kopo.day06.exam;

public class ExamMain01_2 {

	
	
	public static void main(String[] args) {
		
		int star = 1;
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i < 5) {
				star++;
			}else {
				star--;
			}
			//i < 5 ? star++ : star--; 이 의미로 if else
		}
			
		
		}
		
		
	}

