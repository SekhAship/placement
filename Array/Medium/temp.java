package Array.Medium;
import java.util.*;
class temp{
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,2,3};
        int k=5;
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();

        HashMap<Integer,Integer>mp=new HashMap<>();
        // ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        Set<ArrayList<Integer>>ans=new HashSet<>();
        int n=arr.length;

        for(int i=0;i<n;i++){
            int temp=k-arr[i];
            if(mp.containsKey(temp)){
                ArrayList<Integer>temp2=new ArrayList<>();
                // temp2.add(i);
                // temp2.add(mp.get(temp));
                temp2.add(arr[i]);
                temp2.add(temp);
                Collections.sort(temp2);
                ans.add(temp2);
            }
            mp.put(arr[i],i);
        }













        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         ArrayList<Integer>temp=new ArrayList<>();
        //         if(arr[i]+arr[j]==k){
        //             // System.out.println(i+" "+j);
        //             temp.add(arr[i]);
        //             temp.add(arr[j]);
        //             ans.add(temp);
        //             // ans.add(-1);
        //         }
        //     }

        // }
        System.out.println(ans);
        
    }
}