import java.util.HashMap;


public class m10_iso {
    public static void main(String[] args) {
        HashMap<Character,Character> map = new HashMap<>();
        String str1="egx";   //e--->a
        String str2="add";  //a
        boolean ans=true;
        for(int i=0;i<str1.length();i++){
            char c1=str1.charAt(i);
            char c2=str2.charAt(i);
            // System.out.println(map);
            // System.out.println(c1+" "+c2);
            if(map.containsKey(c1)){
                if(map.get(c1)!=c2){
                    ans=false;
                    break;
                }
            }else{
                if(map.containsValue(c2)){
                    ans=false;
                    break;
                }
                map.put(c1,c2);
            }
        }
        System.out.println(ans);
    }
}
