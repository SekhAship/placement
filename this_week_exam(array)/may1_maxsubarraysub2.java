public class may1_maxsubarraysub2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k=9;
        int n=arr.length;
        int sum=0;
        int left=0;
        int c=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            while(sum>k){
                sum-=arr[left];
                left++;
            }
            if(sum==k){
                c++;
            }
        }
        System.out.println(c);
    }
}
