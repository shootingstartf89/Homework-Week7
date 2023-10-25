package javahomework;
//Write a Java Program using below steps.
//Declare one of your group member names as instance variable.
// Declare one of your group member names as static variable.
//Declare one instance method name with group name (e.g. selenium())and call both global
//variables.
//Declare static method name agile() and call both variable
// Call both user defined methods into main method.

public class Test19 { // Global declaration
    String name1 = "Zarna";// instance variable
    static String name2 = "Ayan";// static variable

    public void code2() {  //instance method name with group name and call both global variables.
        String name3 = "Miten"; //Local variable
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

    }

    public static void agile() { //static method name agile() and call both variable
        String name4 = "Sonal";
        Test19 t = new Test19();
        System.out.println(t.name1);
        System.out.println(name2);
        System.out.println(name4);
    }

    public static void main(String[] args) { // Call both user defined methods into main method.

        agile();
        Test19 t = new Test19();
       t.code2();


        {
        }


    }
}