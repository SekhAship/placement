import java.util.*;

public class may1_maxsubarraysum_prefixsum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=9;
        int n=arr.length;
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int count=0;
        map.put(0,1);
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        System.out.println(count);
    }
}
