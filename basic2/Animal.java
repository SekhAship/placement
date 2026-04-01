package basic2;

//make subclass of animal
////////
class dog extends Animal{
    
    protected void bark(){
        System.out.println("bow bow");
    }
}

public class Animal {
    
    public String name="dog";
    public int age=5;
   
    
    public void makeSound(){
        System.out.println("woof");
    }
    public void showAge(){
        System.out.println("age is "+age);
    }

}
