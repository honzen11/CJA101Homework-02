package hw5;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Homework02_1 {	
	
	public static void starSquare(int width , int height) {
		
		for(int i = 0 ; i < height ; i++ ) {
			for(int j = 0 ; j < width ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬度:");
		int width = sc.nextInt();
		System.out.println("請輸入長度:");
		int height = sc.nextInt();
		starSquare(width,height);
	}


}
