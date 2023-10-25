//Write a Program which replace a “I@love@java” to “we love java”
package stringhomework;

public class Test6 {
    public static void main(String[] args) {
    String str = "I@love@Java";
    String new_str = str.replaceAll("I@love@", "We love ");
        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str);
}
}