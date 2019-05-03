package fasl1.tamrin18;
import java.util.Scanner;
public class Fasl1Tamrin18
{
public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        
        System.out.print("Enter First Number: ");
        int num1=obj.nextInt();
        
        System.out.print("Enter Second Number: ");
        int num2=obj.nextInt();
        
        System.out.println(num1+"+"+num2+"="+(num1+num2));
        System.out.println(num1+"-"+num2+"="+(num1-num2));
        System.out.println(num1+"*"+num2+"="+(num1*num2));
        System.out.println(num1+"/"+num2+"="+(num1/num2));
    }
    
}
