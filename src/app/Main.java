package app;

public class Main {

    final static int N = 4;

    public static void main(String[] args) {

        int[][] twoDimArray = {
                {1, 3, 5, 7},
                {2, 4, 6, 8},
                {11, 13, 15, 17},
                {50, 45, 16, 9}
        };
        System.out.println("Matrix:");

        for ( int [] row : twoDimArray) {
            for ( int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
        int evenRows = 0;
        int oddRows = 0;

        for ( int i = 0; i < twoDimArray.length; i++) {
            for ( int j = 0; j < twoDimArray[i].length; j++) {
                if (i  % 2 == 0) {
                    evenRows += twoDimArray[i][j];
                } else {
                    oddRows += twoDimArray [i][j];
                }
            }
        }
        System.out.println("Sum of the even rows: " + evenRows);
        System.out.println("Sum of the odd rows: " + oddRows);

        int productEvenCols = 1;
        int productOddCols = 1;

        for (int i = 0; i < twoDimArray.length; i++) {
            for ( int j = 0; j < twoDimArray[i].length; j++) {
                if (j %2 == 0) {
                    productEvenCols *= twoDimArray[i][j];
                } else {
                    productOddCols *= twoDimArray[i][j];
                }
            }
        }
        System.out.println("Product of even columns: " + productEvenCols);
        System.out.println("Product of odd columns: " + productOddCols);

        boolean isMagSqr = true;

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < N; i++) {
            sum1 += twoDimArray[i][i];
            sum2 += twoDimArray[i][N - 1 - i];
        }
        if ( sum1 != sum2) isMagSqr = false;

        for (int i = 0; i < N; i++){
            int rowSum = 0;
            int colSum = 0;

            for (int j = 0; j < N; j++) {
                rowSum += twoDimArray[i][j];
                colSum += twoDimArray[i][j];
            }
            if (rowSum != colSum || colSum != sum1)
                isMagSqr = false;
        }
        if (isMagSqr)
            System.out.println("The matrix is a Magic Square");
        else
            System.out.println("The matrix is NOT a Magic Square");
    }
}
