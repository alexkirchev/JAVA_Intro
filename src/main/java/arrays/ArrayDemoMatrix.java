package arrays;

public class ArrayDemoMatrix {
    public static void main(String[] args) {
        int[][] intMatrix = {{4,6,9,11}, {0, 15, 55,9}};

        for (int i = 0; i < intMatrix.length; i++){
            for (int j = 0; j < intMatrix[i].length; j++){
                System.out.printf("Element in position %d%d is %d%n", i,j,intMatrix[i][j]);
            }
        }
    }
}
