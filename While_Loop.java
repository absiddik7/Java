import java.util.Scanner;
public class While_Loop {
    public static void main(String[] args) {
        
        int a = 1, n = 5;

        while(a <= n){
            System.out.println(a);
            a++;
        }

        // sum of positive numbers

        int sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        while(number >= 0){
            sum += number;

            System.out.println("Enter a number:");
            number = input.nextInt();

        }

        System.out.println("Sum = " + sum);
        input.close();


    }
}
