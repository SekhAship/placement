package String;
public class m9_palopt {
     public static boolean pal(String str ){
        int start = 0;
        int end = str.length()-1;
        boolean ans=false;
        
      while(start<end){
        if(str.charAt(start)!=str.charAt(end)){
            return ans;
        }
        start ++;
        end--;
      }
        return true;
    }
    public static void main(String[] args) {
        String str="abaxyaba";
        System.out.println(pal(str));
    }
}
