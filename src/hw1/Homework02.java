package hw1;

public class Homework02 {
	
	public static void main(String[] args) {

//		請設計一隻Java程式，計算12，6這兩個數值的和與積
		int A=12;
		int B=6;
		System.out.println(A+B);
		System.out.println(A*B);
//		• 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		int C=200; 
		int D=12;
		int sum= C/D;
		int sum1= C%D;
		System.out.println(sum+"打"+sum1+"顆");
//		• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int 秒=256559%60;
		int 分=256559/60%60;
		int 時=256559/60/60%24;
		int 天=256559/60/60/24;
		System.out.println(天+"天"+時+"時"+分+"分"+秒+"秒");
//		• 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		double 圓周率=3.1415;
		int 半徑=5;
		int 直徑=半徑*2;
		System.out.println("園面積"+半徑*半徑*圓周率);
		System.out.println("圓周長"+直徑*圓周率);
//		• 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
//		金加利息共有多少錢 (用複利計算，公式請自行google)
		int 存款=1500000;
		double 利率=0.02;
		int 年=10;
		double 複利值=Math.pow(1+利率,年);
		System.out.println("期末存款"+(double)存款*複利值);
//		• 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//		5 + 5
//		5 + ‘5’
//		5 + “5”
//		並請用註解各別說明答案的產生原因
		int num1=5;
		System.out.println(num1+num1); //這是定義的整數相加
		System.out.println(num1+'5');  //這是定義的整數加上獨特代碼的和
		System.out.println(num1+"5");  //這是定義的整數加上字元
	}

}
