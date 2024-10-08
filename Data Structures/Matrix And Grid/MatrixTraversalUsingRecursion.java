import java.util.*;
public class MatrixTraversalUsingRecursion {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        traverse(arr, 0, 0);
    }
    private static final int N = 3;
    private static final int M = 3;
    public static void traverse(int[][] arr, int i, int j){
        if(i == N-1 && j == M-1){
            System.out.println(arr[i][j]);
            return;
        }
        System.out.println(arr[i][j]+" ");
        if(j < M-1){
            traverse(arr, i, j+1);
        }
        else if(i<N-1){
            traverse(arr, i+1, 0);
        }
    }
}
