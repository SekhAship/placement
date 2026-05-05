package String;

public class m5_rev {
  public static  void main(String[] args) {
    String s="   the sky is   pink  ";
    String[] word = s.split("\\s+"); 
    
    // for(String itr: word){
    //     System.out.print(itr);
    // }
    StringBuilder ans=new StringBuilder();
    for(int i=word.length-1;i>=0;i--){
        ans.append(word[i]);
        if(i!=0) ans.append(" ");
    }
    System.out.println(ans);
  }
}