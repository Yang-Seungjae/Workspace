package kr.ac.kopo.day11;

public class HomeworkMain01 {

	public static void main(String[] args) {
		
		ScannerUtil scan = new ScannerUtil();
		
		
		char c = scan.nextChar("문자를 입력 : ");	
		StringUtil util = new StringUtil();
		// 대문자여부 판단
		boolean bool = util.isUpperChar(c);
		if(bool) {
			System.out.println(c + " : 대문자가 맞습니다" );
		} else {
			System.out.println(c + " : 대문자가 아닙니다" );
		}
		
		int num1 = scan.nextInt("첫번째 정수를 입력 : ");
		int num2 = scan.nextInt("두번째 정수를 입력 : ");
		int maxNum = util.max(num1, num2);
		System.out.println(num1 + ", " + num2 + "중 큰수 : " + maxNum);
		
		
		
		
		
		String str = scan.nextString("문자열을 입력 : ");
		String revStr = util.reverseString(str);
		System.out.println("str : " + str );
		System.out.println("revStr : " + revStr );
		String upperStr = util.toUpperString(str);
		System.out.println("대문자변환 : " + upperStr);
	}
}











