package javahomework;
//Write a Java Program using below steps.
// Declare your council name as static variables.
//Declare your house number as instance variables.
// Declare one instance method name borough() and call Static variable
// Declare static method name address() and call instance variable
// Call both user defined methods into main method.

public class Test18 {
    static String councilname = "Threeriver"; //static variable
    int housenum = 79; //instance variable

    public void borough() // instance method
    {
        System.out.println(councilname);//call Static variable
    }

    public static void address() // static method
    {
        Test18 t = new Test18();
        System.out.println(t.housenum);// call instance variable
    }

    public static void main(String[] args) { // Call both user defined methods into main method.

        address();
        Test18 t = new Test18();
        t.borough();
    }
}