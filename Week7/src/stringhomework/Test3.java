//Write a Program to replace "I love Java" to "We love Java"
package stringhomework;

public class Test3 {
    public static void main(String[] args) {
        String str = "I love Java";
        String new_str = str.replaceAll("I", "We");
        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str);

    }
}