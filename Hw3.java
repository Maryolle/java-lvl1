/**
*Java1.Hw3
*
*@author Maryana Lapina
*@version 16/11/21
*/

import java.util.Arrays;

class Hw3 {

    public static void main (String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        int[] arrFive = takeValues(10, 8);
        System.out.println (Arrays.toString (arrFive));
    }

    static void invertArray() {
        int[] arrOne = { 1, 0, 1, 0, 0, 1 };
        int i;
        for (i = 0; i < arrOne.length; i++) {
            arrOne[i] = 1 - arrOne[i];
        }
        System.out.println (Arrays.toString(arrOne));
    }

    static void fillArray() {
        int[] arrTwo = new int[100];
        for (int i = 0; i < arrTwo.length; i++) {
            arrTwo[i] = i + 1;
        }
        System.out.println (Arrays.toString(arrTwo));
    }

    static void changeArray() {
        int[] arrThree = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arrThree.length; i++) {
            if (arrThree[i] < 6) {
                arrThree[i] *= 2;
            }
            System.out.println (Arrays.toString(arrThree));
        }
    }

    static void fillDiagonal() {
        int[][] arrFour = new int[4][4];
        for (int i = 0; i < 4; i++) {
            arrFour [i][i] = 1;
            arrFour[i][arrFour.length - i - 1] = 1;
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(Arrays.toString (arrFour[i]));
        }
    }
    static int[] takeValues(int len, int initialValue) {
        int[] arrFive = new int[len];
        Arrays.fill(arrFive, initialValue);
        return arrFive;
    }
}



