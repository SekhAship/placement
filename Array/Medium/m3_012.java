package Array.Medium;
import java.util.*;
public class m3_012 {
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr={1,2,0,1,0,2};
        // Arrays.sort(arr);
        int l=0,m=0,h=arr.length-1;
        while(m<=h){
            if(arr[m]==0){
                swap(arr,l,m);
                l++;
                m++;
            }else if(arr[m]==1){
                m++;
            }else{
                swap(arr,m,h);
                h--;
            }
        }
        for(int i=0;i<arr.length;i++){

            System.out.println(arr[i]);
        }
    }
}

