package hw3;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] data = new int[3];
		System.out.println("輸入3個整數");

		for (int i = 0; i < 3; i++) {
			data[i] = sc.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			System.out.print(data[i] + " ");
		}
		if (data[0] == data[1] && data[1] == data[2]) {
            System.out.println("正三角形");
        } else if (data[0] == data[1] || data[1] == data[2] || data[0] == data[2]) {
            System.out.println("等腰三角形");
        } else {
            System.out.println("三角形");
        }
//		一邊長的平方等於另兩邊長的平方和，則此三角形為直角三角形。
	}
}
