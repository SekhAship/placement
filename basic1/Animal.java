package basic2;

public class Animal {
    public String name="dog";
    protected int age=5;
    public void makeSound(){
        System.out.println("woof");
    }
    protected void showAge(){
        System.out.println("age is "+age);
    }
}
