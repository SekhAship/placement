////animal class
class Animal{
   
   int legs;
   String sound;
    void eat(){
        System.out.println("eating");
    }
    void Sound(){ 
    }
    // void sleep(){
    //     System.out.println("meow");
    // }
}
 class dog extends Animal{
    void Sound(){
        System.out.println("bark");
    }
 }
/// dog class extends animal
class cat extends Animal{
     void sound(){
        System.out.println("meow");
    }
}

/// cat class extend animl


class Inh{
    public static void main(String[] args) {
        
        cat c= new cat();///child class check
        c.sound();
        c.eat();
        
    }
} 