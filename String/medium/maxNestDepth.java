package String.medium;

// public class maxNestDepth {
//     public static void main(String[] args) {
//         String  s = "(1+(2*3)+((8)/4))+1";
//         char[] arr=s.toCharArray();
//         int count=0;
//         int maxcount=0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]=='('){
//                 count++;
//                 maxcount=Math.max(maxcount,count);
//             }else if(arr[i]==')'){
//                 count--;
//             }
//         }
//         System.out.println(maxcount);
//     }
// }

///////////////////////////////////////////////////////////////////////
public class maxNestDepth {
public static void main(String[] args) {
    String  s = "(1+(2*3)+((8)/4))+1";
    int count=0;
    int maxcount=0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
            count++;
            maxcount=Math.max(maxcount,count);
        }else if(s.charAt(i)==')'){
            count--;
        }
    }
    System.out.println(maxcount);
}
}
