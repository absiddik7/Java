import java.util.Scanner;

public class BasicJava{
    public static void main(String[] args){
        

        // data types
        int speedLimit = 80;
        float fraction = 2.5f;
        double doubleNum = 2.5;
        char c = 'f';
        char letter = '\u0051'; // it is Q
        String str = "Hello programmer";
        boolean flag1 = true;
        long total = -40030303298L;
        byte range = 124; // byte data types. range -128 to 127, 8 bit integer.
        short temperature = -200; // short data types. range -32768 to 32767, 16 bit integer.

        System.out.println("fraction = " + fraction);
        System.out.println(doubleNum);
        System.out.println(str);
        System.out.println(flag1);
        System.out.println(letter); // prints Q

        // Java Ternary Operator
        int februaryDays = 29;
        String result;
        result = (februaryDays == 28) ? "Not a leap year" : "leap year";
        System.out.println(result);


        // user input
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = input.nextInt();
        System.out.println("You entered = " + number);
        
        System.out.print("Please enter a float number: ");
        float floatNum = input.nextFloat();
        System.out.println("You entered = " + floatNum);

        System.out.print("Please enter a string: ");
        String word = input.next();
        System.out.println("You entered = " + word);



        // if..else statement
        int marks = 90;

        if (marks > 80){
            System.out.println("You got grade A");
        } else{
            System.out.println("You did not get grade A");
        }


        input.close();

    }
}
