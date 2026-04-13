import java.util.Arrays;

public class alargestelem {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8};
        int largest = findLargest(arr);
        System.out.println("The largest element in the array is: " + largest);
    }
    static int findLargest(int[] arr){
        int largest=arr[0];
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
