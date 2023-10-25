package javahomework;

// Write a Java programme using the following steps:
//1.1 Declare two instance variables.
//1.2 Declare one instance method.
//1.3 Call both instance variables into the instance method inside the print statement.
//1.4 Declare the Main method.
//1.5 Call the above instance method into the Main method and run the programme.
public class Test1 {   // Global declaration
    String name = "Pankti"; // instance variable
    int studentID = 21245; // instance variable

    public void m1() { // instance method
        System.out.println(name);
        System.out.println(studentID);


    }
public static void main(String[]args) { // Call instance method into the Main method
        Test1 t = new Test1();
        t.m1();

}
}