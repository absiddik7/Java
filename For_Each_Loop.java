public class For_Each_Loop {
    public static void main(String[] args) {
        
        int[] numbers = {2,4,6,8};

        // for each loop
        for (int number: numbers){
            System.out.println(number);
        }

        // sum of arra elements
        
        int sum = 0;

        for(int number: numbers){
            sum += number;
        }
        System.out.println("sum = " + sum);


        // Difference between for loop and for-each loop
        // output will be same.

        char[] vowel = {'a','e','i','o','u'};

        // for loop
        for (int i = 0; i < vowel.length; ++i){
            System.out.println(vowel[i]);
        }

        // for-each loop
        for(char item: vowel){
            System.out.println(item);
        }


    }
}
