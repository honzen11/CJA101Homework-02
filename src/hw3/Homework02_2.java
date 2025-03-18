package hw3;

import java.util.Scanner;

public class Homework02_2 {
	public static void main(String[] args) {
		
		 int secretNumber = (int) (Math.random() * 10); 
	        Scanner sc = new Scanner(System.in);
	        System.out.println("猜一個 0 到 9 之間的數字:");

	        int guess = -1; 


	        while (guess != secretNumber) {
	        	guess = sc.nextInt();
	            if (guess == secretNumber) {
	                System.out.println("恭喜你，猜對了！");
	            } else if (guess < secretNumber) {
	                System.out.println("猜錯了，數字太小了，再試一次:");
	            } else {
	                System.out.println("猜錯了，數字太大了，再試一次:");
	            }
	        }
	}

}
