import java.util.Arrays;
import java.util.OptionalDouble;


public class Test {



    //Finding sum of int array v
    public static int arraySumMethod(int[] intArray){
        int sum = 0;
        for (int value: intArray) {
            sum += value;
        }
        System.out.println(sum);
        return sum + ;

        }

        //Finding average of int array v
        public static OptionalDouble arrayAverageMethod(int[] intArray){
            System.out.println(Arrays.stream(intArray).average());
            return Arrays.stream(intArray).average();
        }

    }

