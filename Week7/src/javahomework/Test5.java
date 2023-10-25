package javahomework;
/*Write a program for a calculator with addition, subtraction, multiplication, and division
methods all with parameters and use string concatenation methods. (Note: Two static
and Two instance methods.)*/

public class Test5 {


    public static void addition(int x, int y) {

        System.out.println("addition of " + x + " and " + y + " : " + (x + y));

    }

    public static void subtraction(int x, int y) {

        System.out.println("subtraction of " + x + " and " + y + " : " + (x - y));

    }

    public void multiplication(int x, int y) {

        System.out.println("Multiplication of " + x + " and " + y + " : " + (x * y));
    }

    public void Division(int x, int y) {

        System.out.println("Division of " + x + " and " + y + " : " + (x / y));
    }

    public static void main(String[] args) {
        addition(25, 65);
        subtraction(65, 25);
        Test5 t = new Test5();
        t.multiplication(15, 15);
        t.Division(15, 3);

    }
}
