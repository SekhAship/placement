package Array.Easy;
public class c_checkarray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 9, 3, 4, 5 };
        boolean ans = help(arr);
        System.out.println(ans);
    }

    static boolean help(int[] arr) {
        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                flag = false;
                break;
            }
        }
        return flag;

    }
}
