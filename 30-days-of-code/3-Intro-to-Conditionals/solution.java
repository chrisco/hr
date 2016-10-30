import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans = "";

        // If 'n' is odd, print 'Weird'
        // If 'n' is even and in the inclusive range of 6 to 10, print 'Weird'
        // If 'n' is even and greater than 20, print 'Not Weird'
        // If 'n' is even and in the inclusive range of 2 to 5, print 'Not Weird'

        if (n % 2 == 1 || (n > 5 && n < 21)) {
            ans = "Weird";
        } else {
            ans = "Not Weird";
        }

        System.out.println(ans);
    }
}
