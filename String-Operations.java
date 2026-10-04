import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.println("\n--- String Operations ---");

        System.out.println("Length of first string: " + str1.length());
        System.out.println("Reverse of first string: " + new StringBuilder(str1).reverse());

        System.out.println("Concatenation: " + str1.concat(str2));

        if (str1.equals(str2))
            System.out.println("Both strings are equal.");
        else
            System.out.println("Both strings are not equal.");

        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());

        sc.close();OUTPUT
    }
}
OUTPUT:
Enter first string: Hello
Enter second string: World

--- String Operations ---
Length of first string: 5
Reverse of first string: olleH
Concatenation: HelloWorld
Both strings are not equal.
Uppercase: HELLO
Lowercase: hello

