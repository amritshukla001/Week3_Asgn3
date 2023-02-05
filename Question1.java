package assignment3;

@FunctionalInterface  
interface Calc {
    
    int cube(int value);
    
    default int square(int value){
        return (value*value);
    }
    
    default int add(int a, int b){
        return (a+b);
    }
    
    static int sub(int a, int b) {
        return (a-b);
    }
    
    static int mul(int a, int b) {
        return (a*b);
    }
    
    static int div(int a, int b) {
        return (a/b);
    }
}


public class Question1 {
    public static void main(String[] args) {
        
        Calc c = (int val)-> val*val*val;
        System.out.println("Cube : " + c.cube(5));
        System.out.println("Sum of 5 and 5 is: "+c.add(5, 5));
        System.out.println("Difference of 10 and 3 is: "+Calc.sub(10, 3));
        System.out.println("Multiplication of 10 and 20 is: "+Calc.mul(10, 20));
        System.out.println("Division of 3 and 1 is: "+Calc.div(3, 1));
        }
}