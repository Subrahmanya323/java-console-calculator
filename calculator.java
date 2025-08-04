import java.util.*;
class calculator{
    public static double add(double a,double b){
        return a+b;
    }
    public static double subtract(double a,double b){
        return a-b;
    }
    public static double multiply(double a,double b){
        return a*b;
    }
    public static double divide(double a, double b){
        if(b==0){
            System.out.println("Error: Division by Zero is not allowed.");
            return 0;
        }
        return a/b;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        boolean run=true;
        while(run){
            System.out.println("\n=== welcome to the calculator ===");
            System.out.println("Choose an operator: +, -, *, /");
            char operator=scanner.next().charAt(0);
            System.out.print("Enter first number: ");
            double num1=scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2=scanner.nextDouble();
            switch(operator){
                case '+':
                    System.out.println("result: " + add(num1,num2));
                    break;
                case '-':
                    System.out.println("result: " + subtract(num1,num2));
                    break;
                case '*':
                    System.out.println("result: " + multiply(num1,num2));
                    break;
                case '/':
                    System.out.println("result: " + divide(num1,num2));
                    break;
                default:
                    System.out.println("Invalid operator please try again.");
                    continue;
            }
            System.out.print("Do you want to perform another calculation (yes/no):");
            String response=scanner.next();
            if(response.equalsIgnoreCase("no")){
                run=false;
            }
        }
        System.out.println("Thank you for using the calculator!");
        scanner.close();
    }
}