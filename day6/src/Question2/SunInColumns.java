package Question2;

public class SunInColumns {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < arr.length; i++) {
            int evenSum = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] % 2 == 0) {
                    evenSum = evenSum + arr[j][i];
                };
            };
            System.out.println("Sum of columns is: " +evenSum);
        };

    };
};
