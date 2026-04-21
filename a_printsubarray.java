// bruteforce
// time complexity =o(n)^3
public class a_printsubarray {
    public static void main(String[] args) {
        int c = 0;
        int[] arr = { 1, 2, 3 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                }
                c++;
                System.out.println();

            }
        }
        System.out.println(c);
    }
}

///////////////////////////////////////////////////

// using two loops for the same question

// time complexity =o(n)^2
// public class a_printsubarray {

// public static void main(String[] args) {
// int[] arr={1,2,3};
// int c=0;
// for(int i=0;i<arr.length;i++){
// for(int j=i;j<arr.length;j++){
// // System.out.print(arr[j]+" ");
// c++;
// }
// }
// System.out.println(c);
// }
// }
// public static void printAllSubarraysWithSumK(int[] arr, int k) {
// int n = arr.length;
// for (int i = 0; i < n; i++) {
// int sum = 0;
// for (int j = i; j < n; j++) {
// sum += arr[j];
// if (sum == k) {
// System.out.println("Subarray with sum " + k + " found from index " + i + " to
// " + j + ".");
// }
// }
// }
// }