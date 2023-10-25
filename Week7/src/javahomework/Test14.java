/*Write a Java program to print the sum (addition), multiply, subtract, divide and
        remainder of two numbers.*/

package javahomework;

public class Test14 {
    public static void main(String[] args) {
        int num1=125, num2=24;
        int add=num1+num2;
        int sub=num1-num2;
        int mul=num1*num2;
        int div=num1/num2;
        int mod=num1%num2;


        System.out.println("125+24=" +add);

        // Calculate and print the difference of the two numbers
        System.out.println("125-24=" +sub);

        // Calculate and print the product of the two numbers
        System.out.println("125*24=" + mul);

        // Calculate and print the division of the two numbers
        System.out.println("125/24=" + div);

        // Calculate and print the remainder of the division of the two numbers
        System.out.println("125mod24=" + mod);
    }
}



