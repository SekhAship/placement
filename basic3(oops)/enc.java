class student{
    public String name;
    private int age;
    public  String email;
    private String password;

    
    //setter 
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }

     public void setEmail(String email){
        this.email=email;
    }
     public void setPassword(String password){
        this.password= password;
    }
     //getter
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }

}
public class enc {
    public static void main(String[] args) {
        student s=new student();
        s.setName("nillu");
        s.setAge(21);
        s.setEmail("nilofarbano171@gmail.com");
         s.setPassword("N@18");
        System.out.println("name: "+s.getName());
        System.out.println("age: "+s.getAge());
         System.out.println("email: "+s.getEmail());
          System.out.println("password: "+s.getPassword());
    }
}