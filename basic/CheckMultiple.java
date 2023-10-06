/*create a function to check the given number is the mutiple of 3 and 5 */
package basic;
import java.util.*;

public class CheckMultiple {
    public static boolean ismultiple(int num){
        boolean p = false;
        if(num%3==0 && num%5==0) 
        p = true;
        return  p ;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check");
        int n = sc.nextInt();
        ismultiple(n);
        if(ismultiple(n)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
    
}
