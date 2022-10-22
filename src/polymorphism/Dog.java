package polymorphism;

public class Dog  extends  Animal{
    public String a = "dog";
    Dog(String name, String voice){
        super(name,voice);
        System.out.println("Dog is called");
    }
    public void sound(){

        System.out.println("bow");
    }
}
