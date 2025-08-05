import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here

            long minNum= arr.get(0); /* assume first element as maxium and minimum value */
            long  maxNum= arr.get(0);
            long sum= arr.get(0);
            
             for(int i= 1;i<arr.size();i++){
                long currentNum = arr.get(i); /* here start loop to get total sum of arraylist */
                sum+=currentNum;
                
                if(currentNum>maxNum){
                    maxNum= currentNum; /* comparing the current value of arraylist with the assume value and assign value accordingly to if condition */
                }
                 else if(currentNum<minNum){
                    minNum=currentNum;  /*comparing the current value of arraylist with assume value and then assign value accordingly to minNum */
                }
             }
             
             long maxValue = sum-minNum;
             long minValue = sum-maxNum;
             
             System.out.println(minValue+" "+ maxValue);
    }

}

public class MinMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
