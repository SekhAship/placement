package String.medium;

public class romanToInt {
    public static int value(char c){
        //I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000
        // M = 1000, CM = 900, XC = 90 and IV = 4.
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
                
        
            default:
                break;
        }
        return 0;
    }
    public static void main(String[] args) {
        String  s = "LIV";
        int ans=0;
        //LV=55
        //IV=4
        //ek esa funcion 
        // L ----> function ---->50
        // V ----> function ---->5
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int val=value(c);
            if(i<s.length()-1 && s.charAt(i+1)>s.charAt(i)){
                ans-=val;
            }else{
                ans+=val;
            }
        }
        System.out.println(ans);
    }


    
}
