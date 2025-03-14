package hw2;

public class Homework02 {
	public static void main(String[] args) {
//		• 請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
		int sum = 0;
		for (int count = 0; count <= 1000; count += 2) {
			sum += count;
		}
		;
		System.out.println("1~1000的偶數和 = " + sum);
//		 • 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
		int sum1 = 1;
		for (int count = 1; count <= 10; count++) {
			sum1 *= count;
		}
		;
		System.out.println("1~10的乘積 = " + sum1);
//		 • 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
		int sum2 = 1;
		int count = 1;
		while (count <= 10) {
			sum2 *= count;
			count++;
		}
		System.out.println(sum2);
//		 • 請設計一隻Java程式，輸出結果為以下：
//		1 4 9 16 25 36 49 64 81 100
		for (int b = 0; b <= 10; b++) {
			System.out.print(b * b + " ");
		}
		System.out.println();
//		阿文很熱衷大樂透(1 ～49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//		輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		int a = 0;
		for (int c = 1; c <= 49; c++) {
			if (String.valueOf(c).contains("4")) {
				continue;
			}
			System.out.print(c + " ");
			a++;
		}
		System.out.println();
		System.out.println(a);
//			請設計一隻Java程式，輸出結果為以下：
//			1 2 3 4 5 6 7 8 9 10
//			 1 2 3 4 5 6 7 8 9
//			 1 2 3 4 5 6 7 8
//			 1 2 3 4 5 6 7
//			 1 2 3 4 5 6 
//			1 2 3 4 5
//			 1 2 3 4 
//			1 2 3 
//			1 2 
//			1

		for (int i = 10; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
//		請設計一隻Java程式，輸出結果為以下：
//		A
//		 BB
//		 CCC
//		 DDDD
//		 EEEEE
//		 FFFFFF
		for (int i = 0; i < 6; i++) {
			char letter = (char) ('A' + i);

			for (int j = 0; j <= i; j++) {
				System.out.print(letter);
			}
			System.out.println();
		}
	}
}
