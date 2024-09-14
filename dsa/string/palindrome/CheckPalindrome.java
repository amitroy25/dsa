package dsa.string.palindrome;
import java.util.Scanner;

class CheckPalindrome{
           
    public static boolean isPalindrome(String str){
 
        for(int i=0;i<str.length()/2;i++){
             if(str.charAt(i)!=str.charAt(str.length()-1-i))
             return false;
        }


   return true;
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String str=new String();
        
        System.out.println("enter a string");
        str=sc.next();

        System.out.println(isPalindrome(str));



    }
}