package Array.Easy;

public class rotateEasy {
    public static void reverse(int[] arr,int start, int end){
        while (start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
            //1,2,3,4,5
            //5,2,3,4,1
            //5,4,3,2,1
        }
    }
    public static void main(String args[]){
        int[] arr={1,2,3,4,5};
        int k=2;
        int n=arr.length;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
