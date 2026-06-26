package Debu;

import java.util.HashMap;
import java.util.Map;

public class sun {
    
    public static void main(String[] args) {
        String inp="fri";
        int n=30;
        Map<String,Integer>mp=new HashMap<>();
        mp.put("sun",0);
        mp.put("mon",1);
        mp.put("tue",2);
        mp.put("wed",3);
        mp.put("thu",4);
        mp.put("fri",5);
        mp.put("sat",6);

        int elem=mp.get(inp);
     
        int c=0;
        for(int i=0;i<n;i++){
            if(elem==0){
                c++;
            }
            elem=(elem+1)%7;
        }
        System.out.println(c);
    }
}
