package fasl1.tamrin12;
import java.util.Scanner;
public class Fasl1Tamrin12
{
public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        
        System.out.print("plz enter A number: ");
        int a=obj.nextInt();
        
        System.out.print("plz enter B number: ");
        int b=obj.nextInt();
        
        int x=a;
        a=b;
        b=x;
        
        System.out.println("A: "+a+"\nB: "+b);
    }
    
}