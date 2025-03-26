package hw4;

public class Homework02_3 {
    public static void main(String[] args) {
        String[] A = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
        String[] B = { "a", "e", "i", "o", "u" }; 

        int count = 0;  
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length(); j++) {
                char C = A[i].charAt(j);  
                
                for (String aeiou : B) {
                    if (String.valueOf(C).equals(aeiou)) { 
                        count++; 
                        break;
                    }
                }
            }
        }
        System.out.println("母音總數 = " + count);
    }
}
