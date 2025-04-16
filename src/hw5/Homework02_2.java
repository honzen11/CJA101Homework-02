package hw5;

import java.util.Random;

public class Homework02_2 {
	public static void randAvg() {
		Random random = new Random();
		int[] number = new int[10];
		int sum = 0;
		
		for(int i = 0 ; i < number.length ; i++ ) {
			number[i] = random.nextInt(101);
			sum += number[i];
		}
		for(int num : number ) {
			System.out.print(num+" ");
		}
		double average = sum/10;
		System.out.println("平均數="+average);
		
	}
	public static void main(String[] args) {
		randAvg();
		
	}
}
