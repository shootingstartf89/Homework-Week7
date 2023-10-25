package javahomework;
//Write a Java Program using below steps.
// Declare your city as instance variables.
//Declare your country as static variables.
//Declare one instance method and call static variable in print statement
// Declare static method and call instance variable in print Statement.
//Call both user defined methods into main method.

public class Test17 { //global declaration
    String city = "Junagadh"; //instance variable
    static String country = "India"; // static variable

    public void m17() { //instance method and call static variable

        System.out.println(country);
    }

    public static void m171() { //static method and call instance variable

        Test17 t = new Test17();
        System.out.println(t.city);
    }

    public static void main(String[] args) { //Call both user defined methods into main method

        m171();
        Test17 t = new Test17();
        t.m17();

    }
}