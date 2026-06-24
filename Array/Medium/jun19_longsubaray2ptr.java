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
        ///   
        int k=6;
        //              l     r
        int arr[] = {9, 3, 3, 0, 6, 5};
        int maxi=0;
        
        int left=0;
        int sum=0;
        
        for(int right=0;right<arr.length;right++){
            sum+=arr[right];
            if(sum==k){
                maxi=Math.max(maxi,right-left+1);
            }else if(sum>k){
                sum-=arr[left];
                left++;
            }
        }
        System.out.println(maxi);
    }
}
