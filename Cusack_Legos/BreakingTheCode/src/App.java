package Cusack_Legos.BreakingTheCode.src;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        HardCodedArrays squares = new HardCodedArrays();
        int splitBy = 8; // 8 bin characters
        // Get all rotations of array
        int n = squares.top_left.length;
        //int[][] rr = RotateMatrix.rightRotate(squares.top_left, squares.top_left.length);
        // int[][] twoRR = RotateMatrix.rightRotate(rr, n);
        // int[][] lr = RotateMatrix.rightRotate(twoRR, n);

        parseMatrix(squares.top_left,splitBy);
    }

    public static void parseMatrix(int[][] mat, int splitBy){
        for (String bin : splitByN(mat, splitBy)) {
                // print out the character versions
                System.out.print((char) Integer.parseInt(bin, 2) + " " + Integer.parseInt(bin, 2) + " ");
            }
            System.out.println();
    }

    public static List<String> splitByN(int[][] square, int n) {
        List<String> letterArrs = new ArrayList<>();
        // Iterate through square matrix
        for (int i = 0; i < square.length; i++) {
            // define bin local variable
            String bin = "";
            // loop through cols
            for (int j = 0; j < square[0].length; j++) {
                // add current value to local var
                bin += square[i][j];

                // if our col is currently equal to our 'split index'
                // Then push the added string and reset it
                if (j + 1 == n) {
                    letterArrs.add(bin);
                    bin = "";
                }
            }
        }
        return letterArrs;
    }

    public static void printSquareValues(int[][] square) {
        for (int[] arr : square) {
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
