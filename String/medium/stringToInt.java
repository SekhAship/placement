package String.medium;

public class stringToInt {
    // s = " -12345"
    public static void main(String[] args) {
        String s="4193 with words";
        // s = "4193 with words"  
        char[] arr=s.toCharArray();

        int ans=0;
        int flag=1;


        for(int i=0;i<arr.length;i++){
            
            if(Character.isAlphabetic(s.charAt(i))){
                continue;
            }

            if(arr[i]==' '){
                continue;
            }
            if(arr[i]=='+'){
                continue;
            }else if(arr[i]=='-'){
                flag=0;
                continue;
            }
            int temp=arr[i]-'0';
            ans=ans*10+temp;
        }
        // 0+'1'==> 0+27=27
        // int ans=124;
        if(flag==0){
            ans*=-1;
        }
        System.out.println(ans);
        // 124

    }
}
