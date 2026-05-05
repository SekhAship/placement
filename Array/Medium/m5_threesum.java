package Array.Medium;
import java.util.ArrayList;

public class m5_threesum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,0,-4};//124
        // ArrayList<Integer>ans=new ArrayList<>();
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        int target=0;
        int n=arr.length;
        //brute force
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){ 
                        ////O(n^3)
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        ArrayList<Integer>temp=new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        
                        ans.add(temp);
                    }
                    //[[1, 4],[2, 3]]
                }
            }
        }
        System.out.println(ans);
    }
}
