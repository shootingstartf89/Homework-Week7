//Write a Java program that takes as a number as input and prints its multiplication
package javahomework;

public class Test10 {
    public static void main(String [] args) {
        int num=8;

        for (int i = 0; i < 10; i++) {
            System.out.println(num + " x " + (i + 1) + " = " + (num * (i + 1)));
        }
    }
}
