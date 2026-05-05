package Array.Medium;
import java.util.ArrayList;
import java.util.HashMap;

public class m5_twosumopt {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};

        
        // ArrayList<Integer>ans=new ArrayList<>();
        HashMap<Integer,Integer>mp=new HashMap<>();
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        int k=5;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int temp=k-arr[i];
            if(mp.containsKey(temp)){
                // System.out.println(arr[i]+" "+temp);
                ArrayList<Integer>temp2=new ArrayList<>();
                    temp2.add(i);
                    temp2.add(mp.get(temp));
                    
                    ans.add(temp2);
            }
            mp.put(arr[i],i);
        }
        System.out.println(ans);
    }
}
