package practice_nillu;

import java.util.HashMap;

public class appearOnce {
    public static void main(String[] args){
        int[] arr={1,1,2,3,3,4,4};



        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i:arr){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        //i->3
        // mp.get(i);

        System.out.println(mp);
        for(int i:arr){
    // for(int i:mp.keySet()){ ye v likh sakte hai upar wale ki jagah;
            if(mp.get(i)==1){
                System.out.println(i);
                break;
            }
        }
        //////////////////////////////////////////////////////////////////////
        ///////optimal//////////////////
        int ans=0;
        for(int i:arr){
            ans^=i;
        }
        System.out.println(ans);
    }
}
