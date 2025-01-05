/*
 * This is a simple calculator class that performs basic arithmetic operations.
 * It has methods for addition, subtraction, multiplication, division, and modulo.
 */

public class Calculator {

    //constructor
    public Calculator() {
        System.out.println("Calculator constructor");
    }

    //addition
    public int add(int a, int b){
        return a + b;
    }

    //subtraction
    public int substract(int a, int b){
        return a - b;
    }

    //multiplication
    public int multiply(int a, int b){
        return a * b;
    }

    //division
    public int divide(int a, int b){
        if(b == 0){
            System.out.println("Error! Dividing by zero is not allowed.");
            return 0;
        } else {
            return a / b;
        }
    }

    //modulo
    public int modulo (int a, int b){
        return a % b;
    }

    //main method
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        
        System.out.println(myCalculator.add(5, 7));
        System.out.println(myCalculator.substract(45, 11));
        System.out.println(myCalculator.divide(45, 11));
        System.out.println(myCalculator.multiply(45, 11));
        System.out.println(myCalculator.modulo(45, 11));

    }

}
