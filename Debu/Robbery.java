package Debu;

import java.util.Arrays;

public class Robbery {
    public static int chor(int[] arr,int n,int[] dp){
        // 9,9,8,29
        if(n<0) return 0;//n=-1
        if(n==0) return arr[0];
        // i=n
        //sum=sum+arr[i]
        //n--;

        if(dp[n]!=-1){// dp bhara hua hai then jo hai return karo
            return dp[n];
        }
        
        int include=chor(arr,n-2,dp)+arr[n];
        int exclude=chor(arr,n-1,dp);
        int maxi=Math.max(include,exclude);

        dp[n]=maxi;//dp k andar kuch nhi hai to fir value dalo

        return maxi;
    }

{
        
    }    public static void main(String[] args) {
        int[] arr={9,9,8,29};//n=0
        int n=arr.length;

        int[] dp=new int[n];
    
    

        Arrays.fill(dp,-1);

        int maxChori=chor(arr,n-1,dp);//n=-1

        System.out.println(maxChori);
    }
}
