import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        int num = 44;
        String size;

        switch(num){
            
            case 20:
                size = "small";
                break;

            case 40:
                size = "medium";
                break;

            case 42:
                size = "large";
                break;

            case 44:
                size = "extra large";
                break;

            default:
                size = "Unknown";
                break;
        }

        System.out.println(size);


        // making a calculator

        System.out.println("***Basic Calculator***");

        char operator;
        Double num1, num2, result;

        Scanner input = new Scanner(System.in);

        System.out.print("Choose an operator: + , - , * , / :");
        operator = input.next().charAt(0);

        System.out.print("Enter first number: ");
        num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        num2 = input.nextDouble();


        switch(operator){

            case '+':
                result = num1 + num2;
                System.out.println(num1 + "+" + num2 + " = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println(num1 + "-" + num2 + " = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println(num1 + "*" + num2 + " = " + result);
                break;

            case '/':
                result = num1 / num2;
                System.out.println(num1 + "/" + num2 + " = " + result);
                break;

            default:
                System.out.println("Invalid Operator");
                break;

        }

        input.close();
        
    }
}
