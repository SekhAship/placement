package String;

public class m5_paranthesis {
    public static void main(String[] args) {
        String str="(()())(())";
        StringBuilder sb=new StringBuilder();
        int bal=0;
        for(char c: str.toCharArray()){
            if(c=='('){
                if(bal>0) sb.append(c);
                bal++;
            }else{
                bal--;
                if(bal>0) sb.append(c);
            }
        } 
        System.out.println(sb.toString());
    }
}
