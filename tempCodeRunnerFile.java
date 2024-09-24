import java.util.*;

public class InsertionSort {
    public static void main (String[] args) {
        int[] li = {5, 2, 4, 6, 1, 3};
        for (int j=1; j < li.length; j++) {
            insert(li, j);
        }
        System.out.println(Arrays.toString(li));
    }

    private static void insert(int A[],int j) {
        for (int i = j; i> 0; i--) {
            if (A[i] < A[i-1]) {
                int temp = A[i];
                A[i] = A[i-1];
                A[i-1] = temp;
            } else {
                break;
            }
        }
    }
}
