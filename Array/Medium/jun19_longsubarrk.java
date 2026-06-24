package Array.Medium;

import java.util.HashMap;

public class jun19_longsubarrk {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,-1,1,1};
        HashMap<Integer,Integer>mp=new HashMap<>();

        int k=6;
        int maxLen=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                //length nikalne ka 1st formula
                maxLen=i+1;
            }
            //length nikalne ka 2nd formula
            //i-mp.get(sum-k)
            if(mp.containsKey(sum-k)){
                maxLen=Math.max(maxLen,i-mp.get(sum-k));
            }
            
            if(!mp.containsKey(sum)){
                mp.put(sum,i);
            }

        }
        System.out.println(maxLen);
    }
}
