package javahomework;
//Write a Java programme using the following steps.
//3.1 Declare one instance and one static variable.
//3.2 Declare one instance method.
//3.3 Declare one static method.
// 3.4 Call both instance and static variables into both instance and static methods inside the
//print statement.
// 3.5 Declare the Main method.
//3.6 Call both instance and static methods into the Main method and run the programme.

public class Test3 { //global declaration
    String name = "Pankti"; //instance variable
    static int studentID = 21245; //static variable

public void m3() { //instance method
        System.out.println(name);
        System.out.println(studentID);
}
    public static void m31() { //static method
        Test3 t =new Test3();
        t.m3();
        System.out.println(studentID);
}
    public static void main(String[]args) { //Call both instance and static methods into the Main method

        m31();
        Test3 t =new Test3();
        t.m3();

    }
}



