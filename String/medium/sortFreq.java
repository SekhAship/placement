package String.medium;
import java.util.*;;

public class sortFreq {
    public static void main(String[] args){
        String str= "raaaajj";
        String ans="";
        char[] arr= str.toCharArray();
        HashMap<Character,Integer>mp=new HashMap<>();
        for(char c: arr){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        // System.out.println(mp);
        // System.out.println(mp.keySet());
        List<Character> chars=new ArrayList<>(mp.keySet());
        chars.sort((a,b)->mp.get(b)-mp.get(a));
        // System.out.println(chars);
        // Arrays.sort();
        for(char i:chars){
            int count=mp.get(i);
            while (count>0) {
                ans+=i;
                count--;
                // System.out.println(ans);
            }
            //a-> c=4
            //ans="a" c=3
            // System.out.println(i);
        }
        System.out.println(ans);
    }
}
