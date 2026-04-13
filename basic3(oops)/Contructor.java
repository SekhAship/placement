class Student{
    String name;
    int age;
    int classes;
    //default constructor
    // Student(){
    //     name="unknown";
    //     age=0;
    //     class=8;
    //     System.out.println("student");
    // }

    // Student(String name,int age){
    //     this.name=name;
    //     this.age=age;
    // }

    Student(Student s){
        this.name=s.name;
        this.age=s.age; 
    }

    void display(){
        System.out.println(name+" "+age +" "+classes);
    }
    Student(String name ,int age, int classes){
       this.name = name;
       this.age= age;
       this.classes=classes;

    }
}


public class Contructor {
    public static void main(String[] args){
        // System.out.print("Hello World");
        // Student s1=new Student("Alice", 20);
        // Student s2=new Student();
        // Student s3=new Student(s1);
        // s1.display();
        // s2.display();
        // s3.display();
        Student s4= new Student("Nilofar",21,8);
        s4.display();
    }
}
