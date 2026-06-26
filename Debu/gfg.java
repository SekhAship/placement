package Debu;
import java.util.*;
/*
Input: str = "gfg"
Output: 7
Explanation: The seven distinct subsequences are "", "g", "f", "gf", "fg", "gg" and "gfg" 

*/
public class gfg {
   public static void main(String[] args) {
    String str ="gfg";
       ArrayList<String>list=new ArrayList<>();
       HashSet<String>set=new HashSet<>();
       list.add("");
       //"","g","f",

       for(char ch:str.toCharArray()){
            int size=list.size();
            for(int i=0;i<size;i++){ // yaha pe list.size() kam nhi karta hai isi liye durse var me store kara k rakhna;
                String el=list.get(i)+ch;//g
                // System.out.println(el);
                list.add(el);
                
            }
       }
       for(String s:list){
        set.add(s);
       }
    //    System.out.println(set);
       System.out.println(set.size());

    }
}
