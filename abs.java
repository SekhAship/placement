abstract class animal{
    animal(){
        System.out.println("abcd");
    }
    abstract void sound();
}
class dog extends animal{
    void sound(){
        System.out.println("dogggg");
    }
}


public class abs {
    void sound(){
        System.out.println("sssss");
    }
   public static void main(String[] args) {
    animal a=new dog();
    a.sound();
   } 
}
