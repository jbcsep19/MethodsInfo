import java.util.Scanner;

public class Step2 {
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

        // Call method
        promptUser();

        System.out.println("End of main method");
    }

    // This method doesn't return anything. Hence "void"
    public static void promptUser(){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = keyboard.nextInt();

        System.out.println("Enter number 2: ");
        int num2 = keyboard.nextInt();

        int result = AddTwoNumbers(num1, num2);
        System.out.println(result);
        System.out.println("End of promptUser method");
    }


    // This method returns an "int"
    public static int AddTwoNumbers(int num1, int num2){ // method header
        // method body
        int sum = 0;
        sum = num1 + num2;
        System.out.println("End of addTwoNumbers method");

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
