package hw4;

public class Homework02_1 {
	public static void main(String[] args) {
		int[] a = { 29 , 100 , 39 , 41, 50 , 8 , 66 , 77 , 95 , 15};
		int sum = 0;
		double average;
		
		for(int num: a) {
			sum +=num;
		}
	        average = (double) sum / a.length;
	        System.out.println("陣列的平均值：" + average);
	        System.out.print("大於平均值的元素：");
	        for (int num : a) {
	            if (num > average) {
	                System.out.print(num + " ");
	            }
		}
	}

}
