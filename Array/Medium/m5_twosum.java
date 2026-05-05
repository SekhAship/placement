package Array.Medium;
import java.util.ArrayList;

public class m5_twosum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        // ArrayList<Integer>ans=new ArrayList<>();
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        int k=5;
        int n=arr.length;
        //brute force
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){         ////O(n^2)
                if(arr[i]+arr[j]==k){
                    ArrayList<Integer>temp=new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    
                    ans.add(temp);
                }
                //[[1, 4],[2, 3]]
            }
        }
        System.out.println(ans);
    }
}
