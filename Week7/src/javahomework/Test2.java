package javahomework;
//Write a Java programme using the following steps.
// 2.1 Declare two static variables.
// 2.2 Declare one static method.
//2.3 Call both static variables into the static method inside the print statement.
//2.4 Declare the Main method.
//2.5 Call the static method into the Main method and run the programme.
public class Test2 { //global declaration
   static String name = "Pankti"; //static variable
   static int studentID = 21245; //static variable

    public static void m2() { //static method
        System.out.println(name);
        System.out.println(studentID);


    }
    public static void main(String[]args) { //Call the static method into the Main method

        m2();

    }
}

