package fasl1.tamrin9;
import java.util.Scanner;
public class Fasl1Tamrin9
{
public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        
        System.out.print("plz enter the r: ");
        double r=obj.nextDouble();
        
        double area=3.14*r*r;
        double mohit=3.14*r*2;
        
        System.out.println("the area is: "+area);
        System.out.println("the mohit is: "+mohit);
    }
    
}