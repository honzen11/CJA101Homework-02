package hw4;

import java.util.Scanner;

public class Homework02_4 {
    public static void main(String[] args) {
        int[] a = {25, 32, 8, 19, 27};
        int[] b = {2500, 800, 500, 1000, 1200};

        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入欲借的金額: ");
        int borrow = sc.nextInt();

        method m = new method();
        m.Cmethod(a, b, borrow);

        sc.close();
    }

    static class method {
        public void Cmethod(int[] a, int[] b, int borrow) {
            String canBorrow = ""; 
            int count = 0; 
            for (int i = 0; i < a.length; i++) {
                if (b[i] >= borrow) {
                    canBorrow += a[i] + " "; 
                    count++;  
                }
            }

            if (count > 0) {
                System.out.println("有錢可借的員工編號: " + canBorrow + "共" + count + "人!");
            } else {
                System.out.println("沒有員工可以借錢給你。");
            }
        }
    }
}
