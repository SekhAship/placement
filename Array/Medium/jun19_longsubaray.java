package Array.Medium;

public class jun19_longsubaray2ptr {
    

// Example 1:
// Input:             0   1  2   3  4   5
//  N = 6, array[] = {9, -3, 3, -1, 6, -5}  
// Result:
//  5  
// Explanation:
//  The following subarrays sum to zero:
// - {-3, 3}
// - {-1, 6, -5}
// - {-3, 3, -1, 6, -5}
// The length of the longest subarray with sum zero is 5.


    public static void main(String[] args) {
        int arr[] = {9, -3, 3, -1, 6, -5};
        int length=0;
        int maxi=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==0){
                    length=j-i+1;
                    maxi=Math.max(maxi,length);
                }
            }
        }
        System.out.println(maxi);
    }
}
