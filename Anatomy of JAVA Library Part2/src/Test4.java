/*Title: How long is your Burp?
Ask the user to enter an integer (burp lenght)
Depending on the input provided "Burp" will be produced
exmaple: 5: Burrrrrp
25: Burrrrrrrrrrrrrrrrrrrrrrrrrp
40: Burrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrp
Input can be any random number
 */

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How long is your burp?");
        int burplength = sc.nextInt();

        String msg="";
        for(int i=1; i<=burplength; i++){
            msg= msg+"r";

        }
        System.out.println("Bu"+msg+"p");
    }
}
