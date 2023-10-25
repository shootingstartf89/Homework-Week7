package javahomework;
//Write a Java Program using below steps.
//Declare your Spain as static variable.
//Declare your United Kingdom as instance variable.
//Declare instance method name homeCountry()and call static variable.
//Declare static method name holidays() and call instance variable
//Call both methods in main method.

public class Test20 {  //global declaration
    static String country1= "Spain"; // static variable
           String country2="United Kingdom"; // instance variable
    public void  homeCountry()  //instance method name homeCountry()and call static variable.
    {
        System.out.println (country1);
    }
    public static void holidays() //static method name holidays() and call instance variable
    {
       Test20 t=new Test20();
       System.out.println(t.country2);
    }
    public static void main(String[] args) { // Call both user defined methods into main method.

        holidays();
        Test20 t = new Test20();
        t.homeCountry();
    }


    }
