import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {

        /*
            What are Methods?

            Methods are a collection of statements grouped
            together to perform an operation.

            Why do we want to use Methods:
            1) Reusable code
            2) Top-down programming - breaking you problem down into smaller chunks
            3) Simplify and organize your code - easier for testing

         */

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = keyboard.nextInt();

        System.out.println("Enter number 2: ");
        int num2 = keyboard.nextInt();

        // Call method
        int result = AddTwoNumbers(num1, num2);

        System.out.println(result);
    }

    // This method returns an "int"
    public static int AddTwoNumbers(int number1, int number2){ // method header
        // method body
        int sum = 0;
        sum = number1 + number2;
        return sum;
    }

    public static int AddTwoNumbers(int number1){ // overloaded method
        // method body
        int sum=0;
        return sum;
    }

    /* Method Structure
        public static - access type, modifier
        int - return type
        AddTwoNumbers - method name
        num1, num2 - parameters
        method body - series of statements that defines what the method does

     */

}
