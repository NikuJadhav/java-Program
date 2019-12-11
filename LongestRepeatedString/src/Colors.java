import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Colors
{

    public static void main(String args[]) 
    {
       prettyPrint(getRandomArray(9), 11);
    //   prettyPrint(getRandomArray(10), 12);
    }

    public static void printPairsUsingSet(int[] numbers, int n)
    {
        if(numbers.length < 2)
        {
            return;
        }       
        Set<Integer> set = new HashSet<Integer>(numbers.length);
        
        for(int value : numbers)
        {
            int target = n - value;
            
            // if target number is not in set then add
            if(!set.contains(target))
            {
                set.add(value);
            }
            else 
            {
                System.out.printf("(%d, %d)", value, target);
            }
        }
    }
    public static void prettyPrint(int[] random, int k)
    {
        System.out.println("Array-"+Arrays.toString(random));
        System.out.println("Sum : " + k);
     //   System.out.println(k);
        printPairsUsingSet(random, k);
    }
 
    public static int[] getRandomArray(int length){
        int[] randoms = new int[length];
        for(int i=0; i<length; i++){
            randoms[i] = (int) (Math.random()*15);
        }
        return randoms;
    }

}