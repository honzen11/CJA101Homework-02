package hw6;

import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) throws CalException {
		Scanner sc = new Scanner(System.in);
		Calculator a = new Calculator();
		try {
			System.out.println("請輸入 x 的值");
			int x = sc.nextInt();

			System.out.println("請輸入 y 的值");
			int y = sc.nextInt();
			System.out.println(a.powerXY(x,y));
		} catch (CalException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("輸入錯誤，請輸入整數!");
		}
		sc.close();
	}
}
