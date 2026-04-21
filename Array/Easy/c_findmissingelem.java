package Array.Easy;
public class c_findmissingelem {
    int[] arr = { 1, 2, 3, 5 };

    /// forloop o(n)////isi format pe
    /// in o(1)
    // n*n+1/2
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int n = arr.length + 1;
        int ex = n * (n + 1) / 2;
        System.out.println(ex - sum);
    }
}
