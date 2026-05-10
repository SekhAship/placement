package String;
public class m9_largestoddnum {
    public static void main(String[] args) {
        String str="86723";
        for(int i =str.length()-1;i>=0;i--){
            int temp=str.charAt(i)-'0';
            if(temp%2 !=0){
                System.out.println(str.substring(0,i+1));
                break;
            }
        }
    }
}
