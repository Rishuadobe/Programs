import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        int t=s.length();

        int count1=function(s,s.length());
   
 

        if (n%t==0)
        {
            return (n/t)*count1;
        }
        else
        {
            return (n/t)*count1+ function(s,n%t);
        }
    }
    static int function(String s, long t)
        {
            int count=0;
            for (int i=0;i<t;i++)
            {
            if (s.charAt(i)=='a')
            {
                count=count+1;
            }
            }
        return count;
        }
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
