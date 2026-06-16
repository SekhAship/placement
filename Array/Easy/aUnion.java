package Array.Easy;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class aUnion {
    public static void main(String[] args) {
        int[] arr1 = { 5,4,3,2,1 };
        int[] arr2 = { 7, 7, 8,3, 4, 5, 6 };
        HashSet<Integer> st = new HashSet<>();
        for (int a : arr1) {
            st.add(a);
        }
        for (int b : arr2) {
            st.add(b);
        }
        System.out.println("answer is " + st);
    }

}
