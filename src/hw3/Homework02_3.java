package hw3;

import java.util.Scanner;

public class Homework02_3 {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("輸入不要的數字1-9:");
	    int dislike = scanner.nextInt();

	    if (dislike < 1 || dislike > 9) {
	        System.out.println("輸入錯誤 請輸入1-9的數字。");
	        return;
	    }

	    System.out.println("可以選擇的號碼：");
	    new Homework02_3().DontWant(dislike); 
	}

	
	public void DontWant(int dislike) {
		int sum=0;
	    for (int i = 1; i <= 49; i++) {
	        if (String.valueOf(i).contains(String.valueOf(dislike))) {
	            continue; 
	        }
	        System.out.print(i + " "); 
	        sum++;
	    }
	    System.out.println();
	    System.out.println("共"+sum+"個");
	}
	
}
