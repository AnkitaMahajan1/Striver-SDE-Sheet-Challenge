import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getInversions(long arr[], int n) {
       long[] ret = mergeSort(0, n - 1, arr);
        return ret[ret.length - 1];
    }

    public static long[] mergeSort(int i, int j, long[] arr) {
        if (i == j) {
            long[] lastIndex = new long[2];
            lastIndex[0] = arr[i];
            lastIndex[1] = 0;
            return lastIndex;
        }

        int mid = (i + j) / 2;
        long[] left = mergeSort(i, mid, arr);
        long[] right = mergeSort(mid + 1, j, arr);

        long[] mergeArr = merge(left, right);
        mergeArr[mergeArr.length - 1] = mergeArr[mergeArr.length - 1]
                + left[left.length - 1] + right[right.length - 1];
        return mergeArr;
    }

    public static long[] merge(long[] a, long[] b) {
        int n = a.length - 1 + b.length - 1;
        long[] res = new long[n + 1];
        int revCount = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < (a.length - 1) && j < (b.length - 1)) {
            if (a[i] > b[j]) {
                res[k] = b[j];
                j++;
                k++;
                revCount = revCount + ((a.length - i) - 1);
            } else if (a[i] < b[j]) {
                res[k] = a[i];
                i++;
                k++;
            }

        }

        while (i < a.length - 1) {
            res[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length - 1) {
            res[k] = b[j];
            j++;
            k++;
        }
        res[n] = revCount;
        return res;
    }
}
