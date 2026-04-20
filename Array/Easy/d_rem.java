package Array.Easy;

import java.util.*;

public class d_rem {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 1, 2, 3, 4 };
        Arrays.sort(arr);
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        // System.out.println(set);
        for (int i : set) {
            System.out.println(i);
        }
        // help(arr);

    }

    static void help(int[] arr) {
        // apna code likho
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}