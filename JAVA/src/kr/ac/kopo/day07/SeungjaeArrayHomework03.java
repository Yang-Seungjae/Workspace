package kr.ac.kopo.day07;

import java.util.Scanner;

public class SeungjaeArrayHomework03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		int[] score = new int[5];// ���� �Է� ���� 5�� �����
		char[] grade = new char[5];// ���� ���� 5��
		int data = 0; // ���� ���Ҷ� ���� ����
		int errorcnt = 0;
		for(int i = 0; i < score.length; i++) {
			System.out.println((i+1)+"s ���� : " );
			score[i] = sc.nextInt();	
			}
		
		System.out.println(" < PRINT > ");
		System.out.println("��ȣ\t����\t����");
		
		
		
		for (char i = 0; i < score.length; i++) {
			if (0 <= score[i] && score[i] <= 100) {

				if (90 <= score[i]) {
					grade[i] = 'A';
				} else if (80 <= score[i]) {
					grade[i] = 'B';
				} else if (70 <= score[i]) {
					grade[i] = 'C';
				} else if (60 <= score[i]) {
					grade[i] = 'D';
				} else if (score[i] < 60) {
					grade[i] = 'F';
				}
				System.out.printf("%d\t" + "%d\t" + "%s\n", (i + 1), score[i], grade[i]);
				data+=score[i]; 
			} else {
				System.out.println("ERROR!!");
				errorcnt++;
			}
			
			
		}
		System.out.printf("%d�� �Է� �� [%d]ȸ �����߻�\n", score.length, errorcnt);
		System.out.println("���� : " +data);
		System.out.printf("��� : %.1f\n", (double)data/score.length);
		
		}	
		
	
	
	
	
	
	
}
