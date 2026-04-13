class Calculator{
    // method ------1
    int add(int a,int b){
       return a+b; 
    }
    int add(int a,int b,int c){
        return a+b+c;

    }
}

class Animal{
    void features(){
        System.out.println("Animal sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("barks");
    }
}

class Polymorphism {
    
    public static void main(String[] args) {
        // System.out.println("Hello");
        // Calculator c1=new Calculator();
        // Calculator c2=new Calculator();
        // System.out.println(c1.add(2,3));
        // System.out.println(c2.add(3,5,6));
        // Animal a =new Animal();
        Animal a=new Animal();
        a.features();

    }
    
} 