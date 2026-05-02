//max subarray sum equal to k ka bruteforce solution

public class may1_maxsubarsum {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        //[1,2]
        //[3]
        int k=3;
        int sum;
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==k){
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}
