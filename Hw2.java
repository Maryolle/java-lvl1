/**
*Java1.Hw2
*
*@author Maryana Lapina
*@version 11/11/21
*/
class Hw2 {

    public static void main (String[] args) {
        System.out.println (sumIsWithin10And29 (10, 15));
        System.out.println (sumIsWithin10And29 (10, -4));
        System.out.println (sumIsWithin10And29 (-10, 20));
        
        posOrNeg(1);
        posOrNeg(-8);
        posOrNeg(0);
        
        System.out.println (ifNegThenTrue(-1));
        System.out.println (ifNegThenTrue(0));
        System.out.println (ifNegThenTrue(4));
        
        repeatString ("Abrakadabra", 8);
    }
    
    static boolean sumIsWithin10And29(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }
    
    static void posOrNeg(int a) {
        System.out.println(a >= 0? "Positive" : "Negative");
    }
    
    static boolean ifNegThenTrue (int a) {
        return a < 0;
    }
    
    static void repeatString (String s, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println (s);
        }
    }

}