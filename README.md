import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("How many times should the number's digit concatenate itself?  ");
        int catLen = scanner.nextInt();

        int result = checkConcatenatedSum(num, catLen);
        System.out.println("If the number is concatenate with itself " + catLen + " times, #1 will appear. If not #0 will appear." + "\n\t\t\t" + result);
    }
   public static int checkConcatenatedSum(int num, int catLen){
        if(num <= 0 || catLen <= 0){
            return 0;
        }
        else{
            int originalNum = num;             //originalNum holds the original value of num
            int module = num % 10;             //module holds the last digit of num
            num = num / 10;                    //num is updated to the value of num without the last digit (module)
            int sum1 = 0;                      //sum1 holds the sum of digits of num
            int sum2 = 0;                      //sum2 holds the sum of digits of num concatenated with itself
            while(num != 0){                  //while loop to concatenate num with itself until it is 0
                for(int iterate=0; iterate<catLen; iterate++){
                                                        //for loop to concatenate num with itself
                    sum1 *= 10;                         //sum1 is multiplied by 10 to make space for the next digit
                    sum1 += module;                     //module is added to sum1 to concatenate it
                }
                sum2 += sum1;                           //sum1 is added to sum2 to concatenate it
                sum1 = 0;                               //sum1 is reset to 0 for the next iteration
                module = num % 10;                      //module is updated to the last digit of num
                num = num / 10;
            }
            for(int iterate=0; iterate<catLen; iterate++){
                                            //to concatenate num with itself for the last time to compare it with sum2
                sum1 *= 10;                 //to make space for the next digit in sum1
                sum1 += module;             //module is added to sum1 to concatenate it
            }
            sum2 += sum1;                  //sum1 is added to sum2 to concatenate it for the last time
            if(sum2 == originalNum){
                return 1;
            }
            else{
                return 0;
            }
        }
   }
}
