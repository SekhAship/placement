interface a{
    void sound();
}
interface b{
    void display();
}
public class in2 implements a,b {
    public void sound(){

        System.out.println("Faaaaah!");
    }
    public void display(){
        System.out.println("display");
        
    }
   public static void main(String[] args) {
    in2 ob1=new in2();
    ob1.sound();
    ob1.display();
    
   } 
}
