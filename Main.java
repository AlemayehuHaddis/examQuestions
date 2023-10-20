import java.util.Arrays;

class IsDivisible {
    public static void main(String[] args) {
        int[] array = {24, 42, 6, 36};
        int divisor = 6;
        int result = isDivisible(array, divisor);
        if (result == 1) {
            System.out.println("Yes," + "\n" + divisor + " is the divisor of all elements of the array");
        } else {
            System.out.println("SORRY" + "\n" + divisor + "\n is not the divisor of the array");
        }
    }



// SOLUTION 1

    static int isDivisible(int[] array, int divisor) {

        for (int element : array) {
            if (element % divisor != 0) {
                return 0;
            }
        }
        return 1;
    }


// SOLUTION 2
//        static int isDivisible(int[] array, int divisor) {
//            int isDivisor = 0;
//            for (int i = 0; i < array.length; i++) {
//                if (array[i] % divisor != 0) {
//                    isDivisor = 0;
//                } else {
//                   isDivisor = 1;
//                }
//            }
//            return isDivisor;
//        }


// SOLLUTION 3
    // return Arrays.stream(array).allMatch(element -> element % divisor == 0) ? 1 : 0;


    // Arrays.stream(array)
    //               creates a stream of elements from the array
    //
    // .allMatch()
    //              returns true if all elements of the stream much the given predicate,
    //              the lambda expression that checks if the element is divisible by the divisor.
    //
    // (element -> element %divisor == 0)
    //                   predicts that the elements of the stream are divisible by the divisor;
    //
    // ? 1 : 0 - if the elements are divisible by the divisor, returns 1, which is equivalent to

            /*
                                    if(Arrays.stream(array).allMatch(element -> element % divisor == 0)){
                                        return 1;
                                    } else{
                                        return 0;
                                    }
             */


    // The method returns 1, if all elements of the array are divisible by the divisor; Otherwise returns = 0;

}