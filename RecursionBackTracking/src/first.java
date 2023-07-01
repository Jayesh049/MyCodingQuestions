import java.util.*;
import java.io.*;

public class first {
    int[] A = {5, -3, 0, -18, 1, 2, 0};
    public void sortNumbers(int[] A) {
        int a = 0;
        int b = A.length - 1;
        for (int i = 0; i < A.length && i <= b; i++) {
            int cur = A[i];
            if (cur < 0) {
                this.swap(A, i, a);
                a++;
            } else if (cur > 0) {
                this.swap(A, i, b);
                b--;
                i--;
            }
        }
    }

    private void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
}