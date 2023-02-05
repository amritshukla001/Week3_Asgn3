package Question2;

@FunctionalInterface
interface MyInterface{
    Person getPerson(String Name , int age);
}
public class MethodRefs {
    public static void main(String[] args) {
        
        MyInterface obj = Person :: new;
        
        System.out.println("Person Name: " + obj.getPerson("Amrit Shukla" , 21).getName() + "\nAge: "+ obj.getPerson("Amrit Shukla" , 21).getAge());
    }
}