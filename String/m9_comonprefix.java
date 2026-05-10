package String;
import java.util.Arrays;

public class m9_comonprefix {
    public static void main(String[] args) {
        // timer----> boo
        // String str1= "nilkadabba";
        // String str2= "nilofar";
        // String temp="";

        // for(int i=0;i<str1.length()-1 && i<str2.length();i++){
        //     if(str1.charAt(i)== str2.charAt(i)){
        //         //System.out.println(str1.substring(0,i+1));
        //         temp+=str1.charAt(i);
        //         // break;
        //     }
        // }
        // System.out.println(temp);

        // new questions:-
        //timer 10 min
         String[] str={"nillu","nile","nigin","niiii"};
         String temp="";
         Arrays.sort(str);
         String first=str[0];
         String second=str[str.length-1];
         for(int i=0;i<first.length() && i<second.length();i++){
            if(first.charAt(i)== second.charAt(i)){
                temp+=first.charAt(i);
                //  break;
            }
         }
         System.out.println(temp);    

    }
}
