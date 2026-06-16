package String;
import java.util.*;


public class m10_revStr {
public static void main(String[] args) {
        String str = "abcdefg";//bcdefga
        String ans="";
        int n=str.length()-1;
        char lastel=str.charAt(n);
        int k = 5;
            for (int j = 0; j < k; j++) {
                ans+=str.charAt(j);
            }
            ans+= lastel;
            System.out.println(ans );
    }
}
    
