package Array.Medium;
import java.util.*;
public class m3_majority {
    public static void main(String[] args) {
        int [] arr= {0,0,1,1,1,1,1,1,2,2,2,};
        int n=arr.length;
        HashMap<Integer ,Integer> map= new HashMap<>();
        for(int elem:arr){
            map.put(elem,map.getOrDefault(elem,0)+1);
            if(map.get(elem)>n/2){
                System.out.println(elem);
            }
        }
        
    }
}
//  optimal version 