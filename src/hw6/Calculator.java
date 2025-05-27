package hw6;

public class Calculator {
	
	
	public int powerXY(int x , int y) throws CalException {
		
		if(x==0 && y==0) {
			throw new CalException("0的0次方沒有意義");
		}
		if(y<0) {
			throw new CalException("次方為負值，結果");
		}
		int a = 1;
		
		for(int i = 1 ; i <= y ; i++) {
			a *=x;
		}
		
		return a;
	}
}
