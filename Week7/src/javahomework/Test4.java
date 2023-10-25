package javahomework;
//Write a Java programme using the following steps.
// Declare two instance and two static variables.
// Declare one instance method.
// Declare one static method.
//Call all four instance and static variables into both instance and static methods inside the
//print statement.
// Declare the Main method.
// Call both instance and static methods into the Main method and run the programme.

public class Test4 { // global declaration
    String name = "Pankti"; //instance variable
    String surname = "Nanavati"; //instance variable
    static int studentID = 21245; //static variable
    static int birthdate = 1578; //static variable

public void m4() { //instance method
    System.out.println(name);
    System.out.println(surname);
    System.out.println(studentID);
    System.out.println(birthdate);
}
    public static void m41() { //static method
        Test4 t =new Test4();
        System.out.println(t.name);
        System.out.println(t.surname);
        System.out.println(studentID);
        System.out.println(birthdate);

    }
    public static void main(String[]args) { //Call both instance and static methods into the Main method

        m41();
        Test4 t =new Test4();
        t.m4();

    }

    }

