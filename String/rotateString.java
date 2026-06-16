package String;
import java.util.Arrays;
public class rotateString{
    public static void helper(char[] arr,int start ,int end){
        while(start<end){
            char temp= arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
public static void main(String[] args) {
    // int [] arr = {1,2,3,4,5};
    String str="12345";
    int k =3;
    int n = str.length();
    char[] arr=str.toCharArray();
    helper(arr,0,n-1);
    helper(arr,0,k-1);
    helper(arr,k,n-1);
   
    System.out.println(Arrays.toString(arr));
    
   
}
}