import java.util.Scanner;
public class Calculator {
    public void addNumbers(int a, int b){
        System.out.println("Sum is: "+(a+b));
    }

public static void main(String[] args){
    int a,b;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter first number");
    a = sc.nextInt();

    System.out.println("Enter second number");
    b = sc.nextInt();
    
    Calculator sum = new Calculator();
    sum.addNumbers(a,b);
}
}

