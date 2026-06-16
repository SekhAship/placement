package String;
import java.util.*;


public class m10_rotStr {
public static void main(String[] args) {
        String str = "abcdefg";//bcdefga
        String ans="";
        int n=str.length();
        char temp=str.charAt(0);
        
            for (int j = 1; j < n; j++) {
                ans+=str.charAt(j);
            }
            ans+= temp;
            System.out.println(ans);
    }
}
    
