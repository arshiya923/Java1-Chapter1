package fasl1.tamrin1;
import java.util.Scanner;
public class Fasl1Tamrin1
{
public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        
        System.out.print("plz enter first number: ");
        int num1=obj.nextInt();
        
        System.out.print("plz enter second number: ");
        int num2=obj.nextInt();
        
        int sum=num1+num2;
        
        System.out.println(num1+"+"+num2+"="+sum);
    }
    
}
