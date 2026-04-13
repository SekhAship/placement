import java.util.*;

public class a_largestelem {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 6, 4 };
        int max = help(arr);
        System.out.println(max);
    }

    static int help(int[] arr) {
        // code likho
        int max = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] > max) {
        // max = arr[i];
        // }
        // }
        Arrays.sort(arr);
        max = arr[arr.length - 2];
        return max;

    }
}
