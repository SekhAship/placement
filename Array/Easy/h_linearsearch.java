package Array.Easy;
public class h_linearsearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 3;
        int ans = help(arr, target);
        System.out.println(ans);

    }

    static int help(int arr[], int t) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == t) {
                return i;
            }
        }
        return -1;
    }
}
