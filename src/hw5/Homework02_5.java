package hw5;

import java.util.Random;

public class Homework02_5 {
	
	public static void main(String[] args) {
		System.out.println(genAuthCode());
	}
	
	public static String genAuthCode() {
		StringBuilder a = new StringBuilder();
		for(char i = 'A' ; i <= 'Z'; i++) {
			a.append(i);
		}
		for(char i ='a'; i<= 'z' ; i++) {
			a.append(i);
		}
		for(char i ='0' ; i<= '9' ; i++) {
			a.append(i);
		}
		String legal = a.toString();
		StringBuilder code = new StringBuilder();
		Random random = new Random();
		 for( int i = 0; i< 8 ; i++) {
			 int index = random.nextInt(legal.length());
			 code.append(legal.charAt(index));
		 }
		
		return code.toString();
	}

}
