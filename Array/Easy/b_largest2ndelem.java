package Array.Easy;
public class b_largest2ndelem {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 11, 4, 5, 9 };
        help(arr);
    }

    // max=1
    // smax=3
    static void help(int[] arr) {
        // code likho
        int max = arr[0];
        int smax = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                smax = max;
                max = i;
            } else if (i > smax && i != max) {
                smax = i;
            }
        }
        System.out.println(smax);

    }

}
