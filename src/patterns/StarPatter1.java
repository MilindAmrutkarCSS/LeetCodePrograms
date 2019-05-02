package patterns;

/**
 *  Pattern program
 *
 *          *
 *          **
 *          ***
 *          ***
 *          **
 *          *
 */

public class StarPatter1 {
    public static void main(String[] args) {
        int n = 6;

        for (int row = 0; row < n; row++) {
            if( row < n/2) {
                for (int column = 0; column <= row; column++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int column = n - row; column > 0; column--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}