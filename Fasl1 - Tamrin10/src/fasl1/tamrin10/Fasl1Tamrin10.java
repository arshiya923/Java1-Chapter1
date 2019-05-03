package fasl1.tamrin10;
import java.util.Scanner;
public class Fasl1Tamrin10
{
public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        
        System.out.print("plz enter a number; ");
        double a=obj.nextDouble();
        
        System.out.print("plz enter b number: ");
        double b=obj.nextDouble();
        
        double x=-b/a;
        
        System.out.println("x= "+x);
    }
    
}